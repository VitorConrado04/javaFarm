package br.com.joaocarloslima;

import java.util.ArrayList;

public class Fazenda {
    ArrayList<Terreno> terrenos;
    Celeiro celeiro = new Celeiro(100,5,5,5);


    public Fazenda() {
        terrenos = new ArrayList<>();
        for(int i= 0; i < 13; i++){
            for(int j=0; j < 13; j = j + 1){
                terrenos.add(new Terreno(i,j));
            }
        }

    }

    public void plantarBatata(int x, int y){
        if(celeiro.getQtdeBatatas() != 0){
            if(!getTerreno(x, y).estaOcupado()){
                getTerreno(x, y).plantar(new Batata(1,1,3));
                celeiro.consumirBatata();
            }
        }
    }

    public void plantarCenoura(int x, int y){
        if(celeiro.getQtdeCenouras() != 0){
            if(!getTerreno(x, y).estaOcupado()){
                getTerreno(x, y).plantar(new Cenoura(1,1,3));
                celeiro.consumirCenoura();
            }
        }
    }
    public void plantarMorango(int x, int y){
        if(celeiro.getQtdeMorangos() != 0){
            if(!getTerreno(x, y).estaOcupado()){
                getTerreno(x, y).plantar(new Morango(1,1,3));
                celeiro.consumirMorango();
            }
        }
    }

    public Terreno getTerreno(int x, int y) {
        for (Terreno terreno : terrenos) {
            if (terreno.getX() == x && terreno.getY() == y) {
                return terreno;
            }
        }
        return null;
    }

    public void colher(int x, int y){
        getTerreno(x, y).colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}