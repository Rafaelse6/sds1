package com.rafaelsantos.dspesquisa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.rafaelsantos.dspesquisa.entities.enums.Platform;

@Entity
@Table(name = "tb_game")
public class Game implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Platform platform;
	
	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;
	
	@OneToMany(mappedBy = "game")
	private List<Record> records = new ArrayList<>();
	
	public Game() {}

	public Game(Long id, String title, Platform platform, Genre genre) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Record> getRecords() {
		return records;
	}

	public Game(Long id) {
		super();
		this.id = id;
	}
	
}
