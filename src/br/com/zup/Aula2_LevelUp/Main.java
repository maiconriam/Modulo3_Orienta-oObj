package br.com.zup.Aula2_LevelUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Pais pais1 = new Pais();
        Pais pais2 = new Pais();
        Pais pais3 = new Pais();
        Pais pais4 = new Pais();
        List<String> continente = new ArrayList<>();

        boolean menu = true;
        int escolhaMenu;

        continente.add("Ásia");
        continente.add("Europa");
        continente.add("América do Sul");
        continente.add("América do Norte");

        //Bem vindo
        System.out.println("Olá, seja bem vindo!");
        System.out.println("Irei mostrar os países dos continentes a baixo");
        System.out.println();

        while (menu == true){
            //Menu dos paises
            System.out.println("Digite 1: Para o continente da " +continente.get(0));
            System.out.println("Digite 2: Para o continente da " +continente.get(1));
            System.out.println("Digite 3: Para o continente da " +continente.get(2));
            System.out.println("Digite 4: Para o continente da " +continente.get(3));
            System.out.println("Digite 5: Para sair do programa");
            escolhaMenu = leitor.nextInt();

            switch (escolhaMenu){
                case 1:
                    pais1.nome = "Japão";
                    pais1.territorio = 377.975;
                    pais1.populacao = 126.3;

                    pais2.nome = "Tailândia";
                    pais2.territorio = 513.120;
                    pais2.populacao = 69.63;

                    pais3.nome = "China";
                    pais3.territorio = 9.597;
                    pais3.populacao = 1.398;

                    pais4.nome = "Coreia do Sul";
                    pais4.territorio = 100.210;
                    pais4.populacao = 51.71;

                    System.out.println("Nome do país: " +pais1.nome);
                    System.out.println("Tamanho do territorio: " +pais1.territorio + " km²");
                    System.out.println("Populção: " +pais1.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais2.nome);
                    System.out.println("Tamanho do territorio: " +pais2.territorio + " km²");
                    System.out.println("Populção: " +pais2.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais3.nome);
                    System.out.println("Tamanho do territorio: " +pais3.territorio + " km²");
                    System.out.println("Populção: " +pais3.populacao + " bilhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais4.nome);
                    System.out.println("Tamanho do territorio: " +pais4.territorio + " km²");
                    System.out.println("Populção: " +pais4.populacao + " milhões");
                    System.out.println();
                    break;
                case 2:
                    pais1.nome = "Alemanha";
                    pais1.territorio = 357.386;
                    pais1.populacao = 83.02;

                    pais2.nome = "França";
                    pais2.territorio = 632.734;
                    pais2.populacao = 67.06;

                    pais3.nome = "Itália";
                    pais3.territorio = 301.340;
                    pais3.populacao = 60.36;

                    pais4.nome = "Reino Unido";
                    pais4.territorio = 242.495;
                    pais4.populacao = 66.65;

                    System.out.println("Nome do país: " +pais1.nome);
                    System.out.println("Tamanho do territorio: " +pais1.territorio + " km²");
                    System.out.println("Populção: " +pais1.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais2.nome);
                    System.out.println("Tamanho do territorio: " +pais2.territorio + " km²");
                    System.out.println("Populção: " +pais2.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais3.nome);
                    System.out.println("Tamanho do territorio: " +pais3.territorio + " km²");
                    System.out.println("Populção: " +pais3.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais4.nome);
                    System.out.println("Tamanho do territorio: " +pais4.territorio + " km²");
                    System.out.println("Populção: " +pais4.populacao + " milhões");
                    System.out.println();
                    break;
                case 3:
                    pais1.nome = "Argentina";
                    pais1.territorio = 2.780;
                    pais1.populacao = 44.94;

                    pais2.nome = "Brasil";
                    pais2.territorio = 8.516;
                    pais2.populacao = 211;

                    pais3.nome = "Colômbia";
                    pais3.territorio = 1.143;
                    pais3.populacao = 50.34;

                    pais4.nome = "Peru";
                    pais4.territorio = 1.285;
                    pais4.populacao = 32.51;

                    System.out.println("Nome do país: " +pais1.nome);
                    System.out.println("Tamanho do territorio: " +pais1.territorio + " km²");
                    System.out.println("Populção: " +pais1.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais2.nome);
                    System.out.println("Tamanho do territorio: " +pais2.territorio + " km²");
                    System.out.println("Populção: " +pais2.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais3.nome);
                    System.out.println("Tamanho do territorio: " +pais3.territorio + " km²");
                    System.out.println("Populção: " +pais3.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais4.nome);
                    System.out.println("Tamanho do territorio: " +pais4.territorio + " km²");
                    System.out.println("Populção: " +pais4.populacao + " milhões");
                    System.out.println();
                    break;
                case 4:
                    pais1.nome = "Estados Unidos";
                    pais1.territorio = 9.834;
                    pais1.populacao = 328.2;

                    pais2.nome = "Canadá";
                    pais2.territorio = 9.985;
                    pais2.populacao = 37.59;

                    pais3.nome = "Jamaica";
                    pais3.territorio = 10.991;
                    pais3.populacao = 2.948;

                    pais4.nome = "México";
                    pais4.territorio = 1.973;
                    pais4.populacao = 127.6;

                    System.out.println("Nome do país: " +pais1.nome);
                    System.out.println("Tamanho do territorio: " +pais1.territorio + " km²");
                    System.out.println("Populção: " +pais1.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais2.nome);
                    System.out.println("Tamanho do territorio: " +pais2.territorio + " km²");
                    System.out.println("Populção: " +pais2.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais3.nome);
                    System.out.println("Tamanho do territorio: " +pais3.territorio + " km²");
                    System.out.println("Populção: " +pais3.populacao + " milhões");
                    System.out.println();
                    System.out.println("Nome do país: " +pais4.nome);
                    System.out.println("Tamanho do territorio: " +pais4.territorio + " km²");
                    System.out.println("Populção: " +pais4.populacao + " milhões");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Finalizando programa.");
                    menu = false;
                    break;
                default:
                    System.out.println("Número invalido");
                    break;
            }
        }
    }
}
