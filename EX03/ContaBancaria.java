package EX.EX03;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private Float saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, Float saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
    }

}
