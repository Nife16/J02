package com.OnePercenterTravel.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// Allows spring to see your file as an Entity
// Entity's are Classes that you use to create objects
// that will eventually be stored in the database
@Entity
// Tells spring that the entity will correlate to the table in the
// database with name given
@Table(name="user")
public class User {

    // ID lets you know its an id, and the primary key for the class
    @Id
    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "id")
    // This will configure your id to be auto generated, now you don't need a setter for your id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "password", nullable = false)
    private String password;

    // Column maps to the same name as the column name in the database, it is case sensitive
    @Column(name = "name")
    private String name;

    @OneToMany
    @JoinColumn(name="reservation_id")
    private List<Reservation> reservation;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", reservation="
                + reservation + "]";
    }

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }
    
}
