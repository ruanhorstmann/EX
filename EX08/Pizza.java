package EX.EX08;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String nome;
    private float valor;
    private List<String> ingredientes;

    public Pizza(String nome, float valor, List<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}

class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;
    private boolean cancelado;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.cancelado = false;
    }

    public void adicionarPizza(Pizza pizza) {
        if (!cancelado) {
            pizzas.add(pizza);
        } else {
            System.out.println("Este pedido foi cancelado e não pode ser modificado.");
        }
    }

    public void cancelarPedido() {
        cancelado = true;
        System.out.println("Pedido cancelado com sucesso.");
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    public void imprimirDetalhes() {
        System.out.println("Detalhes do pedido:");
        System.out.println("Endereço de entrega: " + enderecoEntrega);
        System.out.println("Pizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getNome());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
