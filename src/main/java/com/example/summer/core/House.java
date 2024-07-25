package com.example.summer.core;

//어노테이션 영향 범위는 그 밑에까지만 영향을 준다.
public class House {
    private String name;
    House(){
        this.name = "B House";
        System.out.println("Created House Bean!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
