package com.dto;

import java.util.Date;
import java.util.List;

public class UserDTO {
	private String user_Id;

	private Date birthday;

	private String description;

	private String email;

	private byte enable;

	private String gender;

	private String imageUrl;

	private String name;

	private String password;

	private String role;

	private String username;

	private List<MusicDTO> musics1;

	private List<MusicDTO> musics2;

	private List<PlaylistDTO> playlists;

	public UserDTO() {
	}

	public String getUser_Id() {
		return this.user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEnable() {
		return this.enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<MusicDTO> getMusics1() {
		return this.musics1;
	}

	public void setMusics1(List<MusicDTO> musics1) {
		this.musics1 = musics1;
	}

	public List<MusicDTO> getMusics2() {
		return this.musics2;
	}

	public void setMusics2(List<MusicDTO> musics2) {
		this.musics2 = musics2;
	}

	public MusicDTO addMusics2(MusicDTO musics2) {
		getMusics2().add(musics2);
		musics2.setUser(this);

		return musics2;
	}

	public MusicDTO removeMusics2(MusicDTO musics2) {
		getMusics2().remove(musics2);
		musics2.setUser(null);

		return musics2;
	}

	public List<PlaylistDTO> getPlaylists() {
		return this.playlists;
	}

	public void setPlaylists(List<PlaylistDTO> playlists) {
		this.playlists = playlists;
	}

}