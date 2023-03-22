package com.OnePercenterTravel.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnePercenterTravel.Entity.User;
import com.OnePercenterTravel.Repo.UserRepo;

/*
 * The job of the service is to ALL OF YOUR CRUD JAVA LOGIC
 * FOR YOUR ENTITY THEY CONTROL
 * You use your repo in your service, to actually make your
 * Database changes. Do use your Repo here, you MUST AUTOWIRE IT!
 */
@Service
public class UserService {

    // This will construct a spring bean in your file
    // this allows you to use the autowired class's function in this file
    @Autowired
    UserRepo userRepo;

    // CRUD LOGIC GOES BELOW!!!

    // CREATE

    public User signUp(User user) {
        return userRepo.save(user);
    }

    // READ

    public User findUserById(Integer id) {
        // Find by id isnt perfect, you need to do .get() on the end
        // to get your object off of the function
        return userRepo.findById(id).get();
    }

    // UPDATE

    // DELETE

    public void deleteUserById(Integer id) {
        userRepo.deleteById(id);
    }
    
}
