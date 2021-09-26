package br.com.zup.Aula5_Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Coloborador extends Funcionario{
    private List<Professor> professoresSupervisionados = new ArrayList<>();

    public Coloborador(String nome, String cpf, double numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public void adcionarProfessor(Professor novoProfessor){
        if(professoresSupervisionados.size() <= 10){
            professoresSupervisionados.add(novoProfessor);
        }else{
            System.out.println("Você ja tem 10 professores supervisionados.");
        }
    }


    @Override
    public double aumentoSalario(){
        double aumentaSalario = (getSalario() * 0.05) + getSalario();
        return aumentaSalario;
    }
}
