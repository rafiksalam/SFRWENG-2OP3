/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program to find the value of following expression.
    a) (101 + 0) / 3
    b) 3.0e-6 * 10000000.1
    c) true && true
    d) false && true
    e) (false && false) || (true && true)
    f) (false || false) && (true && true)

 * INPUT: n/a
 * OUTPUT: the value of each of the above expressions.

 */


public class Q1_ExpressionSolution {
    public static void main(String[] args) {

        double result = (101+0) / 3;
        double result1 = 3.0e-6 * 10000000.1;
        boolean first = true && true;
        boolean second = false && true;
        boolean third = (false && false) || (true && true);
        boolean fourth = (false || false) && (true && true);

        System.out.println("The value of (101 + 0) /3 is: " + result);
        System.out.println("The value of 3.0e-6 * 10000000.1 is: " + result1);
        System.out.println("The value of true && true is: " +first);
        System.out.println("The value of false && true is: " +second);
        System.out.println("The value of (false && false) || (true && true) is: " +third);
        System.out.println("The value of (false || false) && (true && true) is: " +fourth);
    }
}
