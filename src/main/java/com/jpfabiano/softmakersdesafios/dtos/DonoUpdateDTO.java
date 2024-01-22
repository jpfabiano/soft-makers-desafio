package com.jpfabiano.softmakersdesafios.dtos;
import  com.jpfabiano.softmakersdesafios.models.DonoModel;
public record DonoUpdateDTO(String nome, Integer idade, Integer phone, String bairro, String rua, Integer numero) {
    @Override
    public String nome() {
        return nome;
    }
    @Override
    public Integer idade() {
        return idade;
    }

    @Override
    public Integer phone() {
        return phone;
    }

    @Override
    public String bairro() {
        return bairro;
    }

    @Override
    public String rua() {
        return rua;
    }

    @Override
    public Integer numero() {
        return numero;
    }
}
