import java.util.*;



public class Principal_Lists {

	/**
	 * 1. Cire uma classe Aluno com os atributos nome, idade e media.
	 * Crie uma lista de alunnos, adicione alunos nela, e depois ordene pelo nome, e 
	 * exiba a lista. Depois ordene pelas notas e exiba a lista novamente.
	 * 
	 * 2. Crie um HashMap<int, Aluno>, onde a chave corresponde ao numero de 
	 * matricula do aluno. Insira alguns alunos nesse Map.
	 * 
	 * 3. Crie um HashSet de alunos e insira varios alunos nela.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Aluno_Lists> lista = new ArrayList<>();
		Aluno_Lists a1 = new Aluno_Lists("Rafael", 20, 10.0F);
		Aluno_Lists a2 = new Aluno_Lists("Joao", 18, 9.0F);
		Aluno_Lists a3 = new Aluno_Lists("Adson", 19, 8.0F);
		Aluno_Lists a4 = new Aluno_Lists("Diego", 18, 7.0F);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
		
		Map<Integer, Aluno_Lists> mapaDeAlunos = new HashMap<>();
		mapaDeAlunos.put(233, a1);
		mapaDeAlunos.put(283, a2);
		mapaDeAlunos.put(334, a3);
		mapaDeAlunos.put(243, a4);
		
		
		
		Set<Aluno_Lists> alunos = new HashSet<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		

	}

}
