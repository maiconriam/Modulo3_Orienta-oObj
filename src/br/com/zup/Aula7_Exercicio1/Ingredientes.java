package br.com.zup.Aula7_Exercicio1;

public class Ingredientes {
    private String nomeDoIngrediente;

    public Ingredientes(){

    }

    public Ingredientes(String nomeDoIngrediente) {
        this.nomeDoIngrediente = nomeDoIngrediente;
    }

    public String getNomeDoIngrediente() {
        return nomeDoIngrediente;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.nomeDoIngrediente = nomeDoIngrediente;
    }

    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append("\n Igredientes: " + nomeDoIngrediente);
        return retornoDados.toString();
    }
}
