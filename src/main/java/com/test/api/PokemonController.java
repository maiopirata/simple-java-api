package com.test.api;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonController {

    @GetMapping("/pokemon")
    public List<SinglePokemonModel> getPokemonList() throws IOException {
        return new Pokemon().getAll();
    }

    @RequestMapping(value="/pokemon/{id}", method = RequestMethod.GET)
    public SinglePokemonModel getPokemon(@PathVariable String id) throws IOException {
        return new Pokemon().getSingle(id);
    }
}
