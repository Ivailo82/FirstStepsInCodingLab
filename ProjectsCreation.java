package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int projectCount = Integer.parseInt(scanner.nextLine());
        int oneProjectTime = 3;
        int totalProjectsTime = projectCount * oneProjectTime;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",architectName,totalProjectsTime,projectCount);
    }
}
