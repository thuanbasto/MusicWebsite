package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String user_Id;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Lob
	private String description;

	private String email;

	private byte enable;

	private String gender;

	@Column(name = "image_url")
	private String imageUrl;

	private String name;

	private String password;

	private String role;

	private String username;

	// bi-directional many-to-many association to Music
	@ManyToMany(mappedBy = "users")
	private List<Music> musics1;

	// bi-directional many-to-one association to Music
	@OneToMany(mappedBy = "user")
	private List<Music> musics2;

	// bi-directional many-to-many association to Playlist
	@ManyToMany
	@JoinTable(name = "user_playlist", joinColumns = { @JoinColumn(name = "user_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "playlist_Id") })
	private List<Playlist> playlists;

	public User() {
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

	public List<Music> getMusics1() {
		return this.musics1;
	}

	public void setMusics1(List<Music> musics1) {
		this.musics1 = musics1;
	}

	public List<Music> getMusics2() {
		return this.musics2;
	}

	public void setMusics2(List<Music> musics2) {
		this.musics2 = musics2;
	}

	public Music addMusics2(Music musics2) {
		getMusics2().add(musics2);
		musics2.setUser(this);

		return musics2;
	}

	public Music removeMusics2(Music musics2) {
		getMusics2().remove(musics2);
		musics2.setUser(null);

		return musics2;
	}

	public List<Playlist> getPlaylists() {
		return this.playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}

}