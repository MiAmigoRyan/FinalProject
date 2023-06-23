package com.skilldistillery.leagueolympia.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	
	@OneToMany(mappedBy="country")
	private List<Athlete> athletes;
	
	@OneToMany(mappedBy="country")
	private List<Olympiad> olympiads;
	
	
	private String name;
	
	private String flag;
	
	private String about;

	public Country() {
		super();
	}
	
	
	
	public List<Olympiad> getOlympiads() {
		return olympiads;
	}



	public void setOlympiads(List<Olympiad> olympiads) {
		this.olympiads = olympiads;
	}



	public List<Athlete> getAthletes() {
		return athletes;
	}


	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [id=").append(id).append(", name=").append(name).append(", flag=").append(flag)
				.append(", about=").append(about).append("]");
		return builder.toString();
	}
	
	

	


}
