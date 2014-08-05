/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author saopayne
 */
public class QuickSort {
    
    static void partition(int[] ar) {
		int pivot = ar[0];
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		for(int i = 1; i < ar.length; i++) {
			(ar[i] < pivot ? left: right).add(ar[i]);
		}
		
		for(int i = 0; i < left.size(); i++) {
			ar[i] = left.get(i);
		}
		ar[left.size()] = pivot;
		for(int i = 0; i < right.size(); i++) {
			ar[i + left.size() + 1] = right.get(i);
		}
		printArray(ar);
	}

	/* Tail starts here */

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String ...$) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
	}
    
}
