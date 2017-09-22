package softuni.homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddOrEvenPairs {
    public static void main(String[] args) {

        /*You are given an array of integers as a single line, separated by a space.
        Write a program that checks consecutive pairs and prints if both are odd/even or not.
        Note that the array length should also be an even number.*/

        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        gettingTheNumbersFromTheUser(numbers,input);
        shuttingIfTheSizeIsNotEven(numbers);
        pairsHandling(numbers);
    }

    private static void  shuttingIfTheSizeIsNotEven(List<Integer> numbers) {
        if(numbers.size() % 2 == 1){
            System.out.println("Invalid length");
            System.exit(0);
        }
    }

    private static void pairsHandling(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() ; i+=2) {
            boolean isThePairEven = false;
            boolean isThePairOdd = false;

            if(numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0){
                isThePairEven = true;
            } else if(numbers.get(i) % 2 == 1 && numbers.get(i + 1) % 2 == 1) {
                isThePairOdd = true;
            }
            printingPairsCompatability(isThePairEven, isThePairOdd, numbers.get(i), numbers.get(i + 1));
        }
    }

    private static void printingPairsCompatability(boolean isThePairEven, boolean isThePairOdd, Integer one, Integer two) {
        System.out.printf("%s, %s -> ", one, two);
        if(isThePairEven){
            System.out.println("both are even");
        } else if(isThePairOdd){
            System.out.println("both are odd");
        } else {
            System.out.println("different");
        }

    }

    private static void gettingTheNumbersFromTheUser(List<Integer> numbers, Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
    }
}

