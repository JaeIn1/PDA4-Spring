package com.example.summer.accommodation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccommodationService {
    AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public Accommodation addAccommodation(Accommodation accommodation){
        return accommodationRepository.addAccommodation(accommodation);
    }

    public Accommodation getAccommodation(Integer id){
        return  accommodationRepository.getAccommodation(id);
    }

    public List<Accommodation> getAllAccommodation(){
        return  accommodationRepository.getAllAccommodation();
    }
}
