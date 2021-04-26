public class ContaSalario extends Conta {

    int limiteSaques;

    public ContaSalario(int numero, int agencia, String banco, double saldo) {
        super(numero, agencia, banco, saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getSaque(int valor) {
        if (valor > getSaldo()) {
            System.out.println("Operação saque falhou.");
            System.out.println("Seu saldo é insuficiente para efetuar essa transação.");
            return false;
        } else if (!(limiteSaques <2)) {
            System.out.println("Operação saque falhou.");
            System.out.println("O limite de saques foi excedido.");
            return false;
        } else {
            saldo -= valor;
            limiteSaques+=1;
            System.out.println("Saque feito com sucesso");
            System.out.println("Você sacou R$" + valor);
            System.out.println("O saldo atualizado da conta é R$" + saldo);
            return true;
        }
    }


    public boolean getDeposito(int valor) {
        saldo += valor;
        System.out.println("Depósito feito com sucesso");
        System.out.println("Você depositou R$" + valor);
        System.out.println("O saldo atualizado da conta é R$" + saldo);
        return true;
    }

    @Override
    public String toString() {
        return "Conta Salario{" +
                "Número=" + getNumero() +
                ", Agencia=" + getAgencia() +
                ", Banco=" + getBanco() +
                ", Saldo=" + saldo +
                '}';
    }
}
