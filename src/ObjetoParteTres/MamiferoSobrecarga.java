package ObjetoParteTres;

public class MamiferoSobrecarga extends AnimalSobrecarga{

	protected String corPelo;
	
	@Override
	public void emitirSom() {
		System.out.println("som de mamífero");
	}
}
