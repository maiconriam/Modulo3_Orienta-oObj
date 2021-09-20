package br.com.zup.AulaMetodos.Exemplo1;

public class Baleia {
    double tamanho;
    double peso;
    String habitat;
    String especie;

    public Baleia(double tamanho, double peso, String habitat, String especie){
        this.tamanho = tamanho;
        this.peso = peso;
        this.habitat = habitat;
        this.especie = especie;
    }
    public void mostrarDados(){
        System.out.println("Tamanho: " +tamanho);
        System.out.println("Peso: " +peso);
        System.out.println("Habitat: " +habitat);
        System.out.println("Especie: " +especie);
    }
}
