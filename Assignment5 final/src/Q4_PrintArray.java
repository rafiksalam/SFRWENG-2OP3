/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a java program to use Method Overloading for printing three types of array:
 * Integer[], Character[] and Double[].
 *
 * Input: None.
 * Output: print out different types of array.
 *
 * There is no specific format as long as printed arrays are neatly and cleanly.
 *
 */
public class Q4_PrintArray {
    // creating a method for printing integer array
    public static void printArr(Integer[] args){
        System.out.println("The Integer array is: ");

        for (Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // overloading the above created method with different parameter method
    // contains a character parameter
    public static void printArr(Character[] args){
        System.out.println("The Character array is: ");

        for (Character i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // overloading the above created method with different parameter method
    // contains a double parameter
    public static void printArr(Double[] args){
        System.out.println("The Double array is: ");

        for (Double i : args){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] iarr = {1,2,3,4,5};
        Character[] carr = {'A','B','C','D','E'};
        Double[] darr = {1.234, 2.345, 3.456, 4.567};

        // calling the methods and printing the arrays
        printArr(iarr);
        printArr(carr);
        printArr(darr);
    }
}
