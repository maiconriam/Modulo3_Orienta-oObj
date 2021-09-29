package br.com.zup.Aula7_Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nomeDoPrato;
    private double valorDoPrato;
    private List<Ingredientes> ingredientes = new ArrayList<>();

    public Prato(String nomeDoPrato, double valorDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
        this.valorDoPrato = valorDoPrato;
    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void adicionarIngredientes(Ingredientes novoIngredientes){
        ingredientes.add(novoIngredientes);
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append("\n Nome do prato: " + nomeDoPrato);
        retornaDados.append("\n Valor do prato: R$ " +valorDoPrato);
        retornaDados.append("\n Ingredientes: " +ingredientes);
        return retornaDados.toString();
    }
}
