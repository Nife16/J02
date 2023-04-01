package com.OnePercenterTravel.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.OnePercenterTravel.Entity.Reservation;
import com.OnePercenterTravel.Entity.User;
import com.OnePercenterTravel.Service.UserService;

@Controller
public class AdminController {
    
    @Autowired
    UserService userService;

    @GetMapping("/admin-tool")
    public String adminToolHome(Model model, HttpSession session) {
        
        String email = (String) session.getAttribute("emailCookie");
        if(email != null) {

            User loggedInUser = userService.findUserByEmail(email);
            model.addAttribute("user", loggedInUser);
            if(loggedInUser.getIsAdmin() != true) {
                return "redirect:";
            }
            return "adminTools";
        }
        return "redirect:";

    }

}
