package com.OnePercenterTravel.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {
    
    // ID lets you know its an id, and the primary key for the class
    @Id
    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "id")
    // This will configure your id to be auto generated, now you don't need a setter for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    // One way or Roundtrip
    @Column(name = "roundtrip")
    private Boolean roundtrip;
    @Column(name = "number_of_people")
    private Integer numberOfPeople;
    @Column(name = "start_of_trip")
    private LocalDateTime startOfTrip;
    @Column(name = "end_of_trip")
    private LocalDateTime endOfTrip;
    @OneToMany
    // On a one to many, you state the parent as the foreign key, to be placed on the child
    @JoinColumn(name="reservation_id")
    private List<Place> placeOfTravel;
    
    public Reservation() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Boolean getRoundtrip() {
        return roundtrip;
    }
    public void setRoundtrip(Boolean roundtrip) {
        this.roundtrip = roundtrip;
    }
    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }
    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
    public LocalDateTime getStartOfTrip() {
        return startOfTrip;
    }
    public void setStartOfTrip(LocalDateTime startOfTrip) {
        this.startOfTrip = startOfTrip;
    }
    public LocalDateTime getEndOfTrip() {
        return endOfTrip;
    }
    public void setEndOfTrip(LocalDateTime endOfTrip) {
        this.endOfTrip = endOfTrip;
    }
    public List<Place> getPlaceOfTravel() {
        return placeOfTravel;
    }
    public void setPlaceOfTravel(List<Place> placeOfTravel) {
        this.placeOfTravel = placeOfTravel;
    }
    @Override
    public String toString() {
        return "Reservation [id=" + id + ", roundtrip=" + roundtrip + ", numberOfPeople=" + numberOfPeople
                + ", startOfTrip=" + startOfTrip + ", endOfTrip=" + endOfTrip + ", placeOfTravel=" + placeOfTravel
                + "]";
    }

    

}