package br.com.zup.Aula5_Exercicio3;



public class Coloborador extends Funcionario{
    private Professor[] professoresSupervisionados = new Professor[10];
    private int contador = 0;
    private int qtdProfessores;

    public Coloborador(String nome, String cpf, double numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public Professor[] getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(Professor[] professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public int getQtdProfessores() {
        return qtdProfessores;
    }

    public void setQtdProfessores(int qtdProfessores) {
        this.qtdProfessores = qtdProfessores;
    }

    public void adicionarProfessor(Professor professor){
        professoresSupervisionados[contador] = professor;
        contador ++;
        qtdProfessores ++;
    }

    public void mostrarProfessores(){
        for (int indice = 0; indice < contador; indice ++){
            System.out.println("Nome: " + professoresSupervisionados[indice].getNome());
            System.out.println("CPF: " + professoresSupervisionados[indice].getCpf());
            System.out.println("Número do registro: " + professoresSupervisionados[indice].getNumeroRegistro());
            System.out.println("Orgão de Lotoção: " + professoresSupervisionados[indice].getOrgaoLotacao());
            System.out.println("Salário: " + professoresSupervisionados[indice].getSalario());
            System.out.println("Nivel de graduação: " + professoresSupervisionados[indice].getNivelGraduacao());
            System.out.println("Displina: " + professoresSupervisionados[indice].getDisciplina());
            System.out.println("Quantidade de alunos: " + professoresSupervisionados[indice].getQtdAlunos());
            System.out.println("Turmas: " + professoresSupervisionados[indice].getQtdTurmas());
        }
    }

    @Override
    public double aumentoSalario(){
        double aumentaSalario = (getSalario() * 0.05) + getSalario();
        return aumentaSalario;
    }
}
