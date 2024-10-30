package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Player") 
public class Player    //Entità Player
{

   private int id_player; //Primary key della tabella Player
   
   private String player_name;
   
   private int overall;
   
   private String position;
   
   private int weak_foot;
   
   private int skill_moves;
   
   private int height;
   
   private int age;
   
   private String img;
   
   @JoinColumn(name = "id_nation") //Foreign key collegata alla primary key della tabella Nation
   private int nation;      
   
   @JoinColumn(name = "id_team")  //Foreign key collegata alla primary key della tabella Team
   private int team; 
   
}
