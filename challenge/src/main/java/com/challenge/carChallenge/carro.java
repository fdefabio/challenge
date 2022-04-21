package com.challenge.carChallenge;

import java.util.Objects;

public class carro {
    private final Color color;
    private final String placa;
    private conductor conductor;
    private Integer metros;
    private boolean estaEnMarcha;

    public carro(Color color , String placa , Integer metros){
        this.color  = Objects.requireNonNull(color);
        this.placa  = Objects.requireNonNull(placa);
        this.metros = Objects.requireNonNull(metros);
        this.estaEnMarcha = false;
        if(metros < 0){
            throw new IllegalArgumentException("NO se pueden tener metos negativos");
        }
    }

    public carro(Color color , String placa){this(color , placa, metros: 0);}

    public void agregarConductor(conductor conductor){
        this.conductor = Objects.requireNonNull(conductor);
    }

    public void iniciar(){
        this.estaEnMarcha = true;
    }

    public void aumentarVelocidad(){
        if(this.estaEnMarcha = true){
            this.metros = metros + 1;
        }
    }

    public double kilometros(){
        return Math.ceil((double)metros/1000);
    }

    public void detener (){
        this.estaEnMarcha = false;
    }


    public Integer metros(){
        return metros;
    }

    public conductor conductor(){
        return conductor;
    }

    public Color color (){
        return color;
    }

    public String placa(){
        return placa;
    }

    public boolean estaEnMarcha(){
        return estaEnMarcha;
    }

   public enum Color{
        ROJO , BLANCO , NEGRO , AZUL
    }

   @Override
   public String toString(){
        return "Carro{"+
                "color: "     + color +
                "conductor: " + conductor+
                "metros"      + metros+ "}";
    }

}

