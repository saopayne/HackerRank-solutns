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
public class LoveLetterMystery {
    
    public static void main(String[] argv) {
        try {
            
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
            int numOfTestCases = Integer.parseInt(bufReader.readLine());
            
            
            for (int j = 0; j < numOfTestCases; j++) {
               int s = 0;
               String word = bufReader.readLine();
               for (int i = 0; i < (word.length()/2); i++){
                   s += Math.abs((word.charAt(i)) - (word.charAt(word.length()-i-1)));
                  
               }
                System.out.println(s);
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
