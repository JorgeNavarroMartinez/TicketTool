package com.jorgenavarro.ticketapi.entity;

import com.jorgenavarro.ticketapi.entity.enumerators.Category;
import com.jorgenavarro.ticketapi.entity.enumerators.Priority;
import com.jorgenavarro.ticketapi.entity.enumerators.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@AllArgsConstructor 
@NoArgsConstructor 
@Getter 
@Setter 
public class Ticket {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int idAgent;
    private Status status;
    private int idUser;
    private Priority priority;
    private Category category;
}
