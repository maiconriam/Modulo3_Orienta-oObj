package br.com.zup.Aula3_Exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro palio = new Carro("Palio", 800, "Fiat", "Vermelho", 25000);
        palio.mostrarDados();
        palio.descontoDoCarro(15);
        System.out.println("---------");
        palio.mostrarDados();
        System.out.println("---------");
        palio.pintar("Amarelo");
        palio.mostrarDados();
    }
}
