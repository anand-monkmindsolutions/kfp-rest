package com.mkmindsltn.kfp.models;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Customer extends Person{


    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
