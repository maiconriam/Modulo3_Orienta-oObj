package br.com.zup.Aula5_Exercicio3;

public class Turma {
    private String serie;
    private double qtdAlunos;

    public Turma(String serie, double qtdAlunos) {
        this.serie = serie;
        this.qtdAlunos = qtdAlunos;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(double qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append("\n Serie: " + serie);
        retornaDados.append("\n Quantidade de alunos: " +qtdAlunos);
        return retornaDados.toString();
    }
}
