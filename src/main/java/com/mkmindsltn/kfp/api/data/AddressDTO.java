package com.mkmindsltn.kfp.api.data;


import lombok.Data;

@Data
public class AddressDTO {

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String district;
    private String pinCode;
}
