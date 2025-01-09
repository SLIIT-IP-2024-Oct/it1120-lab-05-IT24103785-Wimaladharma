import java.util.Scanner;

import java.util.Scanner;

public class IT24103785Lab5Q3 {
//constant declaration
    public static final Double PERCENT_1 = 0.1;
    public static final Double PERCENT_2 = 0.2;
    public static final Double R_FEE = 48000.0;

    public static void main(String[]args){
        //creating a Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Start Date(1-31): ");
        int Date_S = input.nextInt();
        System.out.print("Enter End Date(1-31): ");
        int Date_E = input.nextInt();

        int R_Date = Date_E - Date_S;
        
        if (Date_S > 31){
            System.out.print("Error:Days must between 1 an 31");
            return;
        
        }
        if (R_Date < 0){
            System.out.println("Error:Start Date must be less than End Date");
            return;
        }
        if (Date_E > 31){
            System.out.print("Error:Date must be between 1 and 31");
            return;
        
        }
        if (R_Date > 31){
            System.out.println("Error:Reserve Dates must not over 30");
            return;
        }

	System.out.println("\nRoom Charges per Day: Rs. "+R_FEE);

	System.out.println("Number of Days Reserved: "+R_Date);

        if (3 < R_Date && R_Date < 4){
            Double R_Date_P = R_FEE * R_Date - PERCENT_1 * R_FEE;
            System.out.print("Total amount to be paid: "+R_Date_P);
        }
        if (R_Date > 4){
            Double R_Date_P1 = R_FEE * R_Date - PERCENT_2 * R_FEE;
            System.out.println("Total amount to be paid: "+R_Date_P1);
        }
        
    }
       
}  
    
