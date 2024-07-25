package com.example.summer.room;

import com.example.summer.Exception.RoomNotFoundException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    @Autowired
    private RoomService roomService;


    @RequestMapping(value = "/room", method = RequestMethod.POST)
    public ResponseEntity<Room[]> addRooms(@RequestBody Room[] rooms) {
        roomService.addRooms(rooms);
        Room[] savedRooms = roomService.addRooms(rooms);
        return new ResponseEntity<>(savedRooms, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/rooms/{id}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable("id") int id){
        return roomService.getRoom(id);
    }

}
