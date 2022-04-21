package com.challenge;

import com.challenge.carChallenge.carro;
import com.challenge.carChallenge.conductor;
import com.challenge.carChallenge.juego;
import com.challenge.carChallenge.podium;

public class main {
    public static void main(String args []){
        int numeroCarriles = 3;
        int kilometros   = 200;

        juego juego = new juego (numeroCarriles , kilometros , "Pista sur");

        carro rojo = new carro(carro.Color.ROJO , "SXDDF95");
        rojo.agregarConductor((new conductor( "C1" , "fabio" , "aaa@gmail.com" , "fabiotto")));
        carro azul = new carro(carro.Color.AZUL , "StDD875");
        rojo.agregarConductor((new conductor( "C2" , "diego" , "aaa@gmail.com" , "dddd97")));
        carro negro = new carro(carro.Color.NEGRO , "SXDdad45");
        rojo.agregarConductor((new conductor( "C3" , "carolina" , "aaa@gmail.com" , "karo86")));
        carro blanco = new carro(carro.Color.BLANCO , "dddtr87");
        rojo.agregarConductor((new conductor( "C4" , "cristian" , "aaa@gmail.com" , "cr118")));

        juego.agregarCarroAcarril(1 , rojo);
        juego.agregarCarroAcarril(2 , azul);
        juego.agregarCarroAcarril(3 , negro);
        juego.agregarCarroAcarril(4 , blanco);

        podium podium = juego.iniciarJuego();
        System.out.println(podium);
    }
}
