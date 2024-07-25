package com.example.summer.room;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room {
    private int accommodationId;
    private int roomId;
    private String type;
    private int price;
}


class NUllRoom extends Room{
    @Override
    public String getType(){
        return "null";
    }
}
