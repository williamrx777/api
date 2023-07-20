package com.will.api.api.Service;

import com.will.api.api.Entity.Filmes;
import com.will.api.api.Repositories.FilmesRepository;
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
