package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nations")
public class Nation    //Entità Nation
{
   @Column(name = "id_nation")
   private int idNation; //Primary key della tabella Nation
   
   @Column(name = "nation_name")
   private String nationName;

	public int getIdNation() {
		return idNation;
	}
	
	public void setIdNation(int idNation) {
		this.idNation = idNation;
	}
	
	public String getNationName() {
		return nationName;
	}
	
	public void setNationName(String nationName) {
		this.nationName = nationName;
	}

   
}
