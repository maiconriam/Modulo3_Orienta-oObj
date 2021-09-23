package br.com.zup.Aula5_Exercicio1;

public class Main {
    public static void main(String[] args) {
        Guerreiro demacia = new Guerreiro("Garen", 650, 55);
        Mago yordles = new Mago("Veigar", 500, 90);
        Rasteiros monolito = new Rasteiros("Malphite", 1200, 35);
        Voadores freljord = new Voadores("Anivia", 600, 70);


        demacia.mostrarDados();
        double dano = monolito.getDanoEspinhos();

        demacia.receberDano(dano);
        demacia.receberDano(dano);
        demacia.exibirVida();
    }
}
