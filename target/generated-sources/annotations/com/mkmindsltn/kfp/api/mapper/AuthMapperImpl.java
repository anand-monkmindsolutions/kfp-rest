package com.mkmindsltn.kfp.api.mapper;

import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import com.mkmindsltn.kfp.models.Authenticate;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-17T20:45:19+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.6 (Ubuntu)"
)
@Component
public class AuthMapperImpl implements AuthMapper {

    @Override
    public AuthenticateDTO authenticateToAuthDTO(Authenticate authenticate) {
        if ( authenticate == null ) {
            return null;
        }

        AuthenticateDTO authenticateDTO = new AuthenticateDTO();

        authenticateDTO.setUsername( authenticate.getUsername() );
        authenticateDTO.setPassword( authenticate.getPassword() );

        return authenticateDTO;
    }

    @Override
    public Authenticate authDTOtoAuthenticate(AuthenticateDTO authenticateDTO) {
        if ( authenticateDTO == null ) {
            return null;
        }

        Authenticate authenticate = new Authenticate();

        authenticate.setUsername( authenticateDTO.getUsername() );
        authenticate.setPassword( authenticateDTO.getPassword() );

        return authenticate;
    }
}
