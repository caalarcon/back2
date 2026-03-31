//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

            Conta cc = new ContaCorrente("0001", "120", "Joao", 3000);
            Conta cp = new ContaPoupanca("0003", "127", "Camily", 8000);
            Conta pj = new ContaJuridica("003", "123", "Empresa", 5000);

            System.out.println("\n--- Conta Corrente ---");
            cc.depositar(100);
            cc.sacar(50);
            cc.exibirSaldo();
            System.out.println("Tarifa: R$ " + cc.calcularTarifaMensal());

            System.out.println("\n--- Conta Poupança ---");
            cp.depositar(200);
            cp.sacar(100);
            cp.exibirSaldo();
            System.out.println("Tarifa: R$ " + cp.calcularTarifaMensal());

            System.out.println("\n--- Conta PJ ---");
            pj.depositar(500);
            pj.sacar(200);
            pj.exibirSaldo();
            System.out.println("Tarifa: R$ " + pj.calcularTarifaMensal());
        }
    }
