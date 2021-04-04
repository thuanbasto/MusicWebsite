package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.converter.ArtistConverter;
import com.dto.ArtistDTO;
import com.entity.Artist;
import com.repository.ArtistRepository;
import com.service.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	ArtistRepository artistRepository;

	@Autowired
	ArtistConverter artistConverter;

	@Override
	public List<ArtistDTO> getArtists() {
		List<Artist> artists = artistRepository.findAll();
		List<ArtistDTO> artistDTOs = new ArrayList<ArtistDTO>();
		artists.forEach(artist -> artistDTOs.add(artistConverter.toDTO(artist)));
		return artistDTOs;
	}

}
