package com.rafaelsantos.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
