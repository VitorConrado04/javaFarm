package br.com.joaocarloslima;

public class Cenoura {

    //Atributos da cenoura
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    //Construtor da cenoura
    public Cenoura(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
        this.tamanho = tamanho;
        this.tempoDeVida = tempoDeVida;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    //Métodos de acesso aos parâmetros
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
        return "images/cenoura" + tamanho + ".png";
    }


}
