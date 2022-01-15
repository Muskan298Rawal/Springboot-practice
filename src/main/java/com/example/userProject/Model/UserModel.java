package com.example.userProject.Model;

public class UserModel {
    private int id;
    private String name;
    private String city;
    private int number;

    public UserModel() {
    }

    public UserModel(int id, String name, String city, int number) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.number = number;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

}
