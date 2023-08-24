package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodCount = Integer.parseInt(scanner.nextLine());
        int catFoodCount = Integer.parseInt(scanner.nextLine());
        //опаковка храна за кучета е на цена 2.50 лв
        //опаковка храна за котки струва 4 лв.
        double totalPrice = (dogFoodCount * 2.50) + (catFoodCount * 4.00);
        System.out.printf("%.1f",totalPrice);

    }
}
