package com.swit.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class User {
    private int userId;

    @Pattern(regexp = "^[\\u4e00-\\u9fff\\w]{1,16}$")
    private String username;

    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$")
    private String password;
    private String email;

    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$")
    private String phonenumber;
    private String birthday;

    public User(int userId, String username, String password, String email, String phonenumber, String birthday) {
        this(password,phonenumber);
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.birthday = birthday;
    }

    public User(String username, String password, String phonenumber) {
        this(password,phonenumber);
        this.username = username;
    }

    public User(String password, String phonenumber) {
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
