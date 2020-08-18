package com.mkmindsltn.kfp.services;

import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import com.mkmindsltn.kfp.api.mapper.AuthMapper;
import com.mkmindsltn.kfp.models.Authenticate;
import com.mkmindsltn.kfp.repositories.AuthRepository;
import org.springframework.stereotype.Service;


@Service
public class AuthenticateServiceImpl implements AuthenticateService {

    private final AuthRepository authRepository;
    private final AuthMapper authMapper;

    public AuthenticateServiceImpl(AuthRepository authRepository, AuthMapper authMapper) {
        this.authRepository = authRepository;
        this.authMapper = authMapper;
    }

    @Override
    public AuthenticateDTO getDTObyUserName(String usrName) {
        return authMapper.authenticateToAuthDTO(authRepository.findByUsername(usrName));

    }

    @Override
    public AuthenticateDTO createAuth(AuthenticateDTO authenticateDTO) {
       return saveAndReturnDTO(authMapper.authDTOtoAuthenticate(authenticateDTO));
    }

    public AuthenticateDTO saveAndReturnDTO(Authenticate authenticate){
        Authenticate saveAuthenticate=authRepository.save(authenticate);
        return authMapper.authenticateToAuthDTO(saveAuthenticate);
    }
}
