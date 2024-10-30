package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "League") //Entità League
public class League 
{
    private int id_league; //Primary key della tabella League
    
    private String league_name;
}
