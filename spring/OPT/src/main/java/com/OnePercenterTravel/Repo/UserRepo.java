package com.OnePercenterTravel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
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
    
}
