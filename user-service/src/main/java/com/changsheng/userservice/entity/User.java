package com.changsheng.userservice.entity;

import java.io.Serializable;

/**
 * 用户(User)实体类
 *
 * @author makejava
 * @since 2020-09-09 17:50:00
 */
public class User implements Serializable {
    private static final long serialVersionUID = -46883536363179061L;
    
    private String id;
    
    private String username;
    
    private String password;
    
    private String email;
    
    private Long phone;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

}