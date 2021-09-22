package br.com.zup.Aula4_Exercicio3;

public class Pessoa {
    private String nome;
    private int dataDeNascimento;
    private String altura;
    private int anoAtual = 2021;

    public Pessoa(){

    }

    public Pessoa(String nome, int dataDeNascimento, String altura){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public int getDataDeNascimento(){
        return dataDeNascimento;
    }

    public String getAltura(){
        return altura;
    }

    public int getAnoAtual(){
        return anoAtual;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataDeNascimento(int dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setAltura(String altura){
        this.altura = altura;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public void calcularIdade(){
        setDataDeNascimento(getAnoAtual() - getDataDeNascimento());
    }

    public void mostrarDados(){
        System.out.println("Seu nome é: " + getNome());
        System.out.println("Sua idade é: " + getDataDeNascimento());
        System.out.println("Sua altura é: " + getAltura());
    }
}
