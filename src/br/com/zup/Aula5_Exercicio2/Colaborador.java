package br.com.zup.Aula5_Exercicio2;

public class Colaborador extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Colaborador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        double salarioLiquido = salarioBase - imposto;
        return salarioLiquido;
    }

    public void mostrarDados(){
        System.out.println("Nome: " +getNome());
        System.out.println("Enderenco: " +getEndereco());
        System.out.println("Telefone: " +getTelefone());
        System.out.println("Setor: " + codigoSetor);
        System.out.println("Seu salario: " +calcularSalario());
    }
}
