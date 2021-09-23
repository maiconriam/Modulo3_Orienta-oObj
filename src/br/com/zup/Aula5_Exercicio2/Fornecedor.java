package br.com.zup.Aula5_Exercicio2;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefeone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefeone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        double saldo = valorCredito - valorDivida;
        return saldo;
    }

    public void mostrarDados(){
        System.out.println("Nome: " +getNome());
        System.out.println("Endereço: " +getEndereco());
        System.out.println("Telefone: " +getTelefone());
        System.out.println("Crédito: " +valorCredito);
        System.out.println("Divida: " +valorDivida);
        System.out.println("Saldo: " +obterSaldo());
    }
}
