package br.com.zup.Aula3_Exercicio3;

public class Main {
    public static void main(String[] args) {
        Elevador exemplo = new Elevador(1, 10,10,2);
        //Mostrar dados
        exemplo.mostrarDados();
        System.out.println("-----");

        //Entrando pessoas
        exemplo.entrar(2);
        System.out.println("-----");

        //Saindo pessoas
        exemplo.sair(1);
        System.out.println("-----");

        //Elevador subindo
        exemplo.sobe(2);
        System.out.println("-----");

        //Elevador descendo
        exemplo.desce(3);
    }
}
