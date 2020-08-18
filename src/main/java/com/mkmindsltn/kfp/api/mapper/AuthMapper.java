package com.mkmindsltn.kfp.api.mapper;


import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import com.mkmindsltn.kfp.models.Authenticate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AuthMapper {
    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);
    AuthenticateDTO authenticateToAuthDTO(Authenticate authenticate);
    Authenticate authDTOtoAuthenticate(AuthenticateDTO authenticateDTO);
}
