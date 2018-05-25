public class Principal {
    public static void main(String args[]) {
        int x, y, z;
        int[] w;

        x=8;
        y=3;
        Calculadora c1 = new Calculadora();

        z = c1.fatorial(x);
        System.out.println("O fatorial de " +x+ " é "+z);

        z= c1.potencia(x,y);
        System.out.println("O valor de " +x+ " elevado a "+y+" é "+z);

        z= c1.quadrado(x);
        System.out.println("O quadrado de " +x+ " é "+z);

        if(c1.divisivel(x,y)){
            System.out.println(x+ " é divisível por "+y);
        }else{
            System.out.println(x+ " não é divisível por "+y);
        }

        c1.sequencia(x);

        w= c1.divisores(x);

        for(int i = 0; i<w.length; i++){
            System.out.print(w[i]+" ");
        }
        System.out.println("");
        z = c1.tantoFaz(x,y);
        System.out.println(z);
    }

}
