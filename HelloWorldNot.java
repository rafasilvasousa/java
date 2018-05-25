import Bancos.Banco;
import Bancos.ContaCorrente;
import Bancos.ContaPoupanca;

class HelloWorldNot {
    public static void main(String[] args){
        //lista 1
        System.out.println("Qualquer coisa menos Hello World");

        Fatorial f1 = new Fatorial(4);
        f1.calculaFatorial();
        f1.imprimeFatorial();

        FatorialBig f2 = new FatorialBig(200);
        f2.calculaFatorialBig();
        f2.imprimeFatorialBig();

        TesteInteiro teste = new TesteInteiro();
        teste.teste();

        //lista2
        Banco b1 = new Banco();
        Banco b2 = new Banco();

        ContaCorrente cc1 = new ContaCorrente(b1, 1611, "Rafael Sousa");

        ContaCorrente cc2 = new ContaCorrente(b2, 1632, "Rafael Sousa");


        cc1.depositar(500.00);
        cc2.depositar(100.00);


        cc1.transferir(cc2, 1000.00);

        System.out.println("Saldo da conta cc1 é: "+cc1.getSaldo());
        System.out.println("Saldo da conta cc2 é: "+cc2.getSaldo());

        ContaPoupanca ccp1 = new ContaPoupanca(b1, 1611, "Rafael Sousa");
        ContaPoupanca ccp2 = new ContaPoupanca(b2, 1632, "Rafael Sousa");

        cc1.transferir(ccp2, 400);
        cc2.transferir(ccp2, 90);

        ccp1.depositar(1000);
        ccp2.depositar(50000);

        ccp2.sacar(500);
        ccp2.sacar(1500);
        ccp2.sacar(50);
        ccp2.sacar(250);
        ccp2.sacar(2250);
        ccp2.sacar(25);
        ccp2.sacar(20);


        System.out.println("Saldo da conta cc1 é: "+cc1.getSaldo());
        System.out.println("Saldo da conta cc2 é: "+cc2.getSaldo());
        System.out.println("Saldo da conta ccp1 é: "+ccp1.getSaldo());
        System.out.println("Saldo da conta ccp2 é: "+ccp2.getSaldo());

    }
}
