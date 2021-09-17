package br.com.zup;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contato obj_contato = new Contato();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Diga seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Diga seu email: ");
        String email = leitor.nextLine();
        System.out.println("Diga seu telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("Diga sua idade: ");
        int idade = leitor.nextInt();

        obj_contato.nome = nome;
        obj_contato.email = email;
        obj_contato.telefone = telefone;
        obj_contato.idade = idade;

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu e-mail é: " + email);
        System.out.println("Seu telefone é: " + telefone);
        System.out.println("Sua idade é: " + idade);
    }
}
