package com.mkmindsltn.kfp.controllers;

import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import com.mkmindsltn.kfp.api.data.CustomerDTO;
import com.mkmindsltn.kfp.models.Customer;
import com.mkmindsltn.kfp.services.AuthenticateService;
import com.mkmindsltn.kfp.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(AuthController.BASE_URL)
public class AuthController {

    public static final String BASE_URL="api/v1/login" ;
    private final AuthenticateService authenticateService;
    private final CustomerService customerService;

    public AuthController(AuthenticateService authenticateService, CustomerService customerService) {

        this.authenticateService = authenticateService;
        this.customerService = customerService;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO findByUser(@RequestBody AuthenticateDTO authenticateDTO){
        if (authenticateService.loginAuth(authenticateDTO).equals(true)) {
            System.out.println("true");
            return customerService.findCustomerByUserName(authenticateDTO.getUsername());
        }
        else {
            return null;
        }
    }


    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthenticateDTO saveAuth(@RequestBody AuthenticateDTO authenticateDTO){
        return null;
    }


}
