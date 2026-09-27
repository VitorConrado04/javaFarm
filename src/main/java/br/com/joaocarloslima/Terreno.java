package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    //Construtor da classe terreno
    public Terreno(Batata batata, Cenoura cenoura, Morango morango, int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Terreno(int i, int j) {
        this.x = i;
        this.y = j;
    }

    //Métodos de acesso aos parâmetros da classe
    public Batata getBatata() {
        return batata;
    }

    public void setBatata(Batata batata) {
        this.batata = batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public void setCenoura(Cenoura cenoura) {
        this.cenoura = cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public void setMorango(Morango morango) {
        this.morango = morango;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Metodo para plantar uma batata
    public void plantar(Batata batata) {
        if (this.batata == null && morango == null && cenoura == null) {
            this.batata = batata;
        }
    }

    //Metodo para plantar um morango
    public void plantar(Morango morango) {
        if (batata == null && this.morango == null && cenoura == null) {
            this.morango = morango;
        }
    }

    //Metodo para plantar uma cenoura
    public void plantar(Cenoura cenoura) {
        if (batata == null && morango == null && this.cenoura == null) {
            this.cenoura = cenoura;
        }
    }

    public void colher(Celeiro celeiro) {
        if (batata != null && batata.podeColher()) {
            celeiro.armazenarBatata();
            this.batata = null;
        } else if (morango != null && morango.podeColher()) {
            celeiro.armazenarMorango();
            this.morango = null;
        } else if (cenoura != null && cenoura.podeColher()) {
            celeiro.armazenarCenoura();
            this.cenoura = null;
        }
    }

    public boolean estaOcupado() {
        if (batata != null || morango != null || cenoura != null) {
            return true;
        }
        return false;

    }
}

