
public class Aluno_Lists implements Comparable<Aluno_Lists> {
		String nome;
		int idade;
		float media;
		int matricula;
		
		public Aluno_Lists(String nome, int idade, float media){
			this.nome = nome;
			this.idade = idade;
			this.media = media;
		}
		
		public String toString(){
			return "\nNome: "+this.nome+ "\t Idade: "+this.idade+"\t Media: "+this.media;
		}
		
		public int compareTo(Aluno_Lists outro){
			return this.nome.compareTo(outro.nome);
		}
		
		void setMatricula(int matricula){
			this.matricula = matricula;
		}
			
}
