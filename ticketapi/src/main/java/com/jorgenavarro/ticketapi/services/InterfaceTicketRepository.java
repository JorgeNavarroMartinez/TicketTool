package com.jorgenavarro.ticketapi.services;

import java.util.List;

import com.jorgenavarro.ticketapi.entity.Ticket;

public interface InterfaceTicketRepository {

    public List<Ticket> getAll();

    public void add(Ticket ticket);

    public Integer remove();
}
