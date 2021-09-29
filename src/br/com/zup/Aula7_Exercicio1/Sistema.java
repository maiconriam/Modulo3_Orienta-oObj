package br.com.zup.Aula7_Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Bem vindo ao Restaurante Siri Cascudo");
        System.out.println("Digite 1: Para adicionar um prato");
        System.out.println("Digite 2: Para olhar o cardapio");
        System.out.println("Digite 3: Para sair");
    }

    public static Prato pratoDodia() {
        String nomeDoPrato = capturarDados("Digite o nome do prato").nextLine();
        double valorDoPrato = capturarDados("Digite o valor do prato").nextDouble();

        Prato prato = new Prato(nomeDoPrato, valorDoPrato);
        List listaDeIngredientes = listaDeIngredientes();
        prato.setIngredientes(listaDeIngredientes);

        return prato;
    }

    public static Ingredientes ingredientesDoDia() {
        String nomeDoIngrediente = capturarDados("Digite o nome do ingrediente").nextLine();
        Ingredientes ingredienteAdicionado = new Ingredientes();
        ingredienteAdicionado.setNomeDoIngrediente(nomeDoIngrediente);
        return ingredienteAdicionado;
    }

    public static List listaDeIngredientes() {
        List<Ingredientes> listaIngredientes = new ArrayList<>();
        int escolha = capturarDados("Por favor digite quantos ingredientes tem no prato").nextInt();
        for (int contador = 0; contador < escolha; contador++) {
            listaIngredientes.add(ingredientesDoDia());
        }
        return listaIngredientes;
    }

    public static void mostrarMenu(){
        Restaurante restaurante = new Restaurante();

        boolean menu = true;
        int escolhaMenu;

        while (menu){
            menu();
            escolhaMenu = capturarDados("Digite sua escolha").nextInt();

            if(escolhaMenu == 1){
                restaurante.adicionarPrato(pratoDodia());
            }
            if(escolhaMenu == 2){
                System.out.println(restaurante);
            }
            if(escolhaMenu == 3){
                System.out.println("Programa finalizado.");
                menu = false;
            }
        }
    }
}
