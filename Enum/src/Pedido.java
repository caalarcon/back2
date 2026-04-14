public class Pedido {
        private int id;
        private String cliente;
        private StatusPedido status;

        // Construtor
        public Pedido(int id, String cliente) {
            this.id = id;
            this.cliente = cliente;
            this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
        }

        // Getters e Setters
        public int getId() {
            return id;
        }

        public String getCliente() {
            return cliente;
        }

        public StatusPedido getStatus() {
            return status;
        }

        public void setStatus(StatusPedido status) {
            this.status = status;
        }

        // Método para avançar status
        public void avancarStatus() {
            switch (status) {
                case AGUARDANDO_PAGAMENTO:
                    status = StatusPedido.PROCESSANDO;
                    break;
                case PROCESSANDO:
                    status = StatusPedido.ENVIADO;
                    break;
                case ENVIADO:
                    status = StatusPedido.ENTREGUE;
                    break;
                case ENTREGUE:
                case CANCELADO:
                    System.out.println("Não é possível avançar o status.");
                    return;
            }
            System.out.println("Status atualizado: " + status);
        }

        // Método para cancelar pedido
        public void cancelarPedido() {
            if (status == StatusPedido.ENTREGUE) {
                System.out.println("Não é possível cancelar um pedido já entregue.");
            } else {
                status = StatusPedido.CANCELADO;
                System.out.println("Pedido cancelado.");
            }
        }
    }

