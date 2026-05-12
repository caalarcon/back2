
public class Produto {
    private String produto;
    private double preco;
    private String quantidade;

    public Produto(String produto, double preco, String quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(){}

    public String getNome() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "produto='" + produto + '\'' +
                ", preco='" + preco + '\'' +
                ", quantidade='" + quantidade + '\'' +
                '}';
    }
}