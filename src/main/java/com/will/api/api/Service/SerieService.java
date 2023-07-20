package com.will.api.api.Service;

import com.will.api.api.Entity.Serie;
import com.will.api.api.Repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {


    @Autowired
    SerieRepository serieRepository;

    public List<Serie> findAll(){
        return this.serieRepository.findAll();
    }

    public Serie publicarSerie(Serie serie){
        return this.serieRepository.save(serie);
    }





}
