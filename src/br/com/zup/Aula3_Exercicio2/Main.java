package br.com.zup.Aula3_Exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria maicon = new ContaBancaria("8484848484", 500, "Maicon Riam");
        //Extrato
        maicon.mostrarDados();
        maicon.setNumeroDaConta("489484844848");
        maicon.setNomeDoCorrentista("Amanda Mandira");

        //Saque da conta
        maicon.saque(400);
        System.out.println("------");

        //Extrato
        maicon.mostrarDados();
        System.out.println("-----");

        //Deposito
        maicon.depositar(300);
        maicon.mostrarDados();
    }
}
