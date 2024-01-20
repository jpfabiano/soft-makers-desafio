package com.jpfabiano.softmakersdesafios.models;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Pet")
public class PetModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPet;
    private String nome;
    private int idade;
    private String especie;
    private String raca;
    @ManyToOne
    @JoinColumn(name = "idDono")
    private DonoModel dono;

    public Long getID() {
        return idPet;
    }

    public void setID(Long idPet) {
        this.idPet = idPet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public DonoModel getDono() {
        return dono;
    }

    public void setDono(DonoModel dono) {
        this.dono = dono;
    }
}



