package com.tam.pop.model;


public class User {

    private Integer id;

    private String internalId;

    public User(User user) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    private String firstName;
    private String gender;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
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

    public User(Integer id, String firstName, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.gender = gender;
    }
}

