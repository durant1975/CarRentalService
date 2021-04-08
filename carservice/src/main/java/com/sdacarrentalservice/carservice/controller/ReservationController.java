package com.sdacarrentalservice.carservice.controller;


import com.sdacarrentalservice.carservice.model.Reservation;
import com.sdacarrentalservice.carservice.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    // Done display List of All reservations
    @RequestMapping("/")
    public String viewNewReservationForm(Model model) {

        model.addAttribute("listReservations", reservationService.getAllReservations());
        return "index";

    }
    @GetMapping ("/showNewReservationForm")
    public String showNewReservationForm(Model model) {
        // create model attribute to bind form data
        Reservation reservation = new Reservation();
        model.addAttribute("reservation", reservation );
        return "FormReservation";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("reservation ") Reservation reservation ) {
        // save reservation to database
        reservationService.save(reservation );
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "reservationId") long reservationId, Model model) {

        // get Reservation from the service
        Reservation reservation = reservationService.getReservation(reservationId);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("reservation ", reservation );
        return "update_reservation ";
    }

    @GetMapping("/deleteReservation /{reservationId}")
    public String deleteEmployee(@PathVariable(value = "reservationId") long id) {

        // call delete employee method
        this.reservationService.deleteReservationById(id);
        return "redirect:/";
    }
}

