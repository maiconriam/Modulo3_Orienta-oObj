package br.com.zup.Aula6_Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Imobiliaria imovel = new Imobiliaria();
        System.out.println("---------");
        System.out.println("Bem vindo a Imobiliaria Você sem casa, minha felicidade");

        boolean menu = true;
        int escolha;

        while (menu){
            System.out.println("Digite 1: Para cadastrar um imovel");
            System.out.println("Digite 2: Para ver a lista de imovel");
            System.out.println("Digite 3: Para sair do programa");
            escolha = leitor.nextInt();
            leitor.nextLine();

            if(escolha == 1){
                System.out.println("Digite o nome do Imovel");
                String nome = leitor.nextLine();
                System.out.println("Digite o endereço do imovel");
                String endereco = leitor.nextLine();
                System.out.println("Digite o valor do Aluguel");
                double aluguel = leitor.nextDouble();
                System.out.println("Digite o nome do responsavel");
                String nomeResponsavel = leitor.nextLine();
                leitor.nextLine();

                Imovel novoImovel = new Imovel(nome, endereco, aluguel, nomeResponsavel);
                System.out.println("Quantos moradores irão morar no imovel?");
                int moradores = leitor.nextInt();
                leitor.nextLine();
                for (int contador = 1; contador <= moradores; contador++){
                    System.out.println("Digite o nome do morador:");
                    String nomeDoMorador = leitor.nextLine();

                    Morador novoMorador = new Morador(nomeDoMorador);
                    novoImovel.adicionarMorador(novoMorador);
                }
                imovel.adicionarImovel(novoImovel);
            }

            if(escolha == 2){
                System.out.println(imovel);
            }
            if(escolha == 3){
                System.out.println("Programa finalizado.");
                menu = false;
            }
        }
    }
}
