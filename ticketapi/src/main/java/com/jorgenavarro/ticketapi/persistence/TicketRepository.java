package com.jorgenavarro.ticketapi.persistence;

import org.springframework.data.repository.CrudRepository;

import com.jorgenavarro.ticketapi.entity.Ticket;

/**
 * @author JorgeNavarro
 *         TicketRepository - This class is used to make the repository
 */
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
