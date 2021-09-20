package br.com.zup.Aula3Exercicio1;

public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valorDoCarro;

    public Carro(){

    }

    public Carro(String nome, double peso, String fabricante, String cor, double valorDoCarro){
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valorDoCarro = valorDoCarro;
    }

    public void mostrarDados(){
        System.out.println("Nome do Carro: " +nome);
        System.out.println("Peso do Carro: " +peso);
        System.out.println("Fabricante do Carro: " +fabricante);
        System.out.println("Cor do Carro: " +cor);
        System.out.println("Valor do Carro: R$ " +valorDoCarro);
    }

    public void descontoDoCarro(double valorDoDesconto){
        valorDoCarro = valorDoCarro - (valorDoCarro * valorDoDesconto / 100);
    }

    public void pintar(String novaCor){
       cor = novaCor;
    }
}
