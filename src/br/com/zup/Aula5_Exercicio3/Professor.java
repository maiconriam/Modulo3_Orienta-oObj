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
    public String toString(){
        StringBuilder retornoDoMetodo = new StringBuilder();
        retornoDoMetodo.append("\n Nome: " + getNome());
        retornoDoMetodo.append("\n CPF: " + getCpf());
        retornoDoMetodo.append("\n Número do Registro: " + getNumeroRegistro());
        retornoDoMetodo.append("\n Orgão de Lotoção:" + getOrgaoLotacao());
        retornoDoMetodo.append("\n Salario: " + getSalario());
        retornoDoMetodo.append("\n Nivel de graduação: " +nivelGraduacao);
        retornoDoMetodo.append("\n Disciplina: " +disciplina);
        retornoDoMetodo.append("\n Quantidade de Alunos: " +qtdAlunos);
        retornoDoMetodo.append("\n Quantidade de Turmas: " +qtdTurmas);
        return retornoDoMetodo.toString();
    }
}
