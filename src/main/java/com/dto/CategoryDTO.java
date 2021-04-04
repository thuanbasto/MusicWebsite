package com.dto;

import java.util.List;

public class CategoryDTO {

	private String category_Id;

	private String country;

	private String description;

	private String name;

	private List<MusicDTO> musics;

	public CategoryDTO() {
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

	public List<MusicDTO> getMusics() {
		return this.musics;
	}

	public void setMusics(List<MusicDTO> musics) {
		this.musics = musics;
	}

	public MusicDTO addMusic(MusicDTO music) {
		getMusics().add(music);
		music.setCategory(this);

		return music;
	}

	public MusicDTO removeMusic(MusicDTO music) {
		getMusics().remove(music);
		music.setCategory(null);

		return music;
	}

}