package com.jorgenavarro.ticketapi.services;

import java.util.List;

import com.jorgenavarro.ticketapi.entity.Ticket;

/**
 * @author JorgeNavarro
 *         InterfaceTicketRepository - This class is used to record the method
 *         in Ticket Services
 */
public interface InterfaceTicketRepository {

    public List<Ticket> getAll();

    public void add(Ticket ticket);

    public void remove(Ticket ticket);

    public Ticket find(int id);
}
