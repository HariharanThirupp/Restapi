package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String UserName;
    String Email;
    String EmailPassword;
    int PhoneNum;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getEmailPassword() {
        return EmailPassword;
    }
    public void setEmailPassword(String emailPassword) {
        EmailPassword = emailPassword;
    }
    public int getPhoneNum() {
        return PhoneNum;
    }
    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    
}
