package br.com.zup.Aula3_ExComplementar2;

public class Main {
    public static void main(String[] args) {
        Quadrado exemplo = new Quadrado(50);
        exemplo.mudarValorDoLado(70);
        System.out.println(exemplo.tamanhoDoLado);
        exemplo.tamanhoDaArea();
    }
}
