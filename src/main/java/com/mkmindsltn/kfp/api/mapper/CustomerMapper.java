package com.mkmindsltn.kfp.api.mapper;
import com.mkmindsltn.kfp.api.data.AddressDTO;
import com.mkmindsltn.kfp.api.data.CustomerDTO;
import com.mkmindsltn.kfp.models.Address;
import com.mkmindsltn.kfp.models.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);

    AddressDTO addressToAddressDTO(Address address);




}
