package com.jpfabiano.softmakersdesafios.dtos;

import jakarta.validation.constraints.Pattern;

public record PetUpdateDTO (String nome, Integer idade, @Pattern(regexp = "^(Cachorro|Gato)$")String especie,  String raca){
    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Integer idade() {
        return idade;
    }

    @Override
    public String especie() {
        return especie;
    }

    @Override
    public String raca() {
        return raca;
    }
}
