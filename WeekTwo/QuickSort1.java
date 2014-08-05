/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekTwo;

/**
 *
 * @author saopayne
 */
import java.util.*;

public class QuickSort1{
       
     static int partition(int[] ar,int start,int end) {
          ArrayList<Integer> smaller = new ArrayList<Integer>();
          ArrayList<Integer> bigger = new ArrayList<Integer>();
          int pivot = ar[start];
          for(int i = start+1;i < end;i++){
              if(ar[i] <= pivot)
                 smaller.add(ar[i]);
             else 
                 bigger.add(ar[i]);            
         }
       
         int i = 0;
         for(i = 0;i<smaller.size();i++)
             ar[start+i] = smaller.get(i);
         ar[start+i] = pivot; 
         int p = start+i;
         for(;i-smaller.size()<bigger.size();i++)
             ar[start+i+1] = bigger.get(i-smaller.size());
         
         return p;
         
     }
        static void quickSort(int[] ar,int start,int end) {
            if(start >= end - 1)
                return;
            int p = partition(ar,start,end);
            quickSort(ar, start, p);
            quickSort(ar, p+1, end);
            printArray(ar, start, end);
        }   
  
       static void printArray(int[] ar,int start,int end) {
          StringBuffer sb = new StringBuffer();
          for(int i = start;i < end;i++)
              sb.append(ar[i]).append(" ");
          System.out.println(sb.toString());
       }        
       public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
               ar[i]=in.nextInt(); 
            }
            quickSort(ar,0,ar.length);
        }    
   }