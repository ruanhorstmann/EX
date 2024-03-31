package EX.EX07;

public class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private float preco;

    public Produto(String nome, int codigo, int quantidade, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade solicitada maior do que o estoque disponível.");
        }
    }

    public float calcularValorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Código: " + codigo + ", Quantidade: " + quantidade + ", Preço: R$" + preco;
    }

    
    public int getCodigo() {
        return codigo;
    }
}