package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Team")
public class Team     //Entità Team
{
   private int id_team; //Primary key della tabella Team
   
   private String team_name;
   
   @JoinColumn(name = "id_league")  //Foreign key collegata alla primary key della tabella League
   private int league;
}
