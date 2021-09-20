package br.com.zup.AulaMetodos.Exemplo2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Maicon Riam", "080934479-38","48484-5", "551581515");
        cc1.mostrarDados();
        cc1.depositar(100);
        cc1.sacar(50);
        cc1.mostrarDados();
        cc1.solicitaEmpestimo(80);
        cc1.mostrarDados();
    }
}
