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

public class CountingSort1 {
    
       public static void main(String ...$) {
              // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int numberCount[] = new int[100];
            //track the number count
            for(int i=0;i<n;i++){
                int number = sc.nextInt();
                numberCount[number]+=1;
             }
             //print number count
            for(int i= 0;i < numberCount.length;i++){
                System.out.print(numberCount[i]+" ");
            }
       }
    
}
