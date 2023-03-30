/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.Scanner;
interface Func {
    void calculate();
}

public class Q2_LambdaExpression {
    public static void subroutine(double x, double y) {
        Func f = () -> {
            double result = Math.sqrt((x * x) - (y * y));
            try{
                if (((x*x) - (y*y))>0){
                    System.out.printf("The value of sqrt(x*x-y*y) is:\n%.4f", result);
                }else {
                    throw new Exception();

                }
            }catch (Exception e){
                System.out.println("Cannot take the square root of a negative number!");

            }
        };
        f.calculate();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a real number, x: ");
        double x = input.nextDouble();
        System.out.println("Please enter a real number, y: ");
        double y = input.nextDouble();

        subroutine(x,y);
    }
}

