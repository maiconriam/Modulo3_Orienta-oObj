package br.com.zup.AulaHeranca.Exemplo1;

public class TecnicosAdministrativos extends Funcionario{
    private String departamento;

    public TecnicosAdministrativos(String nome, double salario, String ctps, String cpf, String departamento) {
        super(nome, salario, ctps, cpf);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
