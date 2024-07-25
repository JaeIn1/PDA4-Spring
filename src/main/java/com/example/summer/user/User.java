package com.example.summer.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String id;
    private String password;
    private int Key;

    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

}
