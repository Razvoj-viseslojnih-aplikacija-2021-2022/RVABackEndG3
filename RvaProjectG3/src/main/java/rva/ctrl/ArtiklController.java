package rva.ctrl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rva.model.Artikl;
import rva.repositories.ArtiklRepository;

@RestController
public class ArtiklController {

	@Autowired
	private ArtiklRepository artiklRepository;
	
	@GetMapping("/artikl")
	public Collection<Artikl> getAllArticles(){
		return artiklRepository.findAll();
	}
}
