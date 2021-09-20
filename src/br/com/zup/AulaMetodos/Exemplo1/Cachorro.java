package br.com.zup.AulaMetodos.Exemplo1;

public class Cachorro {
    String raca;
    String porte;
    double tamanho;
    double peso;

    public Cachorro(String raca, String porte, double tamanho, double peso){
        this.raca = raca;
        this.porte = porte;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public void mostrarDados(){
        System.out.println("A raça é: " +raca);
        System.out.println("O porte do cachorro é: " +porte);
        System.out.println("O tamanho do cachorro é: " +tamanho);
        System.out.println("O peso do cachorro é: " +peso);
    }
}
