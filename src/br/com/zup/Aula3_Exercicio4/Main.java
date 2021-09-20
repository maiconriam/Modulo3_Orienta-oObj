package br.com.zup.Aula3_Exercicio4;

public class Main {
    public static void main(String[] args) {
        CartaoCredito exemplo = new CartaoCredito(800, 500, "Maicon Riam");
        exemplo.imprimeFatura();

        //Aumentando limite
        exemplo.aumentarLimite(200);

        //Diminuindo limite
        exemplo.diminuirLimite(100);

        //Realizando compra
        exemplo.realizaComprar(400);
        System.out.println("-----");

        //Fatura do cartão
        exemplo.imprimeFatura();

    }
}
