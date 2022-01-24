package com.test.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import static java.lang.Integer.parseInt;

public class PokeapiSinglePokemonModel {
    @JsonProperty("name")
    public String name;

    @JsonProperty("url")
    public String url;

    public SinglePokemonModel mapPokeapiToPoke() {
        String[] splittedUrl = url.split("/");
        Integer newId = parseInt(splittedUrl[splittedUrl.length-1]);
        SinglePokemonModel newPokemon = new SinglePokemonModel(newId, name);
        return newPokemon;
    }
}
