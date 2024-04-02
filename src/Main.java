import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi qeyd edin:");
        scanner.nextLine();
        System.out.println("Topladiginiz bali qeyd edin:");
        int score = scanner.nextInt();

        while (score > 100 || score < 0) {
            System.out.println("Topladiginiz bali qeyd edin:");
            score = scanner.nextInt();
        }

        if (score >= 91) {
            System.out.println("Qiymet: A");
        } else if (score >= 81) {
            System.out.println("Qiymet: B");
        } else if (score >= 71) {
            System.out.println("Qiymet: C");
        } else if (score >= 61) {
            System.out.println("Qiymet: D");
        } else if (score >= 51) {
            System.out.println("Qiymet: E");
        } else {
            System.out.println("Qiymet: F");
        }
    }
}