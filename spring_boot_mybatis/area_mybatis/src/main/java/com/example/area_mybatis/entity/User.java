package com.example.area_mybatis.entity;

/**
 * @author : codingchao
 * @date : 2020-08-15 12:04
 * @Description:
 **/
public class User {

    private  int id;
    private String name;
    private String password;
    private String number;

    public User(String name, String password, String number) {
        this.name = name;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
