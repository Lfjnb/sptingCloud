package com.jk.model;


import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -4818080251454138253L;
    private Integer  userId;
    private  String  userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
