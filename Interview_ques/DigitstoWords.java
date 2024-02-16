package Interview_ques;				//SC=O(1)		TC=O(n)

import java.util.Scanner;

public class DigitstoWords {

    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};

    private static String wordsHelper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 10) {
            return ones[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + (num % 10 > 0 ? " " + ones[num % 10] : "");
        } else {
            return ones[num / 100] + " Hundred" + (num % 100 > 0 ? " and " + wordsHelper(num % 100) : "");
        }
    }

    private static String numberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        String words = "";
        int i = 0;
        while (number > 0) {
            if (number % 1000 != 0) {
                words = wordsHelper(number % 1000) + " " + thousands[i] + " " + words;
            }
            number /= 1000;
            i++;
        }

        return words.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String words = numberToWords(num);
        System.out.println("Number in words: " + words);
    }
}

