package com.example.summer.room;

import com.example.summer.Exception.RoomNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.summer.accommodation.AccommodationRepository;
import com.example.summer.accommodation.Accommodation;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private AccommodationRepository accommodationRepository;

    public Room getRoom(int id){
        return roomRepository.getRoom(id);
    }

    public Room[] addRooms(Room[] rooms) {
        for (Room room : rooms) {
            System.out.println("rooms" + room);
            roomRepository.addRoom(room);

            Accommodation accommodation = accommodationRepository.getAccommodation(room.getAccommodationId());
            accommodation.getRooms().add(room);
        }
        return rooms;
    }
}
