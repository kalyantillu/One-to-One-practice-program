package com.example.programpractice.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String genre;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Film(long id, String title, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", genre=" + genre + "]";
	}
	
	/*@OneToOne(cascade = CascadeType.ALL,mappedBy="a")
	@JoinColumn(name="actor_id")
	//@JsonBackReference
	private Actor actor;*/

	
}