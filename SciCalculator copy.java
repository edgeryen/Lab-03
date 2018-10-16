import java.util.Scanner; // I added a comment!
import java.lang.Math; // I added another comment, wow!

public class SciCalculator {
   public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int menuSelect; // Number of menu selection.
        int numCalc = 0; // Total number of calculations made.
        double sumCalc = 0.0; // The sum of all calculation results.
        double avgCalc; // The average result for all calculations.
        double numResult = 0.0; // The current result of each calculation.
        double firstOperand; // First operand.
        double secondOperand; // Second operand.

        while (true) {
                System.out.println("Current Result: " + numResult + "\n");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average\n");
                System.out.print("Enter Menu Selection: ");
                menuSelect = scnr.nextInt();

                while (menuSelect < 0 || menuSelect >= 7)
                { // Option 7 & invalid options are in a loop in case user decides to repeatedly use them.
                    if (menuSelect < 0 || menuSelect > 7) {
                        System.out.println("\nError: Invalid selection!\n");

                    }
                    if (menuSelect == 7) {
                        if (numCalc == 0) {
                            System.out.println("\nError: No calculations yet to average!\n");

                        }
                        else if (numCalc > 0) {
                            System.out.println("\nSum of calculations: " + sumCalc);
                            System.out.println("Number of calculations: " + numCalc);
                            avgCalc = sumCalc / (double) numCalc; // numCalc temporarily becomes double in this operation
                            avgCalc *= 100;
                            avgCalc = Math.round(avgCalc);
                            avgCalc /= 100; //avgCalc is rounded & has a max of two decimal places
                            System.out.println("Average of calculations: " + avgCalc + "\n");

                        }
                    }
                    System.out.print("Enter Menu Selection: "); // Only this text shows, and not the entire menu.
                    menuSelect = scnr.nextInt();
                }
                if (menuSelect == 0) {
                        System.out.println("\nThanks for using this calculator. Goodbye!");
                        break; // Breaks out of the loop and exits program.

                }
                System.out.print("Enter first operand: ");
                firstOperand = scnr.nextDouble();
                System.out.print("Enter second operand: ");
                secondOperand = scnr.nextDouble();
                System.out.println();
                    switch (menuSelect) {
                        case 1:
                            numResult = firstOperand + secondOperand;
                            break;

                        case 2:
                            numResult = firstOperand - secondOperand;
                            break;

                        case 3:
                            numResult = firstOperand * secondOperand;
                            break;

                        case 4:
                            numResult = firstOperand / secondOperand;
                            break;

                        case 5:
                            numResult = Math.pow(firstOperand, secondOperand);
                            break;

                        case 6:
                            numResult = Math.log(secondOperand) / Math.log(firstOperand);
                            break;
                    }


        sumCalc = sumCalc + numResult; // Keeps track of the sum of all calculations.
        numCalc = numCalc + 1; // Adds to the number of calculations for each completed loop.

        }
   }

}

