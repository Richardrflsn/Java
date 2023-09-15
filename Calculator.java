import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        double number1 = 0, number2 = 0, result = 0.0;
        int choice = 0;
        boolean exit = false;
        System.out.println("\nCalculator");
        System.out.println("---------------");
        System.out.println("Total = " + result);
        System.out.print("\n\nInput number : ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextDouble();
        System.out.println("");
        
        while (exit != true) {
            System.out.println("\nCalculator");
            System.out.println("---------------");
            System.out.println("Total = " + result);
            if(number2 == 0){
                System.out.print("\n\n\nInput number : " + number1);
            } else if(choice == 6){
                System.out.print("\n\nInput number : ");
                number1 = input.nextDouble();
            }
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Clear Total");
            System.out.println("7. Exit");
            System.out.print("Operator [1...7]: ");
            choice = input.nextInt();

            if(choice <= 5){
                System.out.print("Input number : ");
                number2 = input.nextDouble();
            }
            switch (choice) {
                case 1:
                    result = number1 + number2;
                    number1 = result;
                    break;
                case 2:
                    result = number1 - number2;
                    number1 = result;
                    break;
                case 3:
                    result = number1 * number2;
                    number1 = result;
                    break;
                case 4:
                    if(number2 != 0){
                        result = number1 / number2;
                        number1 = result;
                    } else {
                        System.out.println("Error: Divison by zero");
                    }
                    break;
                case 5:
                    if(number2 != 0){
                        result = number1 % number2;
                        number1 = result;
                    } else {
                        System.out.println("Error: modulo by zero");
                    }
                    break;
                case 6:
                    result = 0.0;
                    System.out.println("The total has been reset");
                    break;
                case 7:
                    exit = true;
                    System.out.println("\nThank You!");
                    break;
            
                default:
                    System.out.println("\nThe choice does not match the menu");
                    break;
            }
        }
        input.close();
    }
}