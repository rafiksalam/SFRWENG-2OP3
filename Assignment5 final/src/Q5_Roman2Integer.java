/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */

import java.util.Scanner;
//public class Q5_Roman2Integer {
//    public static int romanInt(String roman, int integer, int length) {
//        roman = roman + " ";
//        for (int i = 0; i < length; i++) {
//
//            char ch = roman.charAt(i);
//            char next_ch = roman.charAt(i + 1);
//
//            if (ch == 'I') {
//                if (next_ch == 'X') {
//                    integer += 9;
//                    i++;
//                } else if (next_ch == 'V') {
//                    integer += 4;
//                    i++;
//                } else {
//                    integer += 1;
//                }
//            } else if (ch == 'V') {
//                integer += 5;
//            } else if (ch == 'X') {
//                if (next_ch == 'L') {
//                    integer += 40;
//                    i++;
//                } else if (next_ch == 'C') {
//                    integer += 90;
//                    i++;
//                } else {
//                    integer += 10;
//                }
//            } else if (ch == 'L') {
//                integer += 50;
//            } else if (ch == 'C') {
//                if (next_ch == 'D') {
//                    integer += 400;
//                    i++;
//                } else if (next_ch == 'M') {
//                    integer += 900;
//                    i++;
//                } else {
//                    integer += 100;
//                }
//            } else if (ch == 'D') {
//                integer += 500;
//            } else if (ch == 'M') {
//                integer += 1000;
//            }
//        }
//        return integer;
//    }
//
//    public static void main(String[] args){
//
//        Scanner input  = new Scanner(System.in);
//        System.out.println("Please enter your Roman Numeral: ");
//
//        String roman = input.next();
//        int integer = 0;
//        int length = roman.length();
//        int var= romanInt(roman,integer,length);
//
//        System.out.println("Your Roman Numeral is: \n" + roman);
//        System.out.println("Your Integer value is: \n" + var);
//
//    }
//}



class Converter{
    public static void main(String[] args){
for (int i=0; i<=10;i++){
if (i>6)break;}
        System.out.println(i);
    }

}