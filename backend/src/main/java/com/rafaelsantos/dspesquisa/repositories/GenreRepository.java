package com.rafaelsantos.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
