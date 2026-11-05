package com.jorgenavarro.ticketapi.persistence;

import org.springframework.data.repository.CrudRepository;

import com.jorgenavarro.ticketapi.entity.Ticket;
 
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
