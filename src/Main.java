import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Zа-яА-Я ]", "");
        cleaned = cleaned.replaceAll("\\s+", " ");
        cleaned = cleaned.trim();
        System.out.println("Результат:");
        System.out.println(cleaned);
    }
}