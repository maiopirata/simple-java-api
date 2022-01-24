package com.test.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class PokeapiPokemonModel {
    @JsonProperty("count")
    public Integer count;

    @JsonProperty("next")
    public String next;

    @JsonProperty("previous")
    public String previous;

    @JsonProperty("results")
    public List<PokeapiSinglePokemonModel> results;
}
