package br.com.zup.Aula5_Exercicio3;

public class Main {
    public static void main(String[] args) {
        Turma turma1 = new Turma("4", 20);
        Professor a = new Professor("Maicon", "54848", 2, "SC", 1000, "a", "b");
        Coloborador b = new Coloborador("IASKD", "8484", 2, "SC", 1000);

        a.adicionarTurma(turma1);
        System.out.println(a);
        b.adicionarProfessor(a);
        System.out.println(b);
    }
}
