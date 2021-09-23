package br.com.zup.AulaHeranca.Exemplo2;

public class Guerreiros extends Heroi{
    private String arma;
    private int dano = 400;

    public Guerreiros(String nome, String poder, String protecao, int vida, String arma) {
        super(nome, poder, protecao, vida);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void perderVida(int dano){
        int aplicaDano = this.getVida() - dano;
        this.setVida(aplicaDano);
    }

    public int aplicaDano(){
        return dano;
    }
}
