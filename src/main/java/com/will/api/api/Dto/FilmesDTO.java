package com.will.api.api.Dto;

import com.will.api.api.Entity.Filmes;

public class FilmesDTO {

    private String title;
    private String description;
    private String image;
    private String url;

    public FilmesDTO() {
    }

    public FilmesDTO(String title, String description, String image, String url) {
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

    public static FilmesDTO toFilmesDto(Filmes filmes){
        FilmesDTO filmesDTO = new FilmesDTO();

        filmesDTO.setTitle(filmes.getTitle());
        filmesDTO.setDescription(filmes.getDescription());
        filmesDTO.setImage(filmes.getImage());
        filmesDTO.setUrl(filmes.getUrl());
        return filmesDTO;
    }

    public static Filmes toFilmesEntity(FilmesDTO filmesDTO){
        Filmes filmes = new Filmes();

        filmes.setTitle(filmesDTO.getTitle());
        filmes.setDescription(filmesDTO.getDescription());
        filmes.setImage(filmesDTO.getImage());
        filmes.setUrl(filmesDTO.getUrl());
        return filmes;
    }

    @Override
    public String toString() {
        return "FilmesDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
