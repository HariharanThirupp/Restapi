package com.example.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String UserName;
    String Email;
    int PhoneNum;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    List<Booked> bk;
    
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
    public int getPhoneNum() {
        return PhoneNum;
    }
    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }
    public List<Booked> getBk() {
        return bk;
    }
    public void setBk(List<Booked> bk) {
        this.bk = bk;
    }

    
}
