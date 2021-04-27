public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public final double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }

    public boolean getSaque(double valor){
        if (valor > getSaldo()) {
            System.out.println("Operação saque falhou.");
            System.out.println("Seu saldo é insuficiente para efetuar essa transação.");
            return false;
        } else {
            saldo -= valor;
            System.out.println("Saque feito com sucesso");
            System.out.println("Você sacou R$" + valor);
            System.out.println("O saldo atualizado da conta é R$" + saldo);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente{" +
                "Número=" + getNumero() +
                ", Agencia=" + getAgencia() +
                ", Banco=" + getBanco() +
                ", Saldo=" + saldo +
                ", Cheque Especial=" + chequeEspecial +
                ", Saldo Total Disponível=" + getSaldo() +
                '}';
    }
}
