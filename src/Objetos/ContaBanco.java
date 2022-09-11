package Objetos;

public class ContaBanco {

	public int numConta;
	public String tipo;
	private String dono;
	private float saldo;
	private boolean status; // do tipo lógico
	
	// métodos especiais
	public ContaBanco() {
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
		saldo += 50;      // conferir isso aqui
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// métodos personalizados
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo == "CC") {
		//  this.saldo = 50; mexendo diretamente no atributo
			this.setSaldo(50); // mexendo pelo método
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
		System.out.println("-------------------------------");
		System.out.println("Conta aberta com sucesso");
		System.out.println("-------------------------------");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, porque ainda tem dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, porque tem débito");
		} else {
			System.out.println("-------------------------------");
			System.out.println("Conta fechada com sucesso");
			System.out.println("-------------------------------");

		}
	}
	public void depositar(float valor) {
		if(this.getStatus()) {
		// this.saldo = this.saldo + v;  trabalhando diretamente com os atributos
		   this.setSaldo(this.getSaldo() + valor); // trabalhando diretamente com os métodos especiais
			System.out.println("Depósito realizado na conta de: " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada");
		}
	}
	
	public void sacar(float valor) {  // valor é um parâmetro do tipo real
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	
	public void pagarMensal() {
		int valor = 0;
		if(this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP"){ 
			valor = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() -valor);
			System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada");
		}
	}
	
	// estado atual do objeto
	public void visualizar() {
		System.out.println("Titular da conta: " + getDono());
		System.out.println("Tipo de conta: " + getTipo());
		System.out.println("Número da conta: " + getNumConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status: " + getStatus());
		System.out.println("-------------------------------");

	}
}
