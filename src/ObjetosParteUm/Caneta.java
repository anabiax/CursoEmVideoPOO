package ObjetosParteUm;

public class Caneta {
	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected boolean tampada;
	
	// este � o m�todo Construtor - tem o mesmo nome da class - chuchu
	public Caneta() {
		
	}
	
	// criando estado
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); // "this" significa autorrefer�ncia
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
		
	}
	
	
	// criando m�todos
	public void rabiscar() { // do tipo sem retorno
		if(this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar");
		} else {
			System.out.println("\n Estou rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true; // this � o nome do objeto que chamou
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
