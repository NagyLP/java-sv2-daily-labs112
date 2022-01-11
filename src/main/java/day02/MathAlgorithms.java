package day02;


import java.util.Scanner;

public class MathAlgorithms {

    public int commonDivisor(int firstNumber, int secondNumber) {
        while (firstNumber == 0) {
            firstNumber = 0;
        }
        while (secondNumber > firstNumber) {
            int gcd = firstNumber % secondNumber;
        }
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        mathAlgorithms.commonDivisor(firstNumber, secondNumber);
    }
}
