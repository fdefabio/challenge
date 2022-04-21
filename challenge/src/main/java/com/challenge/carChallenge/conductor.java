package com.challenge.carChallenge;

import java.util.Random;

public class conductor extends jugador{
    private final String id;
    private String nombre;
     public conductor(String id , String nombre , String email , String username){
         super(id , email , username);
         this.id     = id;
         this.nombre = nombre;
     }

     public Integer lanzarDado(){
         Random random = new Random();
         return random.nextInt(bound:6)+1;
     }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
         return "Conductor{" +
                 "id: "      + id + " " +
                 ", nombre: "+ nombre + "";

    }
}

