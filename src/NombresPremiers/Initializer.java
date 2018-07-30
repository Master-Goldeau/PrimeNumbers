package NombresPremiers;

import java.util.ArrayList;

/**
 * Classe permettant l'initialisation du programme
 * 
 * @author Etienne
 * 
 */

public class Initializer {

	private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	// private ArrayList<Integer> numbersToCheck = new ArrayList<>();
	private int primeNumbersIterator = 2;
	private int numberToCheck = 7;

	// Getters
	public ArrayList<Integer> getPrimeNumbers() {
		return primeNumbers;
	}
	
	public int getNumberToCheck() {
		return numberToCheck;
	}

	// public ArrayList<Integer> getNumbersToCheck() {
	// return numbersToCheck;
	// }

	/**
	 * M�thode d'initialisation des listes.
	 * 
	 * @param aucun.
	 */

	public void initLists() {

		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);

	}

	/**
	 * M�thode permettant de v�rifier qu'un nombre est premier.
	 * 
	 * @param Integer.
	 * @return false or true. if return true, le nombre test� est ins�r� dans la
	 *         premi�re ou dans la 5�me colonne en fonction de son r�sultat %6.
	 */

	/*
	 * superList.add(new ArrayList<Object>()); superList.get(0).add(new Object());
	 * // retourne un objet de type List<Object> superList.get(0).get(0); //
	 * retourne un objet du type Object
	 */

	public boolean isPrime(int checkMe) {

		// Iterator<Object> iterator = firstColumn.iterator();

		if (checkMe % 2 == 0)
			return false;
		for (primeNumbersIterator = 2; primeNumbersIterator * primeNumbersIterator <= checkMe; primeNumbersIterator++) {
			if (checkMe % primeNumbersIterator == 0)
				return false;
		}

		switch (checkMe % 6) {
		case 1:
			primeNumbers.add(checkMe);
			break;
		case 5:
			primeNumbers.add(checkMe);
			break;
		default:
			System.out.println("ERROR");
		}

		return true;
	}

	public Integer numberToChek() {
		
			switch (numberToCheck % 6) {
			case 1:
				numberToCheck = numberToCheck + 4;
				break;
			case 5:
				numberToCheck = numberToCheck + 2;
				break;

			default:
				break;
			
		}

		return numberToCheck;
	}

}
