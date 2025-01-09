import java.util.Scanner;
public class IT24103785Lab5Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");
        int members = input.nextInt();

        if (members == 0){
            System.out.println("No Price");
        }
        if (members < 0){
            System.out.print("Input must be a number 0 or greater");
        }
        if (members == 1){
            System.out.print("Price is a : pen");
        }
        if (members == 2){
            System.out.print("Price is a : Umbrella");
        }
        if (members == 3){
            System.out.print("Price is a : Bag");
        }
        if (members == 4){
            System.out.print("Price is a : Traveling Chair");
        }
        if (members >= 5){
            System.out.print("Prize is a : Headphone");
        }
    }
}
    

