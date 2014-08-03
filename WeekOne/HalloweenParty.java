/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOne;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author saopayne
 */
public class HalloweenParty {
    
  
       public static long noOfChocolates(int k) {
              long noOfChocolates = 0;

              noOfChocolates = (long) (k / 2) * (k - (long)(k / 2));
              return noOfChocolates;
       }

       public static void main(String[] args) {
             
              Scanner sc = new Scanner(System.in);
              int T = sc.nextInt();
              // T Test Cases to handle
              for (int i = 0; i < T; i++) {
                     int k = sc.nextInt();
                     System.out.println(noOfChocolates(k));
              }
              sc.close();
       }
}