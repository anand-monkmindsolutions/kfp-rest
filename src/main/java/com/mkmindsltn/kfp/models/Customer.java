package com.mkmindsltn.kfp.models;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Customer extends Person{


    @ManyToOne
    private Address address;

}
