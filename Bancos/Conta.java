package Bancos;

class Conta {
    static int contador = 1000;
    private Banco banco;
    private String titular;
    private int numero;
    private int agencia;
    private double saldo;
    private int numeroDeSaques;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

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

    public double getSaldo() {
        return saldo;
    }


    public int getNumeroDeSaques() {
        return numeroDeSaques;
    }


    public void depositar(double valor){
        this.saldo += valor;
    };

    public void sacar(double valor){
        if (this.numeroDeSaques<5) {
            if(this.saldo >= valor) {
                this.saldo -= valor;
                this.numeroDeSaques += 1;
            }else{
                System.out.println("Voce não possui saldo suficiente");
            }
        }else{
            System.out.println("Numero de saques excedidos, contate seu gerente");
        }
    };


    public void transferir(Conta conta, double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            conta.depositar(valor);
        }else{
            System.out.println("Voce não possui saldo suficiente");
        }

    };

    public Conta(Banco banco, int agencia, String titular){
        this.banco = banco;
        this.agencia = agencia;
        this.titular = titular;
        contador +=1;
        this.numero = contador;
    }



}
