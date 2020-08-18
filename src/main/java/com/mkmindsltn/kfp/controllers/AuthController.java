package com.mkmindsltn.kfp.controllers;

import com.mkmindsltn.kfp.api.data.AuthenticateDTO;
import com.mkmindsltn.kfp.services.AuthenticateService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(AuthController.BASE_URL)
public class AuthController {

    public static final String BASE_URL="api/v1/login" ;
    private final AuthenticateService authenticateService;

    public AuthController(AuthenticateService authenticateService) {

        this.authenticateService = authenticateService;
    }


    @GetMapping("/{usrName}")
    @ResponseStatus(HttpStatus.OK)
    public AuthenticateDTO findByUser(@PathVariable String usrName){
        return authenticateService.getDTObyUserName(usrName);
    }

    @PostMapping("/adduser")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthenticateDTO saveAuth(@RequestBody AuthenticateDTO authenticateDTO){
        return authenticateService.createAuth(authenticateDTO);
    }


}
