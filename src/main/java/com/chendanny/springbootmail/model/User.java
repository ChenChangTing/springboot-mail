package com.chendanny.springbootmail.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer userId;
    private String email;

    @JsonIgnore//隱藏
    private String password;

    private Date createdDate;
    private Date lastModifiedDate;
}
