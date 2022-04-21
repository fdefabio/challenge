package com.challenge.carChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class carril {
    private final Integer numero;
    private final Integer kilometros;
    private List<carro> carros;

    public carril(Integer numero, Integer kilometros) {
        this.kilometros = Objects.requireNonNull(kilometros);
        this.carros     = new ArrayList<>();
        this.numero     = Objects.requireNonNull(numero);
        if(kilometros <= 0){
            throw new IllegalArgumentException("kilometraje no permitido");
        }

    }

    public void agregarCarro(carro carro){
        carros.add(carro);
    }

    public  Integer kilometros(){
        return kilometros;
    }

    public Integer numero (){
        return numero;
    }

}
