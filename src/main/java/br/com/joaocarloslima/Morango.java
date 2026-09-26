package br.com.joaocarloslima;

public class Morango {

    //Atributos do morango
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    // Construtor do morango
    public Morango(int tempoDeVida, int tamanho, int tempoDeCrescimento) {
        this.tempoDeVida = tempoDeVida;
        this.tamanho = tamanho;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    //Métodos de acesso dos atributos
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public void setTempoDeVida(int tempoDeVida) {
        this.tempoDeVida = tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }

    public void setTempoDeCrescimento(int tempoDeCrescimento) {
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    //Metodo para que o vegetal cresça
    public void crescer() {
        tempoDeVida = tempoDeVida + 1;
        if (tempoDeVida % tempoDeCrescimento == 0 && tamanho < 4) {
            tamanho = tamanho + 1;
        }
    }

    //Metodo para que se possa colher o vegetal
    public boolean podeColher() {
        if (tamanho == 4) {
            return true;
        }
        return false;
    }
    //Metodo para selecionar a imagem
    public String getImagem() {
        return "images/morango" + tamanho + ".png";
    }

}
