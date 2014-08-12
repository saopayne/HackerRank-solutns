/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author saopayne
 */
public class Flowers {
    
    public static void main(String[] args) throws Exception {
        Flowers main = new Flowers();
        main.run();
        System.exit(0);
    }

    public void run() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        str = br.readLine().split("\\s");
        int[] cost = new int[N];
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(cost);
        int total = 0;
        int _K, i;
        for (i = N - 1, _K = K; i >= 0 && _K > 0; i--, _K--) {
            total += cost[i];
        }
        int index = 0;
        int round = 1;
        for (; i >= 0; i--) {
            total += cost[i] * (round + 1);
            index++;
            if (index >= K) {
                round++;
                index = 0;
         }
        }
        System.out.println(total);
       }
}
