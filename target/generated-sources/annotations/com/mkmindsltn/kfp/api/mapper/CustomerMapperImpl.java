package com.mkmindsltn.kfp.api.mapper;

import com.mkmindsltn.kfp.api.data.AddressDTO;
import com.mkmindsltn.kfp.api.data.CustomerDTO;
import com.mkmindsltn.kfp.models.Address;
import com.mkmindsltn.kfp.models.Customer;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-20T19:23:40+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.6 (Ubuntu)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerToCustomerDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setFirstName( customer.getFirstName() );
        customerDTO.setLastName( customer.getLastName() );
        customerDTO.setUserName( customer.getUserName() );
        customerDTO.setDateOfBirth( customer.getDateOfBirth() );
        customerDTO.setGender( customer.getGender() );
        customerDTO.setMobileNumber( customer.getMobileNumber() );
        customerDTO.setEMail( customer.getEMail() );
        customerDTO.setAddress( addressToAddressDTO( customer.getAddress() ) );

        return customerDTO;
    }

    @Override
    public Customer customerDTOToCustomer(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setFirstName( customerDTO.getFirstName() );
        customer.setLastName( customerDTO.getLastName() );
        customer.setUserName( customerDTO.getUserName() );
        customer.setDateOfBirth( customerDTO.getDateOfBirth() );
        customer.setGender( customerDTO.getGender() );
        customer.setMobileNumber( customerDTO.getMobileNumber() );
        customer.setEMail( customerDTO.getEMail() );
        customer.setAddress( addressDTOToAddress( customerDTO.getAddress() ) );

        return customer;
    }

    @Override
    public AddressDTO addressToAddressDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setAddressLine1( address.getAddressLine1() );
        addressDTO.setAddressLine2( address.getAddressLine2() );
        addressDTO.setAddressLine3( address.getAddressLine3() );
        addressDTO.setDistrict( address.getDistrict() );
        addressDTO.setPinCode( address.getPinCode() );

        return addressDTO;
    }

    protected Address addressDTOToAddress(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddressLine1( addressDTO.getAddressLine1() );
        address.setAddressLine2( addressDTO.getAddressLine2() );
        address.setAddressLine3( addressDTO.getAddressLine3() );
        address.setDistrict( addressDTO.getDistrict() );
        address.setPinCode( addressDTO.getPinCode() );

        return address;
    }
}
