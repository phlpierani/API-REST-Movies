package com.example.demo.repository;

import com.example.demo.domain.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FilmeRepository extends JpaRepository<Filmes, Long> {

    List<Filmes> findByName(String name);
}