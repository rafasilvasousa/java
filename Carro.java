
public class Carro {
	private String cor;
	private String placa;
	private Marca marca;
	private String chassi;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public boolean equals(Object arg0){
		Carro aux = (Carro)arg0;
		if (this.getChassi().equals(aux.getChassi())){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		return "Marca: "+this.getMarca() + "\tPlaca: "+ this.getPlaca() +"\tChassi: " +this.getChassi()+"\tCor: " +this.getCor();
	}
}
