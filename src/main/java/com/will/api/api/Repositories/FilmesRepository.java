package com.will.api.api.Repositories;

import com.will.api.api.Entity.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepository extends JpaRepository<Filmes,Long> {
}
