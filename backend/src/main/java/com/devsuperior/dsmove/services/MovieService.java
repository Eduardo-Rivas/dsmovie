package com.devsuperior.dsmove.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.devsuperior.dsmove.dto.MovieDTO;
import com.devsuperior.dsmove.entities.Movie;
import com.devsuperior.dsmove.repositories.MovieRepository;

@Service
public class MovieService 
{
	//--Relacion de Componenetes--//
	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable)
	{
		//--Pagina de la Entidad Move--//
		Page<Movie> result = repository.findAll(pageable);
		
		//--Convierte Pagina de Move a MovieDTO--//
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id)
	{
		//--Pagina de la Entidad Move--//
		Movie result = repository.findById(id).get();
		
		//--Convierte Move a MovieDTO--//
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
	
}
