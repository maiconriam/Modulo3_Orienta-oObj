package br.com.zup.Aula7_Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Prato> cardapio = new ArrayList<>();

    public List<Prato> getCardapio() {
        return cardapio;
    }

    public void adicionarPrato(Prato novoPrato){
        cardapio.add(novoPrato);
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append("\n Cardapio: " + cardapio);
        return retornaDados.toString();
    }
}
