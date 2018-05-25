public class Calculadora {

    int fatorial(int a){
        int i = a-1;
        while (i > 0) {
            a = a*i;
            i--;
        }
        return a;

    }

    int potencia (int a, int b){
        int total=1;
        for (int i=1; i<=b; i++){
            total = total * a;
        }
        return total;
    }

    int quadrado(int a){
        return a*a;
    }

    boolean divisivel(int a, int b){
        return (a%b==0);

    }

    void sequencia(int a){
        for (int i = 1; i<=a; i++){
            System.out.print(i+" ");
        }
        System.out.println("");

    }

    int[] divisores(int a){
        int cont = 0;
        for(int i = 1; i<=a; i++){
            if(a%i==0){
                cont++;
            }
        }
        int[] divs = new int[cont];
        int j = 0;
        for(int i = 1; i<=a; i++){
            if(a%i==0){
                divs[j]=i;
                j++;
            }
        }
        return divs;

    }

    int tantoFaz(int a, int b){
        if(a%2==0 && (b%2==0)){
            return a+b;
        }else if(a%2==0){
            return a-b;
        }else if(b%2==0){
            return a*b;
        }else{
            return a/b;
        }
    }
}
