package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;

/**
 * The persistent class for the music database table.
 * 
 */
@Entity
@NamedQuery(name = "Music.findAll", query = "SELECT m FROM Music m")
public class Music implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String music_Id;

	@Lob
	private String description;

	private byte enable;

	@Column(name = "image_url")
	private String imageUrl;

	@Lob
	private String lyrics;

	@Column(name = "music_url")
	private String musicUrl;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "uploaded_date")
	private Date uploadedDate;

	@Column(name = "video_url")
	private String videoUrl;

	private BigInteger view;

	// bi-directional many-to-one association to Artist
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "singer_Id")
	private Artist artist1;

	// bi-directional many-to-one association to Artist
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "musician_Id")
	private Artist artist2;

	// bi-directional many-to-one association to Category
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_Id")
	private Category category;

	// bi-directional many-to-many association to Playlist
	@ManyToMany
	@JoinTable(name = "music_playlist", joinColumns = { @JoinColumn(name = "music_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "playlist_Id") })
	private List<Playlist> playlists;

	// bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(name = "favourite", joinColumns = { @JoinColumn(name = "music_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_Id") })
	private List<User> users;

	// bi-directional many-to-one association to User
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_Id")
	private User user;

	public Music() {
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

	public Artist getArtist1() {
		return this.artist1;
	}

	public void setArtist1(Artist artist1) {
		this.artist1 = artist1;
	}

	public Artist getArtist2() {
		return this.artist2;
	}

	public void setArtist2(Artist artist2) {
		this.artist2 = artist2;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Playlist> getPlaylists() {
		return this.playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}