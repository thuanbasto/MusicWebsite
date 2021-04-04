package com.dto;

import java.util.List;

public class PlaylistDTO {

	private String playlist_Id;

	private String description;

	private String name;

	private byte share;

	private List<MusicDTO> musics;

	private List<UserDTO> users;

	public PlaylistDTO() {
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

	public List<MusicDTO> getMusics() {
		return this.musics;
	}

	public void setMusics(List<MusicDTO> musics) {
		this.musics = musics;
	}

	public List<UserDTO> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}

}