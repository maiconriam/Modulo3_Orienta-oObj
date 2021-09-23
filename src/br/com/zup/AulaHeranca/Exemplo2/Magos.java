package br.com.zup.AulaHeranca.Exemplo2;

public class Magos extends Heroi{
    private String magia;

    public Magos(String nome, String poder, String protecao, int vida, String magia) {
        super(nome, poder, protecao, vida);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}
