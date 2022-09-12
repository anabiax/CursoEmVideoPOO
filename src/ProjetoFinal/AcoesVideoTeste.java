package ProjetoFinal;

public class AcoesVideoTeste {

	public static void main(String[] args) {
			// vetor
		Video v[] = new Video[3];
		v[0] = new Video ("Aula 1 de POO");
		v[1] = new Video ("Aula 7 de Java");
		v[2] = new Video ("Aula 15 de Algoritmos");
		
		Gafanhoto g [] = new Gafanhoto [2];
		g[0] = new Gafanhoto ("Ana", 21, "F", "opress�o");
		g[1] = new Gafanhoto ("Qu�zia", 22, "F", "cacheada");
		
		System.out.println("\n V�DEOS \n-------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());

		System.out.println("\n GAFANHOTOS \n-------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());

		Visualizacao vis[] = new Visualizacao[5];
		vis[0]= new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());

		
		vis[1]= new Visualizacao(g[0], v[1]);
		vis[0].avaliar(87.0f);
		System.out.println(vis[1].toString());

	}

}
