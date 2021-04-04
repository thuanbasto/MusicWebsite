package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String category_Id;

	private String country;

	@Lob
	private String description;

	private String name;

	// bi-directional many-to-one association to Music
	@OneToMany(mappedBy = "category")
	private List<Music> musics;

	public Category() {
	}

	public String getCategory_Id() {
		return this.category_Id;
	}

	public void setCategory_Id(String category_Id) {
		this.category_Id = category_Id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Music> getMusics() {
		return this.musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public Music addMusic(Music music) {
		getMusics().add(music);
		music.setCategory(this);

		return music;
	}

	public Music removeMusic(Music music) {
		getMusics().remove(music);
		music.setCategory(null);

		return music;
	}

}