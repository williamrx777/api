package com.will.api.Controller;

import com.will.api.Dto.AnimesDTO;
import com.will.api.Dto.FilmesDTO;
import com.will.api.Entity.Animes;
import com.will.api.Entity.Filmes;
import com.will.api.Service.AnimesServices;
import com.will.api.Service.FilmesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animes")
public class AnimesController {

    @Autowired
    AnimesServices animesServices;

    @GetMapping
    public List<AnimesDTO> findAll(){
        List<Animes> animes = animesServices.findAll();
        return animes.stream().map(AnimesDTO::toAnimesDto).collect(Collectors.toList());
    }

    @PostMapping
    public AnimesDTO postarFilmes(@RequestBody AnimesDTO animesDTO){
        Animes animes = AnimesDTO.toAnimesEntity(animesDTO);
        Animes novoAnime = animesServices.publicarAnimes(animes);
        return AnimesDTO.toAnimesDto(novoAnime);
    }

}
