package com.jorgenavarro.ticketapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author JorgeNavarro
 * 
 * This class is the representation of one Status for a ticket
 * 
 * My idea to do a class instead of enum is i want to the agent can add more statues but adding in the description what mean the new status
 */
@Entity 
@AllArgsConstructor 
@NoArgsConstructor 
public class Status {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;

    private String description;
}
