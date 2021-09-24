package br.com.zup.Aula5_Exercicio3;

public class Funcionario {
    private String nome;
    private String cpf;
    private double numeroRegistro;
    private String orgaoLotacao;
    private double salario;

    public Funcionario(String nome, String cpf, double numeroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(double numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentoSalario(){
        double aumentoSalario = (salario * 0.1) + salario;
        return aumentoSalario;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Número do registro: " + numeroRegistro);
        System.out.println("Orgão de Lotoção: " + orgaoLotacao);
        System.out.println("Salário: " + salario);
    }
}
