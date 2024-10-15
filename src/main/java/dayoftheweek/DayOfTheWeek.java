package dayoftheweek;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int userInput = scanner.nextInt();

        System.out.println(dayOfTheWeek[userInput - 1]);
    }
}
