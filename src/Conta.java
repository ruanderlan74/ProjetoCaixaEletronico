public class Conta {
    String agencia;
    String numeroConta;
    double saldo;

    Cliente cliente;

    public Conta(String agencia, String numeroConta,Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
