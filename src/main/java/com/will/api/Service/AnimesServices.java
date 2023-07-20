package com.will.api.Service;

import com.will.api.Entity.Animes;
import com.will.api.Repositories.AnimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimesServices {

    @Autowired
    AnimesRepository animesRepository;

    public List<Animes> findAll(){
        return animesRepository.findAll();
    }

    public Animes publicarAnimes(Animes animes){
        return this.animesRepository.save(animes);
    }


}
