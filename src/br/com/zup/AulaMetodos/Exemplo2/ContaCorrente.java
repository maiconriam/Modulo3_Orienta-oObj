package br.com.zup.AulaMetodos.Exemplo2;

public class ContaCorrente {
    String nome;
    String cpf;
    String agencia;
    double emprestimo = 900;
    String numeroDaConta;
    double saldo = 0;

    public ContaCorrente(String nome, String cpf, String agencia, String numeroDaConta){
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroDaConta =numeroDaConta;
    }

    public void mostrarDados(){
        System.out.println("Nome do Titular: " +nome);
        System.out.println("CPF do Titular: " +cpf);
        System.out.println("Agência: " +agencia);
        System.out.println("Número da conta: " +numeroDaConta);
        System.out.println("Valor liberado para emprestimo: " +emprestimo);
        System.out.println("Saldo: R$ " +saldo);
    }

    public void depositar(double valorDoDeposito){
        saldo = saldo + valorDoDeposito;
    }

    public void sacar(double valorDoSaque){
        saldo = saldo - valorDoSaque;
    }

    public void liberaEmprestimo(double valor){
        emprestimo = emprestimo - valor;
    }

    public void solicitaEmpestimo(double valor){
        if (valor > emprestimo){
            System.out.println("Este limite não está aprovado");
        }else{
            System.out.println("Este limite está aprovado");
            depositar(valor);
            liberaEmprestimo(valor);
        }
    }
}
