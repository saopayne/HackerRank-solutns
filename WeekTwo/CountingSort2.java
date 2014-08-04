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
public class CountingSort2 {
    
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
              //print numbers for which count is greater than zero
              for(int i=0;i<numberCount.length;i++){
                for(int j=0;j<numberCount[i];j++)
                    System.out.print((i)+" ");
                } 
        }
    
}
