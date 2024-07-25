package com.example.summer.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    //house는 필드값으로 이름을 가진다. 00집을 샀습니다!
    House house;

    //생성자가 하나밖에 없으면 내가 자동으로 @Autowired 써줄게
    // 나는 house 객체가 어디있는지 몰라 객체 관리는 너가 하니까 너가 house를 넣어줘 라는 의미이다.
    @Autowired
    public Person(House house){
        this.house = house;
        System.out.println(house.getName() + "집을 샀습니다.");
    }
}
