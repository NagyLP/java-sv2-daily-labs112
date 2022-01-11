package day02;


public class MathAlgorithms {

    public int commonDivisor(int firstNumber, int secondNumber) {
        try {
                if (firstNumber % secondNumber == 0) {
                    return secondNumber;
                } else {
                    return commonDivisor(secondNumber, firstNumber % secondNumber);
                }
        } catch (ArithmeticException ae) {
            throw new ArithmeticException("Divisor is 0");
        }
    }

//    public int greatestCommonDivisor(int firstNumber, int secondNumber) {
//
//    }

//    public static void main(String[] args) {
//        MathAlgorithms mathAlgorithms = new MathAlgorithms();
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        int secondNumber = scanner.nextInt();
//        mathAlgorithms.commonDivisor(firstNumber, secondNumber);
//    }
}
