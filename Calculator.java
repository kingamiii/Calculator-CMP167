import java.util.Scanner;

public class Calculator {

    // to get user inputs
    static Scanner scanner = new Scanner(System.in);

    // driver of the program
    public static void main(String[] args) {

        // runs until user breaks
        while(true){

            // get the calculator mode
            System.out.println("Enter the calculator mode: Standard/Scientific?");
            String userInput = scanner.nextLine();

            // check for the correct mode
            if(!userInput.equals("Standard") && !userInput.equals("Scientific")){

                // if either not scientific or standard
                // print the error messages
                System.out.println("Sorry Invalid input, Please try again!");
                System.out.println("Enter either Standard or Scientific");

                // continue to the next iteration
                continue;
            }

            // if the mode is standard
            if(userInput.equals("Standard")){

                // runs until user successfully completes a calculation
                while (true){

                    // prompt this to the user
                    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");

                    // get the user input
                    userInput = scanner.nextLine();

                    // check for additon
                    if(userInput.equals("+")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to add?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do addition
                        float result = doAddition(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for subtraction
                    } else if(userInput.equals("-")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to subtract?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do subtraction
                        float result = doSubstraction(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for multiplication
                    } else if(userInput.equals("*")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to multiply?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do multiplication
                        float result = doMultiply(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for division
                    } else if(userInput.equals("/")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to divide?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do division
                        float result = doDivide(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                    }else {

                        //print the error message
                        System.out.println("Invalid operator "+userInput);
                        continue;

                    }
                }
            }

            // check for scientific mode
            else if(userInput.equals("Scientific")){

                // runs until user do a successful calculation
                while (true){

                    // prompt this to the user
                    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");

                    // get the user input
                    userInput = scanner.nextLine();

                    // check for additon
                    if(userInput.equals("+")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to add?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do addition
                        float result = doAddition(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for subtraction
                    } else if(userInput.equals("-")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to subtract?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do subtraction
                        float result = doSubstraction(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for multiplication
                    } else if(userInput.equals("*")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to multiply?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do multiplication
                        float result = doMultiply(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for division
                    } else if(userInput.equals("/")){

                        // now get the number of operands
                        int numberOfOperands = 0;

                        // prompt this to the user
                        System.out.println("How many numbers do you want to division?:");

                        // read the number of operands
                        numberOfOperands = scanner.nextInt();

                        // do division
                        float result = doDivide(numberOfOperands);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for sine value
                    }else if(userInput.equals("sin")){

                        // prompt this to the user
                        System.out.println("Enter the angle in sine:");

                        // read the number of operands
                        float angleInRadians = scanner.nextFloat();

                        // do division
                        float result = doSin(angleInRadians);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for cos
                    }else if(userInput.equals("cos")){

                        // prompt this to the user
                        System.out.println("Enter the angle in cosine:");

                        // read the number of operands
                        float angleInRadians = scanner.nextFloat();

                        // do division
                        float result = doCos(angleInRadians);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // check for tan
                    }else if(userInput.equals("tan")){

                        // prompt this to the user
                        System.out.println("Enter the angle in tan:");

                        // read the number of operands
                        float angleInRadians = scanner.nextFloat();

                        // do division
                        float result = doTan(angleInRadians);

                        // print the output
                        System.out.println("Result: "+result);

                        // break the inner loop
                        break;

                        // print the error for an invalid operator
                    }else {
                        //print the error message
                        System.out.println("Invalid operator "+userInput);
                        continue;
                    }
                }
            }

            // absorb the next line
            scanner.nextLine();

            // prompt the user for continuation
            System.out.println("Do you want to start over? (Y/N)");
            userInput = scanner.nextLine();

            // check for the continuation
            if(userInput.equals("Y")){
                continue;
            }else{
                System.out.println("Goodbye");
                break;
            }

        }
    }

    // for calculation of addition operation
    static public float doAddition(int numberOfOperands){

        // collect the total
        float total = 0.0F;

        // enter the number of operands
        System.out.printf("Enter %d numbers:\n",numberOfOperands);

        // add all the numbers
        for(int i=0;i<numberOfOperands;i++){
            int number = scanner.nextInt();
            total += number;
        }

        // return the total
        return total;
    }

    // for calculation of the substraction
    static public float doSubstraction(int numberOfOperands){

        // collect the substraction
        float total = 0.0F;

        // enter the number of operands
        System.out.printf("Enter %d numbers:\n",numberOfOperands);

        //substraction
        for(int i=0;i<numberOfOperands;i++){
            int number = scanner.nextInt();

            if(i==0){
                total = number;
            }else{
                total -= number;
            }
        }

        // return the total
        return total;
    }

    // for calculation of the multiplicaion
    static public float doMultiply(int numberOfOperands){

        // accumulate to this number
        float mul = 1;

        // enter the number of operands
        System.out.printf("Enter %d numbers:\n",numberOfOperands);

        // multiply
        for(int i=0;i<numberOfOperands;i++){
            int number = scanner.nextInt();
            mul *= number;
        }

        // return the multiplication
        return mul;
    }

    // for calculate the division
    static public float doDivide(int numberOfOperands){

        // division result
        float division = 1;

        // get inputs
        System.out.printf("Enter %d numbers:\n",numberOfOperands);

        // do the division
        for(int i=0;i<numberOfOperands;i++){
            int number = scanner.nextInt();
            if(i==0){
                division = number;
            }else{
                division /= number;
            }
        }

        // return the result
        return division;
    }

    // calculate the since value
    static public float doSin(float radianAngle){

        return (float) Math.sin(radianAngle);

    }

    // calculate the cosine value
    static public float doCos(float radianAngle){

        return (float) Math.cos(radianAngle);

    }

    // calculate the tan value
    static public float doTan(float radianAngle){

        return (float) Math.tan(radianAngle);

    }

}
