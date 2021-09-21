package br.com.zup.Aula3_ExComplementar2;

public class Quadrado {
    double tamanhoDoLado;

    public Quadrado(double tamanhoDoLado){
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public void mudarValorDoLado(double valor){
        tamanhoDoLado = valor;
    }

    public double retornaValorDoLado(){
        return tamanhoDoLado;
    }

    public void tamanhoDaArea(){
        double area = tamanhoDoLado * tamanhoDoLado;
        System.out.println("O tamanho da area é: " + area);
    }
}
