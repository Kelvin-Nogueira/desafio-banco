package moduloJava.projetobanco;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Cliente kelvin = new Cliente();
        davi.setNome("kelvin nogueira");
        Conta contaCorrente = new ContaCorrente(kelvin);
        Conta contaPoupanca = new ContaPoupanca(kelvin);
        contaCorrente.depositar(300);
        contaPoupanca.depositar(300);

        contaCorrente.transferir(300, contaPoupanca);
        contaPoupanca.imprimirExtrato();
        contaCorrente.imprimirExtrato();
        System.out.println("-----------------");
        Banco banco = new Banco("Santander", List.of(contaCorrente, contaPoupanca));
        banco.listarClientes();
    }
}
