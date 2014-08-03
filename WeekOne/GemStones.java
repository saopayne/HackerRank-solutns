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
public class GemStones {
   
   public static void main( String ...$ ){
    String element[] = new String[100];
    Scanner input = new Scanner( System.in ) ;
    char ch ;
    int rocks , length , ele = 0 , rk = 0;
    rocks = input.nextInt();
    for( int k = 0 ; k < rocks ; k++ ){
       element[k] = input.next() ;
    }
    length = element[0].length() ;
    for( int i = 0 ; i < length ; i++ ){
     rk = 0;
     ch = element[0].charAt(i);
     for( int j = 1 ; j < rocks ; j++ ){
           for( int h = 0 ; h < element[j].length() ; h++ ){
         if( ch == element[j].charAt(h) ){
             element[j]=element[j].substring(0,h)+element[j].substring(h+1);
             rk++;
      break;
          }
            }
               }
    if( rk == rocks - 1 )
       ele++;
    }
    System.out.println(ele) ;
    input.close();
   }
}
    

