package br.com.zup.Aula6_Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("Bem vindo a Imobiliaria você sem casa minha felicidade");
        System.out.println("Digite 1 - Para cadastrar um imóvel");
        System.out.println("Digite 2 - Para exibir os imóveis");
        System.out.println("Digite 3 - Para sair");
    }

    public static Morador cadastrarMoradores(){
        String nome = capturarDados("Digite seu nome: ").nextLine();
        Morador morador = new Morador();
        morador.setNome(nome);
        return morador;
    }

    public static List listaDeMoradores(){
        List<Morador> listaMoradores = new ArrayList<>();
        int escolha = capturarDados("Digite quantidade de moradores").nextInt();
        for(int contador = 0; contador < escolha; contador ++){
            listaMoradores.add(cadastrarMoradores());
        }
        return listaMoradores;
    }

    public static Imovel cadastrarImovel(){
        String nomeDoImovel = capturarDados("Digite o nome do Imovel").nextLine();
        String endereco = capturarDados("Digite seu endereço: ").nextLine();
        double valorAluguel = capturarDados("Digite o valor do aluguel: ").nextDouble();
        String nomeResponsavel = capturarDados("Digite o nome do responsavel").nextLine();

        Imovel imovel = new Imovel(nomeDoImovel, endereco, valorAluguel, nomeResponsavel);
        List listaDeMoradores = listaDeMoradores();
        imovel.setMorador(listaDeMoradores);

        return imovel;
    }

    public static void mostrarMenu(){
        Imobiliaria imobiliaria = new Imobiliaria();

        boolean menu = true;
        int escolhaMenu;

        while(menu){
            menu();
            escolhaMenu = capturarDados("Digite sua escolha").nextInt();

            if(escolhaMenu == 1){
                imobiliaria.adicionarImovel(cadastrarImovel());
            }
            if(escolhaMenu == 2){
                System.out.println(imobiliaria);
            }
            if(escolhaMenu == 3){
                System.out.println("Programa finalizado");
                menu = false;
            }
        }
    }
}
