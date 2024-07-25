package com.example.summer.accommodation;
import com.example.summer.room.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class AccommodationRepository {
    Map<Integer , Accommodation> accommodationTable = new HashMap<>();
    int idx = 1;
    int roomIdx = 1;

    public Accommodation addAccommodation(Accommodation accommodation){
        //db가 id를 담아서 그 반영된 객체를 반환하기 때문에
        accommodation.setId((idx));
        accommodationTable.put(idx, accommodation);
        return accommodationTable.get(idx++);
    }

    // null이 발생할 수 있는 메소드가 처리하는 것이 맞다고 보지만 너무 이쪽으로 몰려도 좋지는 않다.
    public Accommodation getAccommodation(Integer id) {
        Accommodation foundAccommodation = accommodationTable.get(id);
        return foundAccommodation;
    }
    public List<Accommodation> getAllAccommodation() {
        return new ArrayList<>(accommodationTable.values());
    }



}
