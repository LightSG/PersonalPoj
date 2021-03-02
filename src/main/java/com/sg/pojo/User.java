package com.sg.pojo;/*
@author:
@createTime:
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Alias("User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String userName;
    private String password;
    private String phone;
    private String apartment;
    private String  email;
    private String authority;
    private Timestamp lastLoginTime;
    private Timestamp createTime;
}
