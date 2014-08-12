
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saopayne
 */
public class BinarySearch {
    
    public static void main(String ...$){
        
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.println(solve(2, arr));
        
    }
    
    static int solve(int key,int [] arr){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (key < arr[mid]){
                hi = mid+1;
            }else if (lo > arr[mid]){
                lo = mid-1;
            }else{
                return mid;
                
            }
        }
        return -1;
    }
    
}
