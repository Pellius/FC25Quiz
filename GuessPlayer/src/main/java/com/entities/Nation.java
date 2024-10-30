package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Nation")
public class Nation    //Entità Nation
{
   private int id_nation; //Primary key della tabella Nation
   
   private String nation_name; 
}
