package com.jorgenavarro.ticketapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorgenavarro.ticketapi.entity.Ticket;
import com.jorgenavarro.ticketapi.services.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/tickets")
public class ControllerTickets {

    private final TicketService ticketService;

    private ControllerTickets(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/all")
    public List<Ticket> getTickets() {
        return ticketService.getAll();
    }

    @GetMapping("/findById/{id}")
    public Ticket getTicketById(@RequestParam int id) {
        return ticketService.find(id);
    }

    @GetMapping("/create")
    public void addTicket(@RequestBody Ticket ticket) {
        ticketService.add(ticket);
    }

}
