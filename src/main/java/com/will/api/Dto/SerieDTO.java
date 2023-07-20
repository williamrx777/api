package com.will.api.Dto;

import com.will.api.Entity.Serie;
import jakarta.persistence.Column;

public class SerieDTO {

    private String title;

    private String description;

    private String image;

    private String url;

    public SerieDTO() {
    }

    public SerieDTO(String title, String description, String image, String url) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static SerieDTO toSerieDTO(Serie serie){
        SerieDTO serieDTO = new SerieDTO();
        serieDTO.setTitle(serie.getTitle());
        serieDTO.setDescription(serie.getDescription());
        serieDTO.setImage(serie.getImage());
        serieDTO.setUrl(serie.getUrl());
        return serieDTO;
    }

    public static Serie toSerieEntity(SerieDTO serieDTO){
        Serie serie = new Serie();
        serie.setTitle(serieDTO.getTitle());
        serie.setDescription(serieDTO.getDescription());
        serie.setImage(serieDTO.getImage());
        serie.setUrl(serieDTO.getUrl());
        return serie;
    }


    @Override
    public String toString() {
        return "SerieDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
