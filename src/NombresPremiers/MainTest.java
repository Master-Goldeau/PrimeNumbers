package NombresPremiers;

import java.util.ArrayList;

/**
 * Classe de démarrage de l'application
 * 
 * @author Etienne
 *
 */
public class MainTest {

	/*
	 * superList.add(new ArrayList<Object>()); superList.get(0).add(new Object());
	 * // retourne un objet de type List<Object> superList.get(0).get(0); //
	 * retourne un objet du type Object
	 */

	public static void main(String[] args) {

		Initializer init = new Initializer();
		init.initLists();
		init.createListOfNumbersToCheck();

		int iterator=0;
		
		for (init.getNumbersToCheck().get(iterator); init.getNumbersToCheck().get(iterator) <= 251; iterator++) {
			init.isPrime(init.getNumbersToCheck().get(iterator));
		}

		System.out.println(iterator);
		System.out.println(init.getNumbersToCheck().get(iterator));
		System.out.println(init.getNumbersToCheck().toString());
		System.out.println(init.getPrimeNumbers().toString());
		// System.out.println(firstNumbers.get(0).get(0).toString());
		// System.out.println();
		// System.out.println();
	}

}
