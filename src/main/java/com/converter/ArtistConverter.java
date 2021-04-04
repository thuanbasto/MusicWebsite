package com.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dto.ArtistDTO;
import com.entity.Artist;

@Component
public class ArtistConverter {
	@Autowired
	ModelMapper mapper;

	public ArtistDTO toDTO(Artist artist) {
		ArtistDTO artistDTO = new ArtistDTO();
		artistDTO.setName(artist.getName());
		return artistDTO;
	}
}
