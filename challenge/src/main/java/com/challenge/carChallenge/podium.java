package com.challenge.carChallenge;

public class podium {

    private conductor primero;
    private conductor segundo;
    private conductor tercero;


    public conductor getPrimero() {
        return primero;
    }

    public void setPrimero(conductor primero) {
        this.primero = primero;
    }

    public conductor getSegundo() {
        return segundo;
    }

    public void setSegundo(conductor segundo) {
        this.segundo = segundo;
    }

    public conductor getTercero() {
        return tercero;
    }

    public void setTercero(conductor tercero) {
        this.tercero = tercero;
    }

    @Override
    public String toString(){
        return "Podium{" +
                "primero" + primero +
                "segundo" + segundo +
                "tercero" + tercero +
                "}";
    }

}
