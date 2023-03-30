/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a Java program, use 'subroutine' to finds the minimum value of
 * the first N elements of an array of type int.
 * Meanwhile, your code can throw an IllegalException (custom run-time
 * exception, which can be one provided by Java) if N is not in the range
 * of the length of input array.
 *
 * Input: user input array and number N.
 * Output: the minimum value of the first N elements of the array.
 *
 * Note: The array and N are parameters to the subroutine.
 * Users will input an array with no specific length.
 *
 */

import java.util.Scanner;

public class Q1_FindMinimum {
    public static void minimumVal(int[] array, int N){

        int minVal = array[0];

        try {
            for (int i = 1; i < N; i++) {
                if (array[i] < minVal) {
                    minVal = array[i];
                }
            }
            System.out.println("\nThe minimum value of your range is:\n"+minVal);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nYou're evaluating further than your array's length!");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of your array:");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("Please enter how far into the array you would like to evaluate to get the minimum value.");
        int N = input.nextInt();
        System.out.println("Please enter the elements of your array:");

        for (int i=0; i<length; i++){
            array[i]=input.nextInt();
        }
        System.out.println("The elements of your array are:");
        for (int i=0; i<length; i++) {
            System.out.print(array[i] + " ");
        }
        minimumVal(array, N);
    }
}


