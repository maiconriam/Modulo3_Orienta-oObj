package br.com.zup.Aula5_Exercicio1;

public class Guerreiro extends Heroi{
    private double poderAtaque;

    public Guerreiro(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double aplicarDano(){
        return poderAtaque;
    }
}
