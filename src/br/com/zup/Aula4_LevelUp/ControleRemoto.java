package br.com.zup.Aula4_LevelUp;

public class ControleRemoto {
    Televisao tv;

    public ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void aumentarVolume(){
        int aVolume = tv.getVolume() + 1;
        tv.setVolume(aVolume);
    }

    public void diminuirVolume(){
        if (tv.getVolume() <= 0){
            System.out.println("O volume mínimo é:  " + tv.getVolume());
        }else{
            int dVolume = tv.getVolume() - 1;
            tv.setVolume(dVolume);
        }
    }

    public void passarCanal(){
        int pCanal = tv.getCanal() +1;
        tv.setCanal(pCanal);
    }

    public void voltarCanal(){
        if(tv.getCanal() < 0){
            System.out.println("Esse canal não existe");
        }else{
            int vCanal = tv.getCanal() -1;
            tv.setCanal(vCanal);
        }

    }

    public void trocarCanal(int valor){
        if (valor < 0){
            System.out.println("Esse canal não existe");
        }else{
            tv.setCanal(valor);
        }
    }
}

