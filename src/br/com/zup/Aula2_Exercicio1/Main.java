package br.com.zup.Aula2_Exercicio1;

public class Main {
    public static void main(String[] args) {
        Bola redonda = new Bola();

        redonda.circunferencia = "Redonda";
        redonda.cor = "Branca e Preta";
        redonda.marca = "Nike";
        redonda.velocidade = 9.99;

        System.out.println("Sua bola é: " + redonda.circunferencia);
        System.out.println("A cor da bola é: " + redonda.cor);
        System.out.println("A marca da bola é: " + redonda.marca);
        System.out.println("A velocidade que a bola atinge é: " + redonda.velocidade);
        System.out.println();

        Bola quadrada = new Bola("Quadrada", "vermelha", "Adidas", 10);

        System.out.println("Sua bola é: " + quadrada.circunferencia);
        System.out.println("A cor da bola é: " + quadrada.cor);
        System.out.println("A marca da bola é: " + quadrada.marca);
        System.out.println("A velocidade que a bola atinge é: " + quadrada.velocidade);
    }


}
