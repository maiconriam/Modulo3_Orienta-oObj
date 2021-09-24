package br.com.zup.Aula5_Exercicio1;

public class Mago extends Heroi{
    private double poderMagico;

    public Mago(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public double aplicarDano(){
        return poderMagico;
    }
}
