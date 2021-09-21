package br.com.zup.Aula3_ExComplementar1;

public class Bola {
    String cor;
    int circuferencia;
    String material;

    public Bola(String cor, int circuferencia, String material){
        this.cor = cor;
        this.circuferencia = circuferencia;
        this.material = material;
    }

    public void mostrarCor(){
        System.out.println("A cor da sua bola é: " + cor);
        System.out.println("A ciruferencia é: " + circuferencia);
        System.out.println("O material é: " + material);
    }

    public void trocarCor(String valor){
        cor = valor;
    }
}
