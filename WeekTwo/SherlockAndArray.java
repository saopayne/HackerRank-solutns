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
public class SherlockAndArray {
    
   public static void main(String ...$){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0;i<T;i++){
            String answer = "NO";
            int N = in.nextInt();
            //form array from inputs
            int[] a = new int[N];
            int total = 0;
            for(int j = 0;j<N;j++){
                a[j] = in.nextInt();
                total = total + a[j];
            }
            if(N==1){
                answer = "YES";
                System.out.println(answer);
                continue;
            }
            if(N==2){
                System.out.println(answer);
                continue;
            }
            int left = 0;
            int right = total;
            for(int j = 1;j<N-1;j++){
                left = left+a[j-1];
                right = total - a[j] - left;
                if(left == right){
                    answer = "YES";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
