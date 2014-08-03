/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saopayne
 */
public class UtopianTree {
    
     public static void main(String[] argv) {
        try {
            
            Scanner sc  = new Scanner(System.in);
            int numOfTestCases = sc.nextInt();
            
            for (int count = 0; count < numOfTestCases; count++) {
               int startNo = 1;
               int partNo = sc.nextInt();
              
               for (int i = 0;i < partNo ; i++){
                    if (i % 2 == 0){
                         startNo = startNo * 2;
                        
                    }
                    else{
                       startNo = startNo + 1;
                    }
                    
                }
                System.out.println(startNo);
            }
         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
