package br.com.zup.AulaHeranca.Exemplo1;

public class Professor extends Funcionario{
    private String cienciaDeEstudo;
    private String disciplina;

    public Professor(String nome, double salario, String ctps, String cpf, String cienciaDeEstudo, String disciplina) {
        super(nome, salario, ctps, cpf);
        this.cienciaDeEstudo = cienciaDeEstudo;
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
