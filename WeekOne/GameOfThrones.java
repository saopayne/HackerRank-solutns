/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOne;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author saopayne
 */
public class GameOfThrones {
    
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String theStr = myScan.nextLine();
        int[] freq = new int[26];
        for(int i = 0; i < theStr.length(); i++){
            freq[theStr.charAt(i) - 'a']++;
        }
        boolean singleFound = false;
        String ans = "YES";
        for(int i = 0; i < 26; i++)
        {
            if(freq[i] % 2 != 0)
            {
                if(singleFound)
                {
                    ans = "NO";
                    break;
                }
                else
                    singleFound = true;
            }
        }
        System.out.println(ans);
        myScan.close();
    }
    
}
