package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    //Constructor da classe Celeiro
    public Celeiro(int capacidade, int qtdeBatatas, int qtdeCenouras, int qtdeMorangos) {
        this.capacidade = capacidade;
        this.qtdeBatatas = qtdeBatatas;
        this.qtdeCenouras = qtdeCenouras;
        this.qtdeMorangos = qtdeMorangos;
    }

    //Métodos de acesso aos parâmetros da classe
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public void setQtdeBatatas(int qtdeBatatas) {
        this.qtdeBatatas = qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public void setQtdeCenouras(int qtdeCenouras) {
        this.qtdeCenouras = qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }

    public void setQtdeMorangos(int qtdeMorangos) {
        this.qtdeMorangos = qtdeMorangos;
    }

    //Metodo para verificar o espaço disponível
    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
    }

    //Metodo para aramazenar batatas
    public void armazenarBatata() {
        //Usando 2 ao invés de 0 pois deve aramzenar DUAS unidades do produto
        if (getEspacoDisponivel() >= 2) {
            qtdeBatatas = qtdeBatatas + 2;
        } else {
            throw new IllegalStateException("Celeiro está cheio!");
        }
    }

    //Metodo para aramazenar cenouras
    public void armazenarCenoura() {
        //Usando 2 ao invés de 0 pois deve aramzenar DUAS unidades do produto
        if (getEspacoDisponivel() >= 2) {
            qtdeCenouras = qtdeCenouras + 2;
        } else {
            throw new IllegalStateException("Celeiro está cheio!");
        }
    }

    //Metodo para aramazenar morangos
    public void armazenarMorango() {
        //Usando 2 ao invés de 0 pois deve aramzenar DUAS unidades do produto
        if (getEspacoDisponivel() >= 2) {
            qtdeMorangos = qtdeMorangos + 2;
        } else {
            throw new IllegalStateException("Celeiro está cheio!");
        }
    }

    //Metodo para consumir batatas
    public void consumirBatata() {
        if (qtdeBatatas > 0) {
            qtdeBatatas = qtdeBatatas - 1;
        } else {
            throw new IllegalStateException("Produto indisponível no estoque");
        }
    }

    //Metodo para consumir cenoras
    public void consumirCenoura() {
        if (qtdeCenouras > 0) {
            qtdeCenouras = qtdeCenouras - 1;
        } else {
            throw new IllegalStateException("Produto indisponível no estoque");
        }
    }

    //Metodo para consumir morangos
    public void consumirMorango() {
        if (qtdeMorangos > 0) {
            qtdeMorangos = qtdeMorangos - 1;
        } else {
            throw new IllegalStateException("Produto indisponível no estoque");
        }
    }

    //Metodo para verificar a porcentagem de ocupação
    public double getOcupacao() {
        double ocupado = qtdeBatatas + qtdeCenouras + qtdeMorangos;
        return (ocupado / capacidade) * 100;
    }

    //Metodo para veriifcar se o celeiro está cheio
    public boolean celeiroCheio(){
        if (getEspacoDisponivel() == 0){
            return true;
        } else {
            return false;
        }
    }
}
