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
public class RunningTimeAlgo {
    
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int[] ar = new int[n];
          for(int i=0;i<n;i++){
             ar[i]=in.nextInt();
          }
          System.out.println(insertionSort(ar));
                 
          in.close(); //close the scanner
              }   
    
  
     public static int insertionSort(int[] A){
         int numShifts=0;
         for(int i = 1; i < A.length; i++){
           int value = A[i];
           int j = i - 1;
           while(j >= 0 && A[j] > value){
             A[j + 1] = A[j];
             j = j - 1;
             //counting shift
            numShifts++; 
           }
           A[j + 1] = value;
         } 
         return numShifts;
               
       }

       
}
