package com.OnePercenterTravel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnePercenterTravel.Entity.Place;

@Repository
public interface PlaceRepo extends JpaRepository<Place, Integer> {
    
}
