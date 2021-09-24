package br.com.zup.Aula5_Exercicio3;

public class Turma {
    private String serie;
    private double mediaDaTurma;
    private double qtdAlunos;

    public Turma(String serie, double mediaDaTurma, double qtdAlunos) {
        this.serie = serie;
        this.mediaDaTurma = mediaDaTurma;
        this.qtdAlunos = qtdAlunos;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getMediaDaTurma() {
        return mediaDaTurma;
    }

    public void setMediaDaTurma(double mediaDaTurma) {
        this.mediaDaTurma = mediaDaTurma;
    }

    public double getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(double qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
}
