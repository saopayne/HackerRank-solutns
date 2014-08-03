/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOne;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;


/**
 * @author Saopayne
 *
 */
public class isFibo{

       /**
        * @param args
        */
       static BufferedReader in = new BufferedReader(new InputStreamReader(
                     System.in));

       static ArrayList<String> arlst = new ArrayList<String>();

       public static void preCompute() {
              arlst.add("0");
              arlst.add("1");

              for (int i = 2; i <= 60; i++) {
                     BigInteger fibNum = fibonacci(BigInteger.valueOf(i));
                     arlst.add(fibNum.toString());
              }
       }
       //using memoization, computing using previously computed values
       public static BigInteger fibonacci(BigInteger number) {
              BigInteger lastFirst = new BigInteger(arlst.get(arlst.size() - 1));
              BigInteger lastSecond = new BigInteger(arlst.get(arlst.size() - 2));
              BigInteger third = lastFirst.add(lastSecond);
              return third;
       }

       // Returns true if n is a Fibonacci Number, else false
       public static String isFibonacci(BigInteger n) {
              if (arlst.contains(n.toString()))
                     return "IsFibo";
              else
                     return "IsNotFibo";
       }

       public static void main(String[] args) throws NumberFormatException,
                     IOException {
              // TODO Auto-generated method stub
              int T = Integer.parseInt(in.readLine());
              // pre-compute fibonacci numbers
              preCompute();
              System.out.println(arlst.toString());
              for (int i = 0; i < T; i++) {
                     BigInteger number = new BigInteger(in.readLine());
                     System.out.println(isFibonacci(number));
              }
              in.close();
       }

}