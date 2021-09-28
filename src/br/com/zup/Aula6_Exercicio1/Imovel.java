package br.com.zup.Aula6_Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String nomeDoImovel;
    private String endereco;
    private double valorDoAluguel;
    private String nomeDoResponsavel;
    private List <Morador> morador = new ArrayList<>();

    public Imovel() {

    }

    public Imovel(String nomeDoImovel,String endereco, double valorDoAluguel, String nomeDoResponsavel) {
        this.nomeDoImovel = nomeDoImovel;
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getNomeDoImovel() {
        return nomeDoImovel;
    }

    public void setNomeDoImovel(String nomeDoImovel) {
        this.nomeDoImovel = nomeDoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public List<Morador> getMorador() {
        return morador;
    }

    public void setMorador(List<Morador> morador) {
        this.morador = morador;
    }

    public void adicionarMorador(Morador novoMorador){
        morador.add(novoMorador);
    }

    @Override
    public String toString(){
        StringBuilder retornoDoDados = new StringBuilder();
        retornoDoDados.append("\n Nome do imovel: " + nomeDoImovel);
        retornoDoDados.append("\n Endereço: " +endereco);
        retornoDoDados.append("\n Valor do aluguel: " + valorDoAluguel);
        retornoDoDados.append("\n Nome do responsavel pelo Imovel: " + nomeDoResponsavel);
        retornoDoDados.append("\n Moradores: " + morador);
        return retornoDoDados.toString();
    }
}
