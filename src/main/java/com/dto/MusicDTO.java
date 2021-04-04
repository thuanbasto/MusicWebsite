package com.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class MusicDTO {
	private String music_Id;

	private String description;

	private byte enable;

	private String imageUrl;

	private String lyrics;

	private String musicUrl;

	private String name;

	private Date uploadedDate;

	private String videoUrl;

	private BigInteger view;

	private List<UserDTO> users;

	private UserDTO user;

	private ArtistDTO artist1;

	private ArtistDTO artist2;

	private CategoryDTO category;

	private List<PlaylistDTO> playlists;

	public MusicDTO() {
	}

	public String getMusic_Id() {
		return this.music_Id;
	}

	public void setMusic_Id(String music_Id) {
		this.music_Id = music_Id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getEnable() {
		return this.enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLyrics() {
		return this.lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public String getMusicUrl() {
		return this.musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUploadedDate() {
		return this.uploadedDate;
	}

	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public BigInteger getView() {
		return this.view;
	}

	public void setView(BigInteger view) {
		this.view = view;
	}

	public List<UserDTO> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

	public UserDTO getUser() {
		return this.user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public ArtistDTO getArtist1() {
		return this.artist1;
	}

	public void setArtist1(ArtistDTO artist1) {
		this.artist1 = artist1;
	}

	public ArtistDTO getArtist2() {
		return this.artist2;
	}

	public void setArtist2(ArtistDTO artist2) {
		this.artist2 = artist2;
	}

	public CategoryDTO getCategory() {
		return this.category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public List<PlaylistDTO> getPlaylists() {
		return this.playlists;
	}

	public void setPlaylists(List<PlaylistDTO> playlists) {
		this.playlists = playlists;
	}

}