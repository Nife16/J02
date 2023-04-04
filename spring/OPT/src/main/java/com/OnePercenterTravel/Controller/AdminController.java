package com.OnePercenterTravel.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.OnePercenterTravel.Entity.Place;
import com.OnePercenterTravel.Entity.Reservation;
import com.OnePercenterTravel.Entity.User;
import com.OnePercenterTravel.Service.PlaceService;
import com.OnePercenterTravel.Service.UserService;

@Controller
public class AdminController {

    @Autowired
    UserService userService;
    @Autowired
    PlaceService placeService;

    @GetMapping("/admin-tool")
    public String adminToolHome(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");
        if (email != null) {

            User loggedInUser = userService.findUserByEmail(email);
            model.addAttribute("user", loggedInUser);
            if (loggedInUser.getIsAdmin() != true) {
                return "redirect:";
            }
            return "adminTools";
        }
        return "redirect:";

    }

    @GetMapping("/adminPlaces")
    public String adminPlace(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");
        if (email != null) {

            User loggedInUser = userService.findUserByEmail(email);
            model.addAttribute("user", loggedInUser);
            if (loggedInUser.getIsAdmin() != true) {
                return "redirect:";
            }
            // Model attribute for my form
            model.addAttribute("place", new Place());
            // Get the list of places from the DB
            List<Place> allPlaces = placeService.findAll();
            model.addAttribute("allPlaces", allPlaces);
            return "adminPlaces";
        }
        return "redirect:";
    }

    @PostMapping("/adminPlaces")
    public String adminPlaces(@ModelAttribute Place place) {

        placeService.save(place);

        return "redirect:adminPlaces";

    }

    @GetMapping("/updatePlace/{id}")
    public String updatePlace(@PathVariable("id") Integer placeId, Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");
        if (email != null) {

            User loggedInUser = userService.findUserByEmail(email);
            model.addAttribute("user", loggedInUser);
            if (loggedInUser.getIsAdmin() != true) {
                return "redirect:";
            }
            Place place = placeService.findById(placeId);
            model.addAttribute("place", place);
            return "updatePlace";
        }
        return "redirect:";
    }

    @PostMapping("/updatePlace/{id}")
    public String updatePlace(@ModelAttribute Place place) {

        try {
            placeService.update(place);
        } catch(Exception e) {
            return "redirect:/adminPlaces";
        } catch(Error e) {
            return "redirect:/adminPlaces";
        }
        return "redirect:/adminPlaces";
    }
}
