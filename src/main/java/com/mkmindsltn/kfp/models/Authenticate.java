package com.mkmindsltn.kfp.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Authenticate extends BaseEntity{

    private String username;
    private String password;

}
