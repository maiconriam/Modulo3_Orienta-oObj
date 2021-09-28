package br.com.zup.Aula6_Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> listaDeImovel = new ArrayList<>();

    public List<Imovel> getListaDeImovel() {
        return listaDeImovel;
    }

    public void setListaDeImovel(List<Imovel> listaDeImovel) {
        this.listaDeImovel = listaDeImovel;
    }

    public void adicionarImovel(Imovel novoimovel){
        listaDeImovel.add(novoimovel);
    }

    public String toString() {
        StringBuilder retornoDoDados = new StringBuilder();
        retornoDoDados.append("Imovel: " + getListaDeImovel());
        return retornoDoDados.toString();
    }
}
