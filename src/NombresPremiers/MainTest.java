package NombresPremiers;

import java.util.ArrayList;

/**
 * Classe de démarrage de l'application
 * @author Etienne
 *
 */
public class MainTest {
			
	/*
	 * superList.add(new ArrayList<Object>());
	 * superList.get(0).add(new Object()); // retourne un objet de type List<Object>
	 * superList.get(0).get(0); // retourne un objet du type Object			
	 */
		
	public static void main(String[] args) {
		
		Initializer init = new Initializer();
		init.initLists();
		
		int checkMe;
		
		for(checkMe=7; checkMe<=251; checkMe++) {
			init.isPrime(checkMe);
		}
		
		System.out.println(init.getFirstNumbers().toString());
//		System.out.println(firstNumbers.get(0).get(0).toString());
//		System.out.println();
//		System.out.println();
	}

}
