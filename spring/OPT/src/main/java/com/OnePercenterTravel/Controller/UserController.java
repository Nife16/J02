package com.OnePercenterTravel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.OnePercenterTravel.Service.UserService;


// The controller is the liason between the JSP and the Services
// When the user makes input on the browser, it will correspond to
// one of the functions in the Controller first
// Then the controller will use services to get whatever data needed
// for the page, and return the correct JSP
@Controller
public class UserController {
    
    @Autowired
    UserService userService;

    // Get mappings are when you are going straight to a url
    // no form submission at all
    @GetMapping("/")
    // This function will run whenever someone goes to the / url (http://localhost:8080/)
    public String index() {
        return "home";
    }

    @GetMapping("/sign-up")
    public String signUp() {

        return "signUp";
    }


}
