package com.mkmindsltn.kfp.models;
import lombok.Data;

import javax.persistence.Entity;


@Data
@Entity
public class Address extends BaseEntity{

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String district;
    private String pinCode;
}
