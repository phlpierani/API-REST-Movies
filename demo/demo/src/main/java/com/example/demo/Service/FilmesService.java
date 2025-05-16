package com.example.demo.Service;

import com.example.demo.domain.Filmes;
import com.example.demo.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class FilmesService {

    private final FilmeRepository filmeRepository;

    public List<Filmes> listALL() {
        return filmeRepository.findAll(); // lógica de acesso ao banco fica aqui
    }

    public Filmes save(Filmes filmes) { // Salva o filme no banco
        return filmeRepository.save(filmes); // Salva o filme no banco
    }

    public List<Filmes> findByName(String name){
        return filmeRepository.findByName(name); // Busca o filme pelo nome
    }

    public Filmes findById(long id) {
        // Busca o filme pelo id
        return filmeRepository.findById(id).orElseThrow(() -> new RuntimeException("Filme não encontrado"));
    }

    //POST
    public Filmes create(Filmes filmes) {
        // Cria e salva o filme no banco
        return filmeRepository.save(filmes);
    }

    public Filmes delete(long id) {
        Filmes filme = filmeRepository.findById(id).orElseThrow(() -> new RuntimeException("Filme não encontrado"));
        // Verifica se o filme existe
        filmeRepository.delete(filme); // Deleta o filme do banco
        return filme; // Retorna o filme deletado
    }

    public Filmes update(Filmes filmes) {
        // Atualiza o filme no banco
        return filmeRepository.save(filmes);
    }
}

