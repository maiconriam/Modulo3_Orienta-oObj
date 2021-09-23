package br.com.zup.AulaHeranca.Exemplo2;

public class Voadores extends Inimigos{
    private double velocidadeDeVoo;
    private int dano = 110;

    public Voadores(String nome, String cor, String tipoDeAtaque, int vida, double velocidadeDeVoo) {
        super(nome, cor, tipoDeAtaque, vida);
        this.velocidadeDeVoo = velocidadeDeVoo;
    }

    public double getVelocidadeDeVoo() {
        return velocidadeDeVoo;
    }

    public void setVelocidadeDeVoo(double velocidadeDeVoo) {
        this.velocidadeDeVoo = velocidadeDeVoo;
    }

    public int aplicarDano(){
        return dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void perderVida(int dano){
        int aplicaDano = this.getVida() - dano;
        setVida(aplicaDano);
    }
}
