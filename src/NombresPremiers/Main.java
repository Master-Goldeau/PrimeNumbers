package NombresPremiers;

public class Main {
    
    public static int NombreFacteur(int N) {
         int Count=2,I;
         double Racine=Math.sqrt(N);
         for(I=2; I<=Racine;I++) if(N % I == 0) Count++;
         return Count;
    }
    
    public static boolean Premier(int N) {
        return (NombreFacteur(N)==2);
    }
 
    public static int NombrePremierPlusPetit(int N) {
         int Count=0;
         for(int I=2; I<N; I++) if(Premier(I)) Count++;
         return Count;
    }
 
    
    public static boolean isPremier(int n)
    {
        if(n<=1) return false;
        for(int i = 2;i*i<=n;i++)
        {
            if (n%i ==0)
            return false;
            
        }
        return true;
    }
    
    public static void main(String[] args) {
    	
    	System.out.println(isPremier(251));
    	
    	
    	
    }
    
}

























