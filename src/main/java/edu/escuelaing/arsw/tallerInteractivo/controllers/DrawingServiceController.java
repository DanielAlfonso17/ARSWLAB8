package edu.escuelaing.arsw.tallerInteractivo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.tallerInteractivo.security.Ticket;


@RestController
public class DrawingServiceController {
    
    @GetMapping("/status")
    public String status() {
        return "{\"status\":\"Greetings from Spring Boot. " +
                java.time.LocalDate.now() + ", " +
                java.time.LocalTime.now() +
                ". " + "The server is Runnig!\"}";
    }
    
    @GetMapping("/ticket")
    public String getTicket() {
        return Ticket.getInstance().getTicket().toString();
    }
}