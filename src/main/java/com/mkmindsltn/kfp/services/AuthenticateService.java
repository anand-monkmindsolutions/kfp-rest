package com.mkmindsltn.kfp.services;


import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import org.springframework.stereotype.Service;

public interface AuthenticateService {
    AuthenticateDTO getDTObyUserName(String usrName);
    AuthenticateDTO createAuth(AuthenticateDTO authenticateDTO);
}
