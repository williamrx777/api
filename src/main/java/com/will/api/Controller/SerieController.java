package com.will.api.Controller;

import com.will.api.Dto.SerieDTO;
import com.will.api.Entity.Serie;
import com.will.api.Service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

public class SerieController {

    @Autowired
    private SerieService serieService;

    public List<SerieDTO> findAll(){
        List<Serie> series = serieService.findAll();
        return series.stream().map(SerieDTO::toSerieDTO).collect(Collectors.toList());
    }

    public SerieDTO postSerie(@RequestBody SerieDTO serieDTO){
        Serie serie = SerieDTO.toSerieEntity(serieDTO);
        Serie novaSerie = serieService.publicarSerie(serie);
        return SerieDTO.toSerieDTO(novaSerie);
    }

}
