package br.com.zup.Aula5_Exercicio3;

public class Administrativo extends Funcionario{
    private String funcao;
    private String senioridade;

    public Administrativo(String nome, String cpf, double numeroRegistro, String orgaoLotacao, double salario, String funcao, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcao = funcao;
        this.senioridade = senioridade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public String toString() {
        StringBuilder retornoDoDados = new StringBuilder();
        retornoDoDados.append("\nNome: " + getNome());
        retornoDoDados.append("\n CPF: " + getCpf());
        retornoDoDados.append("\n Número do Registro: " + getNumeroRegistro());
        retornoDoDados.append("\n Orgão de Lotoção:" + getOrgaoLotacao());
        retornoDoDados.append("\n Salario: " + getSalario());
        retornoDoDados.append("\n Função: " + funcao);
        retornoDoDados.append("\n Senioridade: " + senioridade);
        return retornoDoDados.toString();
    }
}
