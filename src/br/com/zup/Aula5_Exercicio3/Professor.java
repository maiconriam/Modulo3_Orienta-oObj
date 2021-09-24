package br.com.zup.Aula5_Exercicio3;

public class Professor extends Funcionario{
    private String nivelGraduacao;
    private String disciplina;
    private int qtdAlunos;
    private int qtdTurmas;
    private Turma turma;

    public Professor(String nome, String cpf, double numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplina, int qtdAlunos, int qtdTurmas, Turma turma) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
        this.turma = turma;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nivel de graduação: " + nivelGraduacao);
        System.out.println("Displina: " + disciplina);
        System.out.println("Quantidade de alunos: " + qtdAlunos);
        System.out.println("Turmas: " + qtdTurmas);
    }
}
