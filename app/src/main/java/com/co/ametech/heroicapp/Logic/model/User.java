package com.co.ametech.heroicapp.Logic.model;

/**
 * Created by Alan M.E
 */
public class User {

    private String email;
    private String name;
    private String password;

    public User(String name, String email, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
