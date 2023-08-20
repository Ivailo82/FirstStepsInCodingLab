package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double numberInCentimeter = number * 2.54;
        System.out.println(numberInCentimeter);
    }
}
