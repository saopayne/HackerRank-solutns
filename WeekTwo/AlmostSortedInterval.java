/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author saopayne
 */
public class AlmostSortedInterval {
    
     public static void main(String[] args) throws IOException{
        
       //Get input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        N = 0;
        for(String a : br.readLine().split(" ")){
            A[N++] = Integer.parseInt(a);
        }
        br.close();
        br = null;
        
        //Solve
        long count = solve(A, N);
        
        //Print
        System.out.print(count);
    }
    
    private static long solve(int[] A, int N){
        if (N < 2){
            return N;
        }
        
        long count = 1L;
        
        //Initialize
        int numTops = 1;
        int minStart = 0;
        int numStarts = 1;
        int[] startIs = new int[N];
        int[] startVs = new int[N];
        int[] topIs = new int[(N >> 1) + 1];
        int[] topVs = new int[(N >> 1) + 1];
        topIs[0] = -1;
        topVs[0] = N + 1;
        startIs[0] = 0;
        startVs[0] = A[0];
        
        //For every value in A
        for (int i = 1; i < N; ++i){
            ++count;
            int val = A[i];
            
            //If upslope
            if (val > A[i-1]){
                
                
                //If we are above highest mountain previously visible behind us
                if (val > topVs[numTops-1]){
                    
                    //Look for highest mountaintop now visible behind us
                    while (--numTops > 0 && val > topVs[numTops-1]){
                    }
                    
                    //Look for first start possible after found mountaintop
                    minStart = ~Arrays.binarySearch(startIs, 0, numStarts, topIs[numTops-1]);
                }
                
                //Add the number of starts that can reach this point
                count += numStarts - minStart;
            
            //If downslope
            } else {
                
                //Save mountaintop
                topIs[numTops] = i-1;
                topVs[numTops++] = A[i-1];
                
                //Ride slope to bottom
                while (++i < N && A[i] < A[i-1]){
                    ++count;
                }
                //Get the valley's bottom
                val = A[--i];
                
                //Ignore unstartable starts (Slices tops off mountains before us down to this point)
                minStart = numStarts = ~Arrays.binarySearch(startVs, 0, numStarts, val);
            }
            
            //Add start point to list
            startIs[numStarts] = i;
            startVs[numStarts++] = val;
          
        }
        
        return count;
   }
    
}
