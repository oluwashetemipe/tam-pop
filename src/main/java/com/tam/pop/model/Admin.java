package com.tam.pop.model;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Admin {
    private String id;
    private String firstName;
    private String gender;
    private String uid;
    private String username;
    private String email;
    private String password;
    private int role;
    public boolean enabled;
    private String token;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
