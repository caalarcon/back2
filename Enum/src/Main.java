//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Pedido pedido = new Pedido(1, "João");

            System.out.println("Pedido criado: " + pedido.getStatus());

            pedido.avancarStatus();
            pedido.avancarStatus();

            pedido.cancelarPedido();

            System.out.println("Status final: " + pedido.getStatus());
        }
    }
