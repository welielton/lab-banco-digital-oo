//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente welielton = new Cliente();
        welielton.setNome("Welielton");

        Conta cc = new ContaCorrente(welielton);
        Conta poupanca = new ContaPoupanca(welielton);

        cc.depositar(100);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.exibirHistorico();


    }
}