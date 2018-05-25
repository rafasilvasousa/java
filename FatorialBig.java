import java.math.BigInteger;

public class FatorialBig {
    BigInteger a;

    FatorialBig(long n){
        a = BigInteger.valueOf(n);
    }

    public void calculaFatorialBig(){
        BigInteger i = a.subtract(BigInteger.ONE);
        while(! i.equals(BigInteger.ZERO)){
            a = a.multiply(i);
            i = i.subtract(BigInteger.ONE);

        }
    }

    public void imprimeFatorialBig (){
        System.out.println("Fatorial "+this.a);
    }
}
