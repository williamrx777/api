package com.will.api.Repositories;

import com.will.api.Entity.Animes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimesRepository extends JpaRepository<Animes, Long> {
}
