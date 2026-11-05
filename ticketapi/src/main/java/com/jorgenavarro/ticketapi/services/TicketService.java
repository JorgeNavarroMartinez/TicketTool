package com.jorgenavarro.ticketapi.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgenavarro.ticketapi.entity.Ticket;
import com.jorgenavarro.ticketapi.persistence.TicketRepository;

@Service
public class TicketService implements InterfaceTicketRepository {

    @Autowired 
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAll() {
        
        return (List<Ticket>)ticketRepository.findAll();
    }

    @Override
    public Ticket add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Integer remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    
    
}
