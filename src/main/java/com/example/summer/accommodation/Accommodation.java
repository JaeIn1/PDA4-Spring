package com.example.summer.accommodation;

import com.example.summer.room.Room;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

//코드를 나 대신에 추가를 해주는 역할
@Getter
@Setter
public class Accommodation {
    private int id;
    private String name;
    private int minPrice;
    private ArrayList<Room> rooms;

    public Accommodation( String name, int minPrice) {
        this.name = name;
        this.minPrice = minPrice;
        this.rooms = new ArrayList<>();
    }
}
