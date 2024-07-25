package com.example.summer.room;
import com.example.summer.Exception.RoomNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Component;

@Component
public class RoomRepository {
    Map<Integer, Room> roomTable = new HashMap<>();
    int idx = 1;

    public Room getRoom(int id) throws NoSuchElementException{
        Room foundRoom = roomTable.get(id);

        if(foundRoom != null) return foundRoom;
        else throw new RoomNotFoundException("no Room!");
    }

    public void addRoom(Room room) {
        room.setRoomId(idx);
        roomTable.put(room.getRoomId(), room);
        idx++;
    }
}
