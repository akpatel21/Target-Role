/**
 * 
 * @author Akul Patel
 * Target Roll
 *
 */
import java.util.Random; 
import java.util.Scanner; 

public class TargetRole { 

	public static void main(String[] args)  

    { 

        Random rand = new Random(); 
        Scanner scan = new Scanner(System.in); 

        System.out.print("Please enter a number between 1 and 6: "); 
        Integer num = scan.nextInt(); 

        while(!(num >= 1 && num <= 6)) 
        {
            System.out.print("Please enter a number between 1 and 6: "); 
            num = scan.nextInt(); 
        } 

        Integer die = rand.nextInt(5) + 1; 
        System.out.print("You rolled: " + die); 
        Integer rolls = 1; 
        scan.nextLine(); 

        while(num != die) 
        { 
            System.out.print("\nPlease hit enter to roll again."); 
            scan.nextLine(); 
            die = rand.nextInt(6) + 1; 
            System.out.print("You rolled: " + die); 
            rolls++; 
        } 

        System.out.print("\nIt took " + rolls + " rolls for you to reach your number."); 

    } 

} 

 