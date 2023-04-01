package com.OnePercenterTravel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnePercenterTravel.Entity.Amenity;
import com.OnePercenterTravel.Repo.AmenityRepo;

@Service
public class AmenityService {
    
    @Autowired
    AmenityRepo amenityRepo;
    
    //Create

    public Amenity save(Amenity amenity) {
        return amenityRepo.save(amenity);
    }
    
    // Read

    public Amenity findById(Integer id) {
        return amenityRepo.findById(id).get();
    }

    public List<Amenity> findAll() {
        return amenityRepo.findAll();
    }

    // Update

    public Amenity update(Amenity amenity) throws Exception {

        if(amenity.getId() == null) {
            throw new Exception("No id present, go away billy");
        }

        return amenityRepo.save(amenity);

    }

    // Delete

    public void deleteById(Integer id) {
        amenityRepo.deleteById(id);
    }

}
