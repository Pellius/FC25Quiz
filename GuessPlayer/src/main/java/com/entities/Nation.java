package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Nation")
public class Nation    //Entità Nation
{
   private int id_nation; //Primary key della tabella Nation
   
   private String nation_name;

public int getId_nation() {
	return id_nation;
}

public void setId_nation(int id_nation) {
	this.id_nation = id_nation;
}

public String getNation_name() {
	return nation_name;
}

public void setNation_name(String nation_name) {
	this.nation_name = nation_name;
} 
}
