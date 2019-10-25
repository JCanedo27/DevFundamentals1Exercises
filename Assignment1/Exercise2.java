/**
 * Calculate century based on year 
 * 
 * 1) Gather information 
 * 
 * 
 * 2) Decompose and search for patterns 
 * 
 * 2000/100
 * 3) Abstraction 
 * 
 * result= 2000/100
 * 2001 % 100 = if rest !=0 then result +1 
 * 
 * 4)Generalize
 * 
 * result=year / 100
 * rest=year % 100
 * if rest !=0 then result +1
 * 
 * 5) Programm  
 * 
 * System.out.println("Century is: " century )
 */

 import java.io.Console;

public class Exercise2 {
    static int year;
    static int century;

    public static void main(String[] args) {
        Console console = System.console();

        year = Integer.parseInt(console.readLine("Please enter a year: "));
        century = year /100;

        if (year % 100 != 0) {
            century = century + 1;
        }

        System.out.println("Century is: " + century);
    }
}