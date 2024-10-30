package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Position")
public class Position     //Entità Position
{
   private int id_position; //Primary key della tabella Position
   
   private String position_name;
}
