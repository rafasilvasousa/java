public class TesteInteiro {
    public static void teste(){
        Inteiro obj;
        obj = new Inteiro(8);
        System.out.println("O objeto contem: "+ obj.getInt());
        obj.setInt(4);
        System.out.println("O objeto contem: "+ obj.getInt());
    }
}
