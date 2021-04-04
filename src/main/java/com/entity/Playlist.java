package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the playlist database table.
 * 
 */
@Entity
@NamedQuery(name = "Playlist.findAll", query = "SELECT p FROM Playlist p")
public class Playlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String playlist_Id;

	@Lob
	private String description;

	private String name;

	private byte share;

	// bi-directional many-to-many association to Music
	@ManyToMany(mappedBy = "playlists")
	private List<Music> musics;

	// bi-directional many-to-many association to User
	@ManyToMany(mappedBy = "playlists")
	private List<User> users;

	public Playlist() {
	}

	public String getPlaylist_Id() {
		return this.playlist_Id;
	}

	public void setPlaylist_Id(String playlist_Id) {
		this.playlist_Id = playlist_Id;
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

	public byte getShare() {
		return this.share;
	}

	public void setShare(byte share) {
		this.share = share;
	}

	public List<Music> getMusics() {
		return this.musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}