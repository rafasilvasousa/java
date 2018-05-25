import java.util.ArrayList;
import java.util.Collections;


public class Teste_Lista_Inte_21052018 implements Lista {
	ArrayList<String> lista = new ArrayList<>(); 
	
	
	//  Adicionar uma string na lista
	public void adicionar(String nome){
		lista.add(nome);
	}
	
	//  Remove o ultimo elemento
	public void removeUltimo(){
		lista.remove(lista.size()-1);
	}
	//Remove o primeiro elemento
	public void removerPrimeiro(){
		lista.remove(0);
	}
	//Remove a palavra passada como parametro da lista
	public void removePalavra(String palavra){
		for(String word: lista){
			if(word.equals(palavra)){
				lista.remove(lista.indexOf(word));
			}
			
		}
		
	}
	//Ordenar a lista pelo nome
	public void ordenar(){
		Collections.sort(lista);
		
	}
	//Retorna todas as palavras que contem o parametro passado
	public String[] contem(String a){
		String[] vet = new String[lista.size()];
		int ind= 0;
		for(String word:lista){
			if(word.contains(a)){
				vet[ind]=word;
				ind++;
			}
		}
		
		return vet;
	}
	//Remove todos os elementos da lista
	public void limpaLista(){
		lista.clear();
		
	}
	//Exibe todos os elementos contidos na lsita.
	public void exibeTodos(){
		System.out.println(lista);
		
	}
	//retorna a quantidade de elementos da lista
	public int tamanho(){
		return lista.size();
		
	}
}
