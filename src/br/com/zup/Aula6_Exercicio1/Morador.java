package br.com.zup.Aula6_Exercicio1;

public class Morador {
    private String nome;

    public Morador() {

    }

    public Morador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder retornoDoDados = new StringBuilder();
        retornoDoDados.append("\n Nome: " + nome);
        return retornoDoDados.toString();
    }
}
