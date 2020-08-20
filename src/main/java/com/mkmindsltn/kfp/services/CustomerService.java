package com.mkmindsltn.kfp.services;

import com.mkmindsltn.kfp.api.data.CustomerDTO;

public interface CustomerService {

    CustomerDTO findCustomerByUserName(String userName);
    CustomerDTO createCustomer(CustomerDTO customerDTO);


}
