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
public class InsertionSortPart2 {
    
    
    public static void insertionSort(int[] ar){
           
           int index =0;
           for(int i=1;i<ar.length;i++){
               int number = ar[i];
               index++;
              
               insertionSort2(ar,index);
               
           }
        
}
    public static void insertionSort2(int[] ar,int index){
       
        for(int i=0;i<=index;i++){
            if(ar[i]> ar[index]){
                int temp=0;
                temp = ar[index];
                ar[index]=ar[i];
                ar[i]=temp;
               
            }
            else
            {
                continue;
            }
            
            
        }
     
//       printArray(ar);
        
    }
    
    
      
    public static void main(String ...$) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSort(ar);    
       printArray(ar);
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
       System.out.println("");
   }
    
   
    
}
