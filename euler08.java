
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saopayne
 */
public class euler08 {
    
      public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int k = 0; k < T;k++){
                StringBuilder strbuilder = new StringBuilder();
            
                int N = sc.nextInt();
                int K = sc.nextInt();
           
                strbuilder.append(sc.next());
            
            
            String str = strbuilder.toString();
            String fiveDigits = String.valueOf(K);
            int largestNum = 0;
            for (int i = 0; i < str.length() - 4; i++){
                    fiveDigits = str.substring(0,(0 + K) );
                    int product = 1;
                    int start = 0;
                    for (int t = 0; t < fiveDigits.length(); t++){
                       product *= Integer.parseInt(fiveDigits.substring(t, t+1));
                        if (product > largestNum){
                            largestNum = product;
                        }
                    }
          
            }
            System.out.println( largestNum);
     }
  }
 
    
 
    
}
