package br.com.zup.Aula2_Exercicio3;

public class Main {
    public static void main(String[] args) {
        Conta_Corrente conta = new Conta_Corrente("848449894986", "Maicon");
        conta.saldo = 0;

        System.out.println("Número da conta: " +conta.numeroDaConta);
        System.out.println("Nome do correntista: " +conta.nome);
        System.out.println("Saldo: " + conta.saldo);
    }
}
