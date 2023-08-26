package FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        //Цената на един кв. м. е 7.61 лв със ДДС
        //18% отстъпка от крайната цена
        double priceAreaNoDiscount = area * 7.61;
        double discount = priceAreaNoDiscount - (priceAreaNoDiscount * 0.82);
        double finalPrice = priceAreaNoDiscount * 0.82;
        System.out.printf("The final price is: %.2f lv.%n",finalPrice);
        System.out.printf("The discount is: %.2f lv.%n",discount);
    }
}
