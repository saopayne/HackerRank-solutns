/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekTwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author saopayne
 */
public class MarkAndToys {
    
    public static void main(String ...$){
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int [] toys = new int[N];
        for (int i = 0; i < N; i++){
            toys[i] = in.nextInt();
        }
        Arrays.sort(toys);
        int price = 0;
        int count = 0;
        for (int j = 0; j < N;j++){
            price += toys[j];
            if (price > K){
               break;
            }else{
                count++;
            }
        }
        
        System.out.println(count);
        
        in.close();
    }
    
}
