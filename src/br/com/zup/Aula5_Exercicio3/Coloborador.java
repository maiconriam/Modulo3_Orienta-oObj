package br.com.zup.Aula5_Exercicio3;


import java.util.ArrayList;
import java.util.List;

public class Coloborador extends Funcionario{
    List<Professor> professoresSupervisionados = new ArrayList<>();


    public Coloborador(String nome, String cpf, double numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public void adicionarProfessor(Professor professor){
        if(professoresSupervisionados.size() < 10){
            professoresSupervisionados.add(professor);
        }else{
            System.out.println("Você ja tem 10 professores supervisionados.");
        }
    }

    public List<Professor> getProfessoresSupervisionados(){
        return professoresSupervisionados;
    }

    @Override
    public String toString() {
        StringBuilder retornoDoDados = new StringBuilder();
        retornoDoDados.append("\nNome: " + getNome());
        retornoDoDados.append("\n CPF: " + getCpf());
        retornoDoDados.append("\n Número do Registro: " + getNumeroRegistro());
        retornoDoDados.append("\n Orgão de Lotoção:" + getOrgaoLotacao());
        retornoDoDados.append("\n Salario: " + getSalario());
        retornoDoDados.append("\n Professores supervisionados: " + getProfessoresSupervisionados());
        return retornoDoDados.toString();
    }

    @Override
    public double aumentoSalario(){
        double aumentaSalario = (getSalario() * 0.05) + getSalario();
        return aumentaSalario;
    }
}
