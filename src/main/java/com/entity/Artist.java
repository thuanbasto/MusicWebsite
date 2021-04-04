package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the artist database table.
 * 
 */
@Entity
@NamedQuery(name = "Artist.findAll", query = "SELECT a FROM Artist a")
public class Artist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String artist_Id;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Lob
	private String description;

	private String gender;

	@Column(name = "image_url")
	private String imageUrl;

	private String name;

	// bi-directional many-to-one association to Music
	@OneToMany(mappedBy = "artist1")
	private List<Music> musics1;

	// bi-directional many-to-one association to Music
	@OneToMany(mappedBy = "artist2")
	private List<Music> musics2;

	public Artist() {
	}

	public String getArtist_Id() {
		return this.artist_Id;
	}

	public void setArtist_Id(String artist_Id) {
		this.artist_Id = artist_Id;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Music> getMusics1() {
		return this.musics1;
	}

	public void setMusics1(List<Music> musics1) {
		this.musics1 = musics1;
	}

	public Music addMusics1(Music musics1) {
		getMusics1().add(musics1);
		musics1.setArtist1(this);

		return musics1;
	}

	public Music removeMusics1(Music musics1) {
		getMusics1().remove(musics1);
		musics1.setArtist1(null);

		return musics1;
	}

	public List<Music> getMusics2() {
		return this.musics2;
	}

	public void setMusics2(List<Music> musics2) {
		this.musics2 = musics2;
	}

	public Music addMusics2(Music musics2) {
		getMusics2().add(musics2);
		musics2.setArtist2(this);

		return musics2;
	}

	public Music removeMusics2(Music musics2) {
		getMusics2().remove(musics2);
		musics2.setArtist2(null);

		return musics2;
	}

}