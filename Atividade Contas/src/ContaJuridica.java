public class ContaJuridica extends Conta {

        public ContaJuridica(String numero, String agencia, String titular, double saldo) {
            super(numero, agencia, titular, saldo);
        }

        @Override
        public void sacar(double valor) {
            double taxa = 1.5;
            double total = valor + taxa;

            if (saldo >= total) {
                saldo -= total;
                System.out.println("Saque: R$ " + valor + " + taxa R$ 1,50");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }

        @Override
        public double calcularTarifaMensal() {
            return 20.0;
        }
    }

