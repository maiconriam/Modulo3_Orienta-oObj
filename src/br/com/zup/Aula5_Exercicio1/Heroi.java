package br.com.zup.Aula5_Exercicio1;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void trocarNome(String nome){
        this.nome = nome;
    }

    public void receberDano(double dano){
            vida = vida - dano;
    }

    public void mostrarDados(){
        System.out.println("Nome do personagem: " +nome);
        System.out.println("Vida do personagem: " +vida);
    }

    public void exibirVida(){
        System.out.println("Sua vida é: " + vida);
    }
}
