/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOne;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author saopayne
 */
public class ManassaAndStones {
    
    
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int t = in.nextInt();
          for(int i = 0; i < t; i++){
             Set<Long> answer= ManasaandStones(in.nextLong(), in.nextLong(), in.nextLong());
             Iterator<Long> iterator = answer.iterator();
             while(iterator.hasNext()){
                 System.out.printf("%d ",iterator.next());
             }
             System.out.println();
         }
     }
     
     private static Set<Long> ManasaandStones(long n, long a, long b){
         
          //Write code to solve each of the test over here
          if(a > b){
              //swap  to preserve order which is necessary
              long temp = b;
              b = a;
              a = temp;
          }
          Set<Long> hs = new TreeSet<Long>();
          for(int i = 0;i <= n-1;i++){
              hs.add(i*b+(n-1-i)*a);
          }
          return hs;        
     }
    
     
}
