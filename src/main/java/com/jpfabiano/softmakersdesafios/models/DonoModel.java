package com.jpfabiano.softmakersdesafios.models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "Dono")
public class DonoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDono;
    private String nome;
    private int idade;
    private int phone;
    private String bairro;
    private String rua;
    private int numero;

    public Long getIdDono() {
        return idDono;
    }

    public void setIdDono(Long idDono) {
        this.idDono = idDono;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
