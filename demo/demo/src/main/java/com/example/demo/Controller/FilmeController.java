package com.example.demo.Controller;

import com.example.demo.Service.FilmesService;
import com.example.demo.domain.Filmes;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmesService filmesService;

    // retorna todos os filmes
    @GetMapping(path = "/all")
    public List<Filmes> listALL() {
        return filmesService.listALL(); // lógica de acesso ao banco fica aqui
    }

    // retorna o filme pelo NOME
    @GetMapping("/find")
    public List<Filmes> findByName(@RequestParam String name) {
        return filmesService.findByName(name); // Corrigido: retorna uma lista
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Filmes create(@RequestBody @Valid Filmes filmes){
        return filmesService.create(filmes);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        filmesService.delete(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Filmes update(@RequestBody Filmes filmes) {
        return filmesService.save(filmes);
    }
}
