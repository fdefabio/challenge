package com.challenge.carChallenge;

import java.util.Map;

public class pista {
    private final String id;
    private final Map<Integer , carril > carriles;
    private String nombre;

    public pista(String id , Map <Integer , carril>carriles , String nombre ){
        this.id       = id;
        this.carriles = carriles;
        this.nombre   = nombre;
    }

    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }

    public String id(){
        return id;
    }

    public String nombre(){
        return nombre;
    }

    public Map<Integer , carril> carriles(){
        return carriles;
    }

    public void agregarCarroACarril(Integer numeroCarril , carro carro){
        carriles.get(numeroCarril).agregarCarro(carro);
    }
}
