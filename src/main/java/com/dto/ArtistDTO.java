package com.dto;

import java.util.Date;
import java.util.List;

public class ArtistDTO {

	private String artist_Id;

	private Date birthday;

	private String description;

	private String gender;

	private String imageUrl;

	private String name;

	private List<MusicDTO> musics1;

	private List<MusicDTO> musics2;

	public ArtistDTO() {
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

	public List<MusicDTO> getMusics1() {
		return this.musics1;
	}

	public void setMusics1(List<MusicDTO> musics1) {
		this.musics1 = musics1;
	}

	public MusicDTO addMusics1(MusicDTO musics1) {
		getMusics1().add(musics1);
		musics1.setArtist1(this);

		return musics1;
	}

	public MusicDTO removeMusics1(MusicDTO musics1) {
		getMusics1().remove(musics1);
		musics1.setArtist1(null);

		return musics1;
	}

	public List<MusicDTO> getMusics2() {
		return this.musics2;
	}

	public void setMusics2(List<MusicDTO> musics2) {
		this.musics2 = musics2;
	}

	public MusicDTO addMusics2(MusicDTO musics2) {
		getMusics2().add(musics2);
		musics2.setArtist2(this);

		return musics2;
	}

	public MusicDTO removeMusics2(MusicDTO musics2) {
		getMusics2().remove(musics2);
		musics2.setArtist2(null);

		return musics2;
	}

}