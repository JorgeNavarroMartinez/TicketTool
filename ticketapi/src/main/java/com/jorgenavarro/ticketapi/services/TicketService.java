package com.jorgenavarro.ticketapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jorgenavarro.ticketapi.entity.Ticket;
import com.jorgenavarro.ticketapi.persistence.TicketRepository;

/**
 * @author JorgeNavarro
 *         TicketService - This class manages the tickets
 */
@Service
public class TicketService implements InterfaceTicketRepository {

    //The repository of the tickets
    private final TicketRepository ticketRepository;

    /**
     * Constructor of the TicketService
     * @param ticketRepository - this is the repository of the ticket added with injection
     */
    TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    /**    (non-Javadoc)
     * 
     * @see com.jorgenavarro.ticketapi.services.InterfaceTicketRepository#getAll()
     */
    @Override
    public List<Ticket> getAll() {

        return (List<Ticket>) ticketRepository.findAll();
    }

    /**    (non-Javadoc)
     * 
     * @see com.jorgenavarro.ticketapi.services.InterfaceTicketRepository#add(com.jorgenavarro.ticketapi.entity.Ticket)
     */
    @Override
    public void add(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    /**    (non-Javadoc)
     * 
     * @see com.jorgenavarro.ticketapi.services.InterfaceTicketRepository#remove(com.jorgenavarro.ticketapi.entity.Ticket)
     */
    @Override
    public void remove(Ticket ticket) {
        ticketRepository.delete(ticket);
    }

    /**    (non-Javadoc)
     * 
     * @see com.jorgenavarro.ticketapi.services.InterfaceTicketRepository#find(int)
     */
    @Override
    public Ticket find(int id) {
      return ticketRepository.findById(id).get();
    }

    

}
