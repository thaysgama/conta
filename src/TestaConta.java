public class TestaConta {
    public static void main(String[] args) {

        //Conta Corrente criada
        ContaCorrente cc1 = new ContaCorrente(22,1,"Banco AA",100.00, 1000.00);
        System.out.println(cc1);
        //saque entrando no cheque especial
        cc1.getSaque(1000);
        System.out.println(cc1);
        //inserindo depósito
        cc1.getDeposito(1500);
        System.out.println(cc1);
        System.out.println();

        //Conta poupança criada
        ContaPoupanca cp1 = new ContaPoupanca(33, 3 ,"Banco CC", 10.00, "2021-01-01", "2021-02-01", 1.05);
        System.out.println(cp1);
        //saque superior ao valor permitido
        cp1.getSaque(11);
        System.out.println(cp1);
        //depósito comum
        cp1.getDeposito(200);
        System.out.println(cp1);
        //saldo com quatro meses de juros acumulado
        cp1.setDataDia("2021-05-01");
        System.out.println(cp1);
        System.out.println();

        //Conta Salario criada
        ContaSalario cs1 = new ContaSalario(12,52,"Banco BB", 500);
        System.out.println(cs1);
        //primeiro saque
        cs1.getSaque(50);
        System.out.println(cs1);
        //saque com valor acima do permitido
        cs1.getSaque(500);
        System.out.println(cs1);
        //segundo saque
        cs1.getSaque(300);
        System.out.println(cs1);
        //numero de saques excedido
        cs1.getSaque(10);
        System.out.println(cs1);
        //deposito comum
        cs1.getDeposito(20);
        System.out.println(cs1);





    }
}
