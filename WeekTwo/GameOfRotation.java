/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekTwo;

import java.util.Scanner;

/**
 *
 * @author saopayne
 */
public class GameOfRotation {
    
    public static void main(String ...$){
     
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Long[] num = new Long[n];
        Long array_sum = 0L;
        Long weight = 0L;
        for(int i = 0;i < n;i++){
            num[i]= in.nextLong();
            array_sum += num[i];
            weight += (i+1) * num[i];
         }
         Long max = weight;
         for(int i = 0;i < n;i++){
             weight = weight - array_sum + n*num[i];
            
             max = Math.max(max, weight);
         }
         
         System.out.println(max);
       }
    
}
