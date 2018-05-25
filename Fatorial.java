public class Fatorial {
    int a;

    Fatorial(int n){
        a = n;
    }

    public void calculaFatorial(){
        int i = a-1;
        while (i>0){
            a = a*i;
            i--;
        }
    }

    public void imprimeFatorial (){
        System.out.println("Fatorial "+this.a);
    }
}
