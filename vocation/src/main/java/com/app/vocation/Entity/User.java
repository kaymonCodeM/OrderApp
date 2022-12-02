package com.app.vocation.Entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String username;
    private String password;
    private boolean active;
    private String roles;

    @OneToOne(mappedBy = "user")
    private UserInfo UserInfo;


    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public com.app.vocation.Entity.UserInfo getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(com.app.vocation.Entity.UserInfo userInfo) {
        UserInfo = userInfo;
    }
}
