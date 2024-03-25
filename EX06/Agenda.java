package EX.EX06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private List<Contato> listaDeContatos;

    public Agenda() {
        this.listaDeContatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato contato = new Contato(nome, telefone);
        listaDeContatos.add(contato);
        System.out.println("Contato adicionado: " + nome + ", " + telefone);
    }

    public void buscarContatoPorNome(String nome) {
        boolean encontrado = false;
        for (Contato contato : listaDeContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato.getNome() + ", " + contato.getTelefone());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado para o nome: " + nome);
        }
    }

    public void removerContatoPorNome(String nome) {
        Iterator<Contato> iterator = listaDeContatos.iterator();
        while (iterator.hasNext()) {
            Contato contato = iterator.next();
            if (contato.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                System.out.println("Contato removido: " + contato.getNome() + ", " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato não encontrado para o nome: " + nome);
    }

    public static void main(String[] args) {
        Agenda gerenciadorContatos = new Agenda();

        // Adicionar contato
        gerenciadorContatos.adicionarContato("Ruan", "123456789");
        gerenciadorContatos.adicionarContato("Alguem", "987654321");
        gerenciadorContatos.adicionarContato("Sla", "456123789");

        // Buscando um contato
        gerenciadorContatos.buscarContatoPorNome("Alguem");

        // Removendo um
        gerenciadorContatos.removerContatoPorNome("Alguem");

        // Tentando remover um contato que não existe
        gerenciadorContatos.removerContatoPorNome("Teste");
    }
}