package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    //Construtor da classe terreno
    public Terreno(Batata batata, Cenoura cenoura, Morango morango, int x, int y) {
        this.batata = batata;
        this.cenoura = cenoura;
        this.morango = morango;
        this.x = x;
        this.y = y;
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
    public void plantar(Batata batata){
        if (this.batata == null && morango == null && cenoura == null){
            this.batata = batata;
        }
    }

    //Metodo para plantar um morango
    public void plantar(Morango morango){
        if (batata == null && this.morango == null && cenoura == null){
            this.morango = morango;
        }
    }

    //Metodo para plantar uma cenoura
    public void plantar(Cenoura cenoura){
        if (batata == null && morango == null && this.cenoura == null){
            this.cenoura = cenoura;
        }
    }

    /*Metodo para colher
    public void colher (Celeiro celeiro){
            if (batata != null && batata.podeColher()){
                celeiro.armazenarBatata(batata);
                this.batata = null;
            } else if (morango != null && morango.podeColher()) {
                celeiro.armazenarMorango(morango);
                this.morango = null;
            } else if (cenoura != null && cenoura.podeColher()){
                celeiro.armazenarCenoura (cenoura);
                this.cenoura = null;
            }
        }

        public boolean estaOcupado(){
            if (batata != null && batata.podeColher()){
                celeiro.armazenarBatata(batata);
                return false;
            } else if (morango != null && morango.podeColher()) {
                celeiro.armazenarMorango(morango);
                return false;
            } else if (cenoura != null && cenoura.podeColher()){
                celeiro.armazenarCenoura (cenoura);
                return false;
            }
        } */
    }

