
/**
 * 
 * 
 * @author Nasi Robinson
 * 
 * For this practicum i set up a method that takes 3 varibles Expected heads, number of coins, and Heads on the board
 * i set it up for the default case that there are 3 coins being flipped. 2s already heads and the user is expecting 3 heads in total
 * 
 * Results: 0.3332
 * 
 * from the results we can conclude that there is a 33 percent chance or 1/3 percent chance that there will be another head 
 * which confirms the inclass result hh/ht th h 
 *
 */

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    
    public static int prob = 0;
    
    public static void main(String args[]){
    	
    	Scanner sc = new Scanner(System.in);
        int expected = sc.nextInt();
        int numberOfCoins = sc.nextInt();
        int numberHeads = sc.nextInt();
    	
        System.out.println(probability(expected,numberOfCoins,numberHeads));    
    }
    
    /**
     * This method takes in 3 parameters and calculates the probability of the next flip by
     * simulating it 100000 times
     * 
     * @param int expected number of heads that you want to occur
     * @param int number of coins being flipped
     * @param int number of heads on the board
     * 
     *@return probability.
     */
    public static double probability(int expected, int numberOfCoins, int numberHeads ){    
        
        if( numberOfCoins == numberHeads)
            return 1;
        
        for (int i = 0; i <= 10000; i++){
            
            int round = 0;
            
            
            for(int k = 0; k < numberOfCoins - numberHeads; k++){    
            round += coinFlip();
            }
            
            if( round + numberHeads >= expected)
                prob++;
            else
            	i++;
        } 
        
    double fin = ((double)prob)/10000;     
        return fin;
        
    }
    
    
    
public static int coinFlip(){    
   
	double rn = (double)(Math.random());
    if(rn >= 0.50)
        return 1;
    else
        return 0;
}
}