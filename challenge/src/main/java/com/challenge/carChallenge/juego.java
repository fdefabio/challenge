package com.challenge.carChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class juego {
    private final podium podium;
    private final pista pista;
    private Estado estado;

    public juego(Integer numCarriles , Integer kilometros , String nombreDepista){
        Map <Integer , carril> carriles = generarCarriles(numCarriles , kilometros);
        this.pista  = new pista (UUID.randomUUID().toString(),carriles , nombreDepista);
        this.podium = new podium();
        estado      = Estado.NO_INICIADO;
    }


    public void agregarCarroAcarril(Integer carril , carro carro){
        if (Objects.isNull(carro.conductor())){
            throw new IllegalArgumentException("el carro no tiene un conductor");
        }
    }


    public podium iniciarJuego(){
        validarCarriles();
        iniciarCarros();
        do {
            estado = Estado.INICIADO;
            pista.carriles().forEach(moverEnCarril());
        } while (estado.equals(Estado.INICIADO));
        return podium;
    }


    private Map <Integer , carril> generarCarriles(Integer numCarriles , Integer kilometros){
        Map <Integer , carril> carriles = new HashMap <>();
        for(int i = 1; numCarriles >= i ; i++){
            carriles.put(i, new carril (i , kilometros));
        }
        return carriles;

    }



    private void validarCarriles(){
        int cantidadDeCarros = 0;
        for (carril carril : pista.carriles().values()){
            cantidadDeCarros = carril.carros().size()+cantidadDeCarros;
        }
        if(cantidadDeCarros <= 2){
            throw new IllegalStateException("no tiene la cantidad de carros suficientes");
        }
    }




    private void iniciarCarros(){
         pista.carriles().values().forEach(carril -> carril.carros().forEach(carro::iniciar));
    }



    private BiConsumer <Integer , carril> moverEnCarril(){
        return (id , carril) -> carril.carros().forEach(moverCarro(carril));
    }

    private Consumer<carro> moverCarro(carril carril){
        return carro -> {
            int dado = carro.conductor().lanzarDado();
            IntStream.range((0, dado * 100).forEach(value -> carro.aumentarVelocidad());
            determinarGanador(carril , carro);
        };
    }

    private void determinarGanador(carril carril, carro carro){
        if(carro.estaEnMarcha()){
            double progreso = carril.progresoCarro(carro.placa());
            if(progreso >= 100){
                determinarPodium(carro);
            }
        }
    }


    private void determinarPodium(carro carro) {
        if (Objects.isNull(podium.getPrimero())) {
            podium.setPrimero(carro.conductor());
            carro.detener();
        }else if(Objects.isNull(podium.getSegundo())){
            podium.setSegundo(carro.conductor());
            carro.detener();
        } else if (Objects.isNull(podium.getTercero())) {
            podium.setTercero(carro.conductor());
            carro.detener();
            finDeJuego();
        }

    }


    private void finDeJuego(){
        estado = estado.FINALIZADO;
    }

    public enum Estado {
        INICIADO,FINALIZADO,NO_INICIADO
    }

}
