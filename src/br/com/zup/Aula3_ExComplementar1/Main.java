package br.com.zup.Aula3_ExComplementar1;

public class Main {
    public static void main(String[] args) {
        Bola jabulani = new Bola("Branca e Preta", 50, "Borracha");
        //Trocando a cor
        jabulani.trocarCor("Preta e vermelha");
        //Mostrando a troca
        jabulani.mostrarCor();
    }
}
