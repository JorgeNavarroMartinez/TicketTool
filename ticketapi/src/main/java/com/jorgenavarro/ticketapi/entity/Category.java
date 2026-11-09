package com.jorgenavarro.ticketapi.entity;


/**
 * @author JorgeNavarro
 * 
 * This class is the representation of one Category for a ticket
 * 
 * My idea to do a class instead of enum is i want to the agent can add more Categories but adding in the description what mean the new Category
 */
public class Category {

    private int id;
    private String name;
    private String description;
}
