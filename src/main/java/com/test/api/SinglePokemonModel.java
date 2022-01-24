package com.test.api;

public class SinglePokemonModel {
    private Integer id;
    private String name;

    public SinglePokemonModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Integer getId() {
        return id;
    }
}
