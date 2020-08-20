package com.mkmindsltn.kfp.api.data;


import com.mkmindsltn.kfp.models.Gender;
import lombok.Data;

import java.sql.Date;

@Data
public class CustomerDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private Date dateOfBirth;
    private Gender gender;
    private String mobileNumber;
    private String eMail;
    private AddressDTO address;


}
