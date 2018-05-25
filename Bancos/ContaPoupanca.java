package Bancos;

public class ContaPoupanca extends Conta{
    private int numeroDeSaques=0;
    public ContaPoupanca(Banco banco, int agencia, String titular) {
        super(banco, agencia, titular);
    }

    public void sacar(double valor){
        if (this.numeroDeSaques<3) {
            //this.saldo -=valor;
            super.sacar(valor);
            this.numeroDeSaques+=1;
        }else{
            System.out.println("Numero de saques excedidos, contate seu gerente");
        }
    };
}
