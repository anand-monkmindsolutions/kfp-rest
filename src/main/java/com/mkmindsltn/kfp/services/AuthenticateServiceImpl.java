package com.mkmindsltn.kfp.services;

import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import com.mkmindsltn.kfp.api.mapper.AuthMapper;
import com.mkmindsltn.kfp.models.Authenticate;
import com.mkmindsltn.kfp.models.Customer;
import com.mkmindsltn.kfp.repositories.AuthRepository;
import com.mkmindsltn.kfp.repositories.CustomerRepository;
import org.springframework.stereotype.Service;


@Service
public class AuthenticateServiceImpl implements AuthenticateService {

    private final AuthRepository authRepository;
    private final AuthMapper authMapper;
    private final CustomerRepository customerRepository;

    public AuthenticateServiceImpl(AuthRepository authRepository, AuthMapper authMapper, CustomerRepository customerRepository) {
        this.authRepository = authRepository;
        this.authMapper = authMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public AuthenticateDTO getDTObyUserName(String usrName) {
        return authMapper.authenticateToAuthDTO(authRepository.findByUsername(usrName));

    }

    @Override
    public Boolean loginAuth(AuthenticateDTO authenticateDTO) {
        Authenticate auth=authRepository.findByUsername(authenticateDTO.getUsername());
        if(auth.getPassword().equals(authenticateDTO.getPassword())){
            System.out.println(true);
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }
    }

    public AuthenticateDTO saveAndReturnDTO(Authenticate authenticate){
        Authenticate saveAuthenticate=authRepository.save(authenticate);
        return authMapper.authenticateToAuthDTO(saveAuthenticate);
    }
}
