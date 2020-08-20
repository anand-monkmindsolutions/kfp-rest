package com.mkmindsltn.kfp.repositories;

import com.mkmindsltn.kfp.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

    Customer findCustomerByUserName(String userName);

}
