package br.com.zup.Aula2_LevelUp2;

import br.com.zup.Aula2_LevelUp.Pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais1> continente = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        Pais1 pais1 = new Pais1("Brasil", 8516000, 211000000);
        Pais1 pais2 = new Pais1("Argentina", 2780000, 44940000);
        Pais1 pais3 = new Pais1("Peru", 1285000, 32510000);
        Pais1 pais4 = new Pais1("Colômbia", 1143000, 50340000);

        continente.add(pais1);
        continente.add(pais2);
        continente.add(pais3);
        continente.add(pais4);

        boolean menu = true;
        int opcao = 0;

        while (menu){
            System.out.println("Digite 1: Para ver os paises");
            System.out.println("Digite 2: Para sair do programa");
            opcao = leitor.nextInt();
            if (opcao == 1){
                for (Pais1 referencia : continente){
                    System.out.println("O nome do pais é: ");
                    System.out.println(referencia.nome);
                    System.out.println("A extensão territorial do pais é: ");
                    System.out.println(referencia.territorio);
                    System.out.println("A populção do pais é: ");
                    System.out.println(referencia.populacao);
                }
            }else if(opcao == 2){
                System.out.println("Programa finalizado.");
                menu = false;
            }else{
                System.out.println("Número invalido");
            }
        }
    }
}
