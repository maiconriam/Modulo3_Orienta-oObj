package br.com.zup.AulaHeranca.Exemplo1;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("André", 80000000, "78955465", "0123456789", "Computacao", "Java");
        Inspetor inspetor = new Inspetor("Yan", 90000000, "9875664", "3246", "Norte");
        TecnicosAdministrativos tec_adm = new TecnicosAdministrativos("André 2", 9000000, "545454", "245445344", "Financeiro");
    }
}
