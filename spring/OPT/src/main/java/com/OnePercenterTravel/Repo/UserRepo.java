package com.OnePercenterTravel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OnePercenterTravel.Entity.User;

/*
    ALL REPO'S ARE INTERFACES, NOT CLASSES
    The job of the repo, is to communicate CRUD wise with the Database
    (Remember crud, CREATE READ UPDATE DELETE)
 */
@Repository             // Give JpaRepo the name of your Class
                        // and the DataType of the Primary Key
public interface UserRepo extends JpaRepository<User, Integer> {
    
    // @Query will allow you to make a query to the DB for the abstract function
    // It will return data from the db to your service
    // value is the select statement you make for your functionality
    // nativeQuery should always be true, allows you to write basic SQL
    // ?1, ?2... the arguments you pass the repo function, in order
    @Query(value="select * from user where email = ?1 and password = ?2", nativeQuery = true)
    // This function MUST BE ABSTRACT, NO BRACKETS
    public User findByEmailAndPassword(String email, String password);

    @Query(value="select * from user where email = ?1", nativeQuery = true)
    public User findByEmail(String email);

}
