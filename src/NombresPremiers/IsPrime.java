package NombresPremiers;

import java.util.ArrayList;

public class IsPrime {
	
	
	private ArrayList<Integer> primeNumbers;
		
	public boolean isPrime(int checkMe)
    {
		if(checkMe%2==0) return false;
        for(int i = 7; i*i<=checkMe; i++)
        {
            if (checkMe %i == 0)
            return false;
            i++;
        }
        
        primeNumbers.add(checkMe);
        return true;
    }
	
}

// checkme %6 = 1 : ajouter dans firstColumn;
//checkme %6 = 5 : ajouter dans fithColumn