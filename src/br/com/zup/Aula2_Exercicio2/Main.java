package br.com.zup.Aula2_Exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa humano = new Pessoa("Maicon", 28, 1.90);
        humano.peso = 0;

        System.out.println("Seu nome é: " + humano.nome);
        System.out.println("Sua idade é: " + humano.idade);
        System.out.println("Seu peso é: " + humano.peso);
        System.out.println("Sua altura é: " + humano.altura);
    }
}
