package com.jorgenavarro.ticketapi.services;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;

import com.jorgenavarro.ticketapi.entity.Ticket;

/**
 * @author JorgeNavarro
 *         InterfaceTicketRepository - This class is used to record the method
 *         in Ticket Services
 */
public interface InterfaceTicketRepository {

    /**
     * Get all ticket from the repository
     * @return List<Tickets> - all tickets
     */
    public List<Ticket> getAll();

    /**
     * Add new ticket into the list
     * @param ticket - the new ticket
     */
    public void add(Ticket ticket);

    /**
     * Remove one ticket from the list
     * @param ticket - the ticket who has been deleted
     */
    public void remove(Ticket ticket);

    /**
     * Find one ticket by id
     * @param id - the id of the ticket
     * @return Ticket - the ticket with the id requested
     */
    public Ticket find(int id);
    
}
