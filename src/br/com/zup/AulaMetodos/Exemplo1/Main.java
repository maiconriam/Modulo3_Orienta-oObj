package br.com.zup.AulaMetodos.Exemplo1;

public class Main {
    public static void main(String[] args) {
        Cachorro bob = new Cachorro("Puddle", "Pequeno", 5, 500);
        Cachorro salsicha = new Cachorro("salsicha", "grande", 7, 700);
        Baleia dory = new Baleia(700,50, "Aquatico", "Peixe");
        Baleia dory2 = new Baleia(800,100,"Terrestre", "Humana");

        bob.mostrarDados();
        salsicha.mostrarDados();
        dory.mostrarDados();
        dory2.mostrarDados();
    }
}
