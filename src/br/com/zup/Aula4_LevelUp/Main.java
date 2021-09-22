package br.com.zup.Aula4_LevelUp;


public class Main {
    public static void main(String[] args) {
        Televisao exemplo = new Televisao(0, 9);
        ControleRemoto cr = new ControleRemoto(exemplo);
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.diminuirVolume();
        cr.passarCanal();
        cr.passarCanal();
        cr.passarCanal();
        cr.passarCanal();
        cr.voltarCanal();
        exemplo.mostrarDados();
        cr.trocarCanal(32);
        exemplo.mostrarDados();
    }
}
