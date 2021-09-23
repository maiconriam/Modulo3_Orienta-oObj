package br.com.zup.Aula5_Exercicio2;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Mario", "Servidao José", "4848554554",800, 500);
        Colaborador colaborador = new Colaborador("Julia", "Monte verde", "4845448484", 2, 1200, 245);
        Administrador administrador = new Administrador("Sergio Murilo", "São José", "484484515185", 1, 3000,500,500);

        //Fornecador
        fornecedor.setNome("Maicon Riam");
        fornecedor.obterSaldo();
        fornecedor.mostrarDados();

        //Colaborador
        System.out.println("-------------------");
        colaborador.calcularSalario();
        colaborador.mostrarDados();

        //Administrador
        System.out.println("-------------------");
        administrador.calcularSalario();
        administrador.mostrarDados();

    }
}
