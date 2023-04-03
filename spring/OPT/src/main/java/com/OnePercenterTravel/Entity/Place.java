package com.OnePercenterTravel.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="place")
public class Place {

    // ID lets you know its an id, and the primary key for the class
    @Id
    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "id")
    // This will configure your id to be auto generated, now you don't need a setter for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price", precision = 10, scale = 2)
    private Double price;
    @Column(name = "imgUrl")
    private String imgUrl;
    @ManyToMany
    @JoinTable(
        name="place_amenity",
        joinColumns=
            @JoinColumn(name="place_id", referencedColumnName="id"),
        inverseJoinColumns=
            @JoinColumn(name="amenity_id", referencedColumnName="id")
    )
    private List<Amenity> amenities;

    public Place() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public List<Amenity> getAmenities() {
        return amenities;
    }
    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }
    @Override
    public String toString() {
        return "Place [id=" + id + ", name=" + name + ", price=" + price + ", imgUrl=" + imgUrl + ", amenities="
                + amenities + "]";
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    

    
}
