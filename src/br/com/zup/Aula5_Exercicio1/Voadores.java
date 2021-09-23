package br.com.zup.Aula5_Exercicio1;

public class Voadores extends Inimigo{
    private double danoTiro;

    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public double aplicarDano(){
        double dano = getVida() - danoTiro;
        return dano;
    }
}
