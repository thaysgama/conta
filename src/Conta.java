public abstract class Conta {
    private int numero;
    private int agencia;
    private String banco;
    protected double saldo;
    protected int saque;
    protected int deposito;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract boolean getSaque(int valor);

    public void setSaque(int saque) {
        this.saque = saque;
    }

    public abstract boolean getDeposito(int valor);

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

//    public void saque (int valor) {
//        if (valor > getSaldo()) {
//            System.out.println("Operação saque falhou.");
//            System.out.println("Seu saldo é insuficiente para efetuar essa transação.");
//        } else {
//            saldo -= valor;
//            System.out.println("Saque feito com sucesso");
//            System.out.println("Você sacou R$" + valor);
//            System.out.println("O saldo atualizado da conta é R$" + saldo);
//        }
//    }

//    public void deposito (int valor) {
//        saldo += valor;
//        System.out.println("Depósito feito com sucesso");
//        System.out.println("Você depositou R$" + valor);
//        System.out.println("O saldo atualizado da conta é R$" + saldo);
//    }
}

