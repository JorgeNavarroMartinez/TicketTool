package com.jorgenavarro.ticketapi.entity.enumerators;

/**
 * @author JorgeNavarro
 * 
 * The priority who have one ticket
 * 
 * (In my opinion should have this description but it depends of the agent)
 * 
 * URGENT - if the ticket should be resolved in a low time and have a big impact for the company
 * HIGH - If the ticket have a big impact for the company
 * MEDIUM - If the ticket should be resolved in a low time
 * LOW - If the ticket shouldn't be resolved in a low time and haven't a big impact for the company
 * 
 */
public enum Priority {
    URGENT, HIGH, MEDIUM, LOW

    
}
