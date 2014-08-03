/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOne;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author saopayne
 */
public class MaximisingXor {
    
    public static void main (String ...$){
        Scanner input = new Scanner(System.in);
        short left = input.nextShort();
        short right = input.nextShort();
        //keep track of the counting
        short max = 0;
        
        for (int a = left; a <= right; a++){
            for (int b = a; b <= right; b++){
                int current = a ^ b;
                
                if (current > max){
                    max = (short) current;
                }
            }
        }
        System.out.println(max);
        input.close();
    }
    
  
}
