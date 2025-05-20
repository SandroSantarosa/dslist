package br.com.sandro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sandro.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
