package NombresPremiers;

import java.io.Console;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.ConsoleHandler;

/**
 * Classe permettant l'initialisation du programme
 * 
 * @author Etienne
 * 
 */

public class Initializer {

	private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	private ArrayList<Integer> numbersToCheck = new ArrayList<>();

	// Getters
	public ArrayList<Integer> getPrimeNumbers() {
		return primeNumbers;
	}

	public ArrayList<Integer> getNumbersToCheck() {
		return numbersToCheck;
	}

	/**
	 * Méthode d'initialisation des listes.
	 * 
	 * @param aucun.
	 */

	public void initLists() {

		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);

	}

	public void createListOfNumbersToCheck() {

		int numberToAdd;

		for (numberToAdd = 7; numberToAdd < 395;) {

			numbersToCheck.add(numberToAdd);
			numberToAdd = numberToAdd + 4;
			numbersToCheck.add(numberToAdd);
			numberToAdd = numberToAdd + 2;
		}

	}

	/**
	 * Méthode permettant de vérifier qu'un nombre est premier.
	 * 
	 * @param Integer.
	 * @return false or true. if return true, le nombre testé est inséré dans la
	 *         première ou dans la 5ème colonne en fonction de son résultat %6.
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
		for (int i = 2; i * i <= checkMe; i++) {
			if (checkMe % i == 0)
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

}
