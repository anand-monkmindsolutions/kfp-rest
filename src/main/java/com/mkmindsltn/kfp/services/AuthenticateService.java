package com.mkmindsltn.kfp.services;


import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import com.mkmindsltn.kfp.api.data.CustomerDTO;

public interface AuthenticateService {
    AuthenticateDTO getDTObyUserName(String usrName);
    Boolean loginAuth(AuthenticateDTO authenticateDTO);
}
