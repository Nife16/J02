package com.OnePercenterTravel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnePercenterTravel.Entity.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
    
}
