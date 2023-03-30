/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
    Write a Java program that accepts an integer (n, 0 <= n <= 9) and computes the value of n+nn+nnn.

 * INPUT: a user input integer n
 * OUTPUT: the value of n+nn+nnn.

* Hint: For n=2, the output is 2+22+222=246
 */

import java.util.Scanner;

public class Q3_PlayWithInteger {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Please input a number from 0 to 9:");
        int n = input.nextInt();

        if (9>= n & n>=0) {

            int n1= n;
            int n2 = n*11;
            int n3 = n*111;
            int sum = n1 + n2 + n3;
           System.out.println("The output is:" + sum);

            }
        else {
            System.out.println("The input is out of range!");
        }
        }
    }

