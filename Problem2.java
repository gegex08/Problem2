/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /////////////////////////////////
        System.out.println("Part A:");
        //a
        //import Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an age: ");
        //declare age as a varialble
        int age = input.nextInt();
        if (age >= 65 ){//added brace
        System.out.println( "Age is greater than or equal to 65" );
        }
        else{//added brace
        System.out.println( "Age is less than 65 ");//Quote was in the wrong place
        }
        System.out.println("");//prints whitespace
        
        
        //////////////////////////////////
        //b
        System.out.println("Part B:");
        //Enter a number
        int x = 1, total =3;//give total a value

        while (x <= 10  ){
        
        total += x;// need the same name
        x++;
        System.out.println(total);//output total
        }
        System.out.println("");//prints whitespace
        
        //////////////////////////////////
        //c: a continuation of b
        System.out.println("Part C:");
       while ( x <= 100 ){//needs open and closed braces

         total += x;

        ++x;
           System.out.println(total);//print statement needed
           if (total >= 20){//added if statetment to set condition so that loop can end
             break;//end loop once condition is met
         }
       }//closed braces
        
        System.out.println("");//prints whitespace
        
        //////////////////////////////////
        //d
        System.out.println("Part D:");
        int y =5;//declare variable and set it to a value
        while ( y > 0 ){
         
            System.out.println(y );

         ++y;
         if (y >= 10){//added if statetment to set condition so that loop can end
             break;//end loop once condition is met
         }
        }//add closing bracket
    }
    
}
