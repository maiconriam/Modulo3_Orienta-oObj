package br.com.zup.Aula3_Exercicio2;

public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoCorrentista;

    public ContaBancaria(String numeroDaConta, double saldo, String nomeDoCorrentista){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNomeDoCorrentista(){
        return nomeDoCorrentista;
    }

    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setNomeDoCorrentista(String nomeDoCorrentista){
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public void mostrarDados(){
        System.out.println("Número da conta: " +numeroDaConta);
        System.out.println("Saldo: R$ " +saldo);
        System.out.println("Nome: " + nomeDoCorrentista);
    }

    public void liberaSaque(double valorSaque){
        saldo = saldo - valorSaque;
    }

    public void saque(double valorDoSaque){
        if (valorDoSaque > saldo){
            System.out.println("Você não tem saldo para esse saque.");
        }else{
            System.out.println("Saque com sucesso.");
            liberaSaque(valorDoSaque);
        }
    }

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

}
