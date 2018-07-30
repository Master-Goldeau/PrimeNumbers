package NombresPremiers;

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
		
		for (init.getNumberToCheck(); init.getNumberToCheck()<10000000; init.numberToChek())
		{			
			init.isPrime(init.getNumberToCheck());
		}

//		System.out.println(listOfNumbersToCheckIterator);
//		System.out.println(init.getNumbersToCheck().get(listOfNumbersToCheckIterator));
//		System.out.println(init.getNumbersToCheck().toString());
		System.out.println(init.getPrimeNumbers().toString());
		
		
		 System.out.println(init.getNumberToCheck());
		// System.out.println();
	}

}
