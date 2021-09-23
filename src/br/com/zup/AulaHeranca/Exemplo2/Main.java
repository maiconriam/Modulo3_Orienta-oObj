package br.com.zup.AulaHeranca.Exemplo2;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreiro = new Guerreiros("Thor", "Raio", "Armadura", 100, "Martelo");
        Voadores inimigoVoador = new Voadores("Anivia", "Azul", "Gelo", 800, 50);


        int danoAplicado = inimigoVoador.aplicarDano();
        guerreiro.perderVida(danoAplicado);

        System.out.println(inimigoVoador.getVida());

        int danoDoGuerreiro = guerreiro.aplicaDano();
        inimigoVoador.perderVida(danoDoGuerreiro);
        System.out.println(inimigoVoador.getVida());
        inimigoVoador.perderVida(danoDoGuerreiro);
        System.out.println(inimigoVoador.getVida());
    }
}
