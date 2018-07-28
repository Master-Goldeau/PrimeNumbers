package NombresPremiers;

import java.io.Console;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;

/**
 * Classe permettant l'initialisation du programme
 * @author Etienne
 * 
 */

public class Initializer {

	private static ArrayList<ArrayList<Object>> firstNumbers = new ArrayList<ArrayList<Object>>();

	private ArrayList<Object> listeVide = new ArrayList<>();
	private ArrayList<Object> firstColumn = new ArrayList<>();
	private ArrayList<Object> secondColumn = new ArrayList<>();
	private ArrayList<Object> thirdColumn = new ArrayList<>();
	private ArrayList<Object> fifthColumn = new ArrayList<>();

	//Getters
	
	public ArrayList<ArrayList<Object>> getFirstNumbers() {
		return firstNumbers;
	}

	public ArrayList<Object> getListeVide() {
		return listeVide;
	}

	public ArrayList<Object> getFirstColumn() {
		return firstColumn;
	}

	public ArrayList<Object> getSecondColumn() {
		return secondColumn;
	}

	public ArrayList<Object> getThirdColumn() {
		return thirdColumn;
	}

	public ArrayList<Object> getFifthColumn() {
		return fifthColumn;
	}

	
	
	/**
	 * Méthode di'initialisation des listes.
	 * @param aucun.
	 */
	
	public void initLists() {
		firstNumbers.add(0, listeVide);
		firstNumbers.add(1, firstColumn);
		firstNumbers.add(2, secondColumn);
		firstNumbers.add(3, thirdColumn);
		firstNumbers.add(4, listeVide);
		firstNumbers.add(5, fifthColumn);

		firstColumn.add(1);
		secondColumn.add(2);
		thirdColumn.add(3);
		fifthColumn.add(5);
	}

	/**
	 * Méthode permettant de vérifier qu'un nombre est premier.
	 * @param Integer.
	 * @return false or true.
	 * if return true, le nombre testé est inséré dans la première ou dans la 5ème colonne
	 * en fonction de son résultat %6.
	 */
	
	public boolean isPrime(int checkMe) {
		
		if (checkMe % 2 == 0)
			return false;
		for (int i = 2; i*i <= checkMe; i++) {
			if (checkMe % i == 0)
				return false;
		}
		
		switch (checkMe%6)
		{
		case 1: firstColumn.add(checkMe);
		break;
		case 5: fifthColumn.add(checkMe);
		break;
		default: System.out.println("ERROR");
		}
		
		return true;
	}

}
