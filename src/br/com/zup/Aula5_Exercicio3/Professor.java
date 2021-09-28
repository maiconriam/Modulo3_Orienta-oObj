package br.com.zup.Aula5_Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
    private String nivelGraduacao;
    private String disciplina;
    private List<Turma> turma = new ArrayList<>();

    public Professor(String nome, String cpf, double numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplina) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
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

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }

    public void adicionarTurma(Turma addTurma){
        turma.add(addTurma);
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
        retornoDoMetodo.append("\n Turma: " + turma);
        return retornoDoMetodo.toString();
    }
}
