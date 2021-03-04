import java.util.Scanner;

public class Calculations {

    private final static double MIN = -0.5;
    private final static double MAX = 9.49999;
    protected int[] array = new int[4];
    int temp;
    private final String[] endText = {"1st", "2nd", "3rd", "4th"};

    Scanner input = new Scanner(System.in);

    public int[] getArray() {
        return array;
    }

    public int zeroToTen() {
        return (int) Math.round(Math.random() * (MAX - MIN) + MIN);
    }

    public boolean numberCheck(int number, int currentNumber) {
        boolean flag = true;
        if (number > 9 || number < 0)
            flag = false;
        for (int i = 0; i < currentNumber; i++) {
            if (number == array[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public void fourDigitManual() {

        System.out.println("You need to enter 4 1-digit numbers.");
        System.out.println("Please, enter INT NUMBERS. Exception not implemented yet.");
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.printf("Enter %s number: ", endText[i]);
                temp = input.nextInt();
                if (numberCheck(temp, i)) {
                    array[i] = temp;
                    break;
                }
                else System.out.println("Enter a number from 0 to 9, not repeated");
            };
        }
    }
}
