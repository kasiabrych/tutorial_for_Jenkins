package ie.cit.caf.lctutorial03.service;

import ie.cit.caf.lctutorial03.domain.Artist;
import ie.cit.caf.lctutorial03.repository.ArtistRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService{
	
	ArtistRepository artistRepository; 
	
	@Autowired
	public ArtistServiceImpl(ArtistRepository artistRepository){
		this.artistRepository = artistRepository; 
	}

	@Override
	public void save(Artist artist) {
		artistRepository.save(artist);
		
	}

	@Override
	public Artist get(int id) {
		return artistRepository.get(id);
	}

	@Override
	public void remove(Artist artist) {
		artistRepository.remove(artist);
	}

	@Override
	public List<Artist> findAll() {
		return artistRepository.findAll();
	}

}
