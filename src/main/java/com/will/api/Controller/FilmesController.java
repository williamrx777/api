package com.will.api.Controller;

import com.will.api.Dto.FilmesDTO;
import com.will.api.Entity.Filmes;
import com.will.api.Service.FilmesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/filmes")
public class FilmesController {

    @Autowired
    FilmesServices filmesServices;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FilmesDTO> findAll(){
        List<Filmes> filmes = filmesServices.findAll();
        return filmes.stream().map(FilmesDTO::toFilmesDto).collect(Collectors.toList());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public FilmesDTO postarFilmes(@RequestBody FilmesDTO filmesDTO){
        Filmes filmes = FilmesDTO.toFilmesEntity(filmesDTO);
        Filmes novoFilmes = filmesServices.publicarFilmes(filmes);
        return FilmesDTO.toFilmesDto(novoFilmes);
    }

}
