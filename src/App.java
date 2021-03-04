import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int value;
        int[] array = new int[10];
        int[] numberLine = new int[4];
        Calculations number = new Calculations();
        number.fourDigitManual();
        numberLine = number.getArray();
        System.out.printf("Your number is: ");
        for (int i: numberLine) {
            System.out.printf("%1d", i);
        }

        /*for (int i = 0; i < 1000000; i++ ) {
            value = number.zeroToTen();
            array[value] = array[value] + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Amount of number " + i + " is: " + array[i]);
        }*/
    }

}
