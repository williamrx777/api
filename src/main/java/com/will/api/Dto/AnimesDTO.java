package com.will.api.Dto;

import com.will.api.Entity.Animes;
import com.will.api.Entity.Filmes;

public class AnimesDTO {

    private String title;
    private String description;
    private String image;
    private String url;

    public AnimesDTO() {
    }

    public AnimesDTO(String title, String description, String image, String url) {
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

    public static AnimesDTO toAnimesDto(Animes animes){
        AnimesDTO animesDTO = new AnimesDTO();

        animesDTO.setTitle(animes.getTitle());
        animesDTO.setDescription(animes.getDescription());
        animesDTO.setImage(animes.getImage());
        animesDTO.setUrl(animes.getUrl());
        return animesDTO;
    }

    public static Animes toAnimesEntity(AnimesDTO animesDTO){
        Animes animes = new Animes();

        animes.setTitle(animesDTO.getTitle());
        animes.setDescription(animesDTO.getDescription());
        animes.setImage(animesDTO.getImage());
        animes.setUrl(animesDTO.getUrl());
        return animes;
    }

    @Override
    public String toString() {
        return "AnimesDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
