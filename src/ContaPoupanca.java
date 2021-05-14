import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends Conta {

    private double taxaDeJuros;
    private String dataAniversario;
    private String dataDia;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, String dataAniversario, String dataDia, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.dataAniversario = dataAniversario;
        this.dataDia = dataDia;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getSaldo() {
        LocalDate localDateAniversario = LocalDate.parse(dataAniversario, DateTimeFormatter.ISO_DATE);
        LocalDate localDateDia = LocalDate.parse(dataDia, DateTimeFormatter.ISO_DATE);
        long diff = ChronoUnit.MONTHS.between(localDateAniversario.withDayOfMonth(1), localDateDia.withDayOfMonth(1));
        if (localDateDia.isBefore(localDateAniversario.plusMonths(1))){
            return this.saldo;
        } else {
            double saldoJuros = this.saldo * Math.pow(taxaDeJuros, diff);
            return Math.round(saldoJuros*100.00)/100.00;
        }
    }

    public boolean getSaque(double valor){
        if (valor > getSaldo()) {
            System.out.println("Operação saque falhou.");
            System.out.println("Seu saldo é insuficiente para efetuar essa transação.");
            return false;
        } else {
            saldo = getSaldo() - valor;
            System.out.println("Saque feito com sucesso");
            System.out.println("Você sacou R$" + valor);
            System.out.println("O saldo atualizado da conta é R$" + saldo);
            return true;
        }
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getDataDia() {
        return dataDia;
    }

    public void setDataDia(String dataDia) {
        this.dataDia = dataDia;
    }

    @Override
    public String toString() {
        return "Conta Poupanca{" +
                "Numero=" + getNumero() +
                ", Agencia=" + getAgencia() +
                ", Banco=" + getBanco() +
                ", Data Aniversario=" + dataAniversario +
                ", Data do Dia=" + dataDia +
                ", Saldo=" + saldo +
                ", Taxa de Juros=" + taxaDeJuros +
                ", Saldo + rendimento=" + getSaldo() +
                '}';
    }
}
