package com.devsuperior.dsmove.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	//--Refrencias a Claves Primarias Compuestas--//
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	//--Atributos Internos--//
	private Double value;

	public Score()
	{
	}
	
	//--Referencia para Movie--//
	private void setMovie(Movie movie)
	{
		id.setMovie(movie);
	}
	
	//--Refrencia para User--//
	public void setUser(User user)
	{
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
