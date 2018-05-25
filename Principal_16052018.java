import java.util.*;


public class Principal_16052018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int option = -1;
		int a;
		Carro novo;
		
		ArrayList<Carro> cad = new ArrayList<>();
		
		System.out.println("==================================================");
		System.out.println("===============CADASTRO DE VEICULO================");
		System.out.println("==================================================");
		
		while(option !=0){
			System.out.println("-Digite a opção desejada:");
			System.out.println("1 - Cadastrar novo veículo.");
			System.out.println("2 - Exibir cadastrados.");
			System.out.println("0 - Sair");
			option = leitor.nextInt();
			if (option==1){
				novo = new Carro();
				System.out.println("Selecione a marca do veículo:");
				System.out.println("4 - AUDI\n5 - FERRARI\n6 - MUSTANG\n7 -	PAGANI\n8 - BUGATTI\n9 - BMW\n10 - LAMBORGHINI\n11 - ASTON\n12 - PORSCHE");
				a = leitor.nextInt();
				while(a<4 || a>12){
					System.out.println("Opção invalida. Tente novamente.");
					a = leitor.nextInt();	 
				}
				novo.setMarca(Marca.values()[a]);
				System.out.println("Digite a cor do veículo:");
				novo.setCor(leitor.next());
				System.out.println("Digite a placa do veículo:");
				novo.setPlaca(leitor.next());
				System.out.println("Digite o chassi do veículo:");
				novo.setChassi(leitor.next());
				
				for(Carro c1:cad){
					if(c1.equals(novo)){
						System.out.println("Há um carro cadastrado com esse chassi, tente um novo veiculo!!");
						break;
					}		
				}
				cad.add(novo);
				}
			if(option==2){
				System.out.println(cad);
			}
			}

	}
}



