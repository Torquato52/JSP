public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;
    
    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (this.saldo - valor >= 0) {
            this.saldo -= valor;
            System.out.println("Saque no valor de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    
    public void depositar(float valor) {
        this.saldo += valor;
        System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso.");
    }
}