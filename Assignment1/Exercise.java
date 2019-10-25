import java.io.Console;
import java.lang.Math;

public class Exercise {

    public static void main (String[] args){
        Console console = System.console();
        int numberOfDigits = Integer.parseInt(console.readLine("Enter number of digits: "));
        int result = (int) Math.pow(10, numberOfDigits)-1;
        System.out.println(result);    
    }
}