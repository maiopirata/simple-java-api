package com.test.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Pokemon {

    private final List<SinglePokemonModel> results;

    public Pokemon() throws IOException {
        File resource = new ClassPathResource("response.json").getFile();
        String resourceText = new String(Files.readAllBytes(resource.toPath()));
        ObjectMapper mapper = new ObjectMapper();
        PokeapiPokemonModel actualObj = mapper.readValue(resourceText, PokeapiPokemonModel.class);

        this.results = actualObj.results.stream()
                .map(p -> p.mapPokeapiToPoke())
                .collect(Collectors.toList());
    }
    public List<SinglePokemonModel> getAll() {
        return results;
    }
    public SinglePokemonModel getSingle(String id) {
        try {
            Integer pokemonId = parseInt(id);
            if (pokemonId < 152) {
                return results.get(pokemonId - 1);
            } else {
                System.out.println("no such pokemon");
                return results.get(1);
            }
        } catch(Exception e) {
            System.out.println("no such pokemon");
            return results.get(1);
        }
    }
}
