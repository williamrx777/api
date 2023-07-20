package com.will.api.Service;

import com.will.api.Dto.FilmesDTO;
import com.will.api.Entity.Filmes;
import com.will.api.Repositories.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesServices {
    @Autowired
    FilmesRepository filmesRepository;

    public List<Filmes> findAll(){
        return filmesRepository.findAll();
    }

    public Filmes publicarFilmes(Filmes filmes){
        return this.filmesRepository.save(filmes);
    }

}
