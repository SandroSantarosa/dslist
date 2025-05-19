package br.com.sandro.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sandro.dslist.dto.GameMinDTO;
import br.com.sandro.dslist.entities.Game;
import br.com.sandro.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); // convert Game para GameMinDTO atravez do stream.map 
		return dto;
	}

}
