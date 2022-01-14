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
            throw new ArithmeticException(String.format("-= Divisor is 0 =- %n Error data: %d%n", +secondNumber));
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
//        System.out.println(mathAlgorithms.commonDivisor(firstNumber, secondNumber));
//    }
}
