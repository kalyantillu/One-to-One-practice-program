package com.example.programpractice.Entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name="Actor_film", 
	joinColumns = { @JoinColumn(name="actor_id")},
	inverseJoinColumns= { @JoinColumn(name="film_id")})
     private Film film;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Actor(long id, String name, Film film) {
		super();
		this.id = id;
		this.name = name;
		this.film = film;
	}

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", film=" + film + "]";
	}
	
	
	
	
}
