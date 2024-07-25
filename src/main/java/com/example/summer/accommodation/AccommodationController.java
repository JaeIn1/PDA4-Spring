package com.example.summer.accommodation;
import com.example.summer.Exception.RoomNotFoundException;
import com.example.summer.room.Room;
import com.example.summer.room.RoomController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccommodationController {
    AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @RequestMapping(value="/accommodations/{id}" , method = RequestMethod.GET)
    public Accommodation getAccommodation(@PathVariable(value = "id") int id){
        Accommodation accommodation = accommodationService.getAccommodation(id);
        if(accommodation != null) return accommodationService.getAccommodation(id);
        else return null;
    }

    // 숙소 1개 등록
    @RequestMapping(value = "/accommodations", method = RequestMethod.POST)
    public ResponseEntity<Accommodation> addAccommodation(@RequestBody Accommodation accommodation) {
        Accommodation savedAccommodation = accommodationService.addAccommodation(accommodation);
        return new ResponseEntity<>(savedAccommodation, HttpStatus.CREATED);
    }

    // 전체 숙소 조회
    @RequestMapping(value = "/accommodations", method = RequestMethod.GET)
    public ResponseEntity<List<Accommodation>> getAllAccommodation() {
        List<Accommodation> savedAccommodation = accommodationService.getAllAccommodation();
        return new ResponseEntity<>(savedAccommodation, HttpStatus.CREATED);
    }


}


