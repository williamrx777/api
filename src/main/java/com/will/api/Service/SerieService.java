package com.will.api.Service;

import com.will.api.Entity.Serie;
import com.will.api.Repositories.SerieRepository;
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
