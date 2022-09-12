package ObjetoParteTres;

public class Cachorro extends Mamifero{

	public void enterrarOsso() {
		System.out.println("enterrando o osso");
	}
	
	public void abanarRabo() {
		System.out.println("abanando o rabinho");
	}
	
	@Override
	public void emitirSom () {
		System.out.println("au au");
	}
}
