package com.OnePercenterTravel.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.OnePercenterTravel.Entity.Reservation;
import com.OnePercenterTravel.Entity.User;
import com.OnePercenterTravel.Service.ReservationService;
import com.OnePercenterTravel.Service.UserService;

@Controller
public class RervationController {
    
    @Autowired
    ReservationService reservationService;
    @Autowired
    UserService userService;

    @GetMapping("/book")
    public String bookReservation(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");
        if (email != null) {
            model.addAttribute("reservation", new Reservation());
            return "book";
        } else {
            return "redirect:home";
        }
    }

    @PostMapping("/book")
    public String bookReservation(@ModelAttribute Reservation reservation, HttpSession session) {

        Reservation savedReservation = reservationService.save(reservation);
        
        String email = (String) session.getAttribute("emailCookie");
        User loggedInUser = userService.findUserByEmail(email);

        // We need to add the reservation to the list on the user
        loggedInUser = userService.addReservation(loggedInUser, savedReservation);

        System.out.println(loggedInUser.toString());
        return "home";
    }
}
