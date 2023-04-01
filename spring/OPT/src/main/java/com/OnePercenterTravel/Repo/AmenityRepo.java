package com.OnePercenterTravel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnePercenterTravel.Entity.Amenity;

@Repository
public interface AmenityRepo extends JpaRepository<Amenity, Integer> {
    
}
