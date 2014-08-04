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
public class TutorialIntro {
    
    public static void main(String ...$){
        
        Scanner sc = new Scanner(System.in);
        int numToSearch = sc.nextInt();
        int arrayLength = sc.nextInt();
        int [] theArrray = new int[arrayLength];
        for (int i = 0; i < theArrray.length ; i++){
            theArrray[i] = sc.nextInt();
        }
        for (int j = 0; j < theArrray.length; j++){
            if(theArrray[j] == numToSearch){
                System.out.println(j);
            }
        }
    }
    
}
