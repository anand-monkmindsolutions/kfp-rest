package com.mkmindsltn.kfp.services;


import com.mkmindsltn.kfp.api.data.CustomerDTO;
import com.mkmindsltn.kfp.api.mapper.CustomerMapper;
import com.mkmindsltn.kfp.models.Customer;
import com.mkmindsltn.kfp.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerDTO findCustomerByUserName(String userName) {
        return customerMapper.customerToCustomerDTO(
                customerRepository.findCustomerByUserName(userName));
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return saveAndReturnCustomerDTO(customerMapper.customerDTOToCustomer(customerDTO));
    }


    private CustomerDTO saveAndReturnCustomerDTO(Customer customer){
        Customer savedCustomer=customerRepository.save(customer);
        return customerMapper.customerToCustomerDTO(savedCustomer);
    }
}
