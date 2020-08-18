package com.mkmindsltn.kfp.models;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "userName")
    private String userName;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "eMail")
    private String eMail;

}
