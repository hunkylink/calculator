import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String input = scanner.nextLine();

        String[] strings = input.split(" "); // В задании примеры выражений написаны через пробел, значит и тут делить строку ввода будем по пробелу.
        short a = Short.parseShort(strings[0]); // Так как калькулятор не должен работать с числами больше 10,
        short b = Short.parseShort(strings[2]); // то все поместится в short.
        scanner.close();

        if (a >= 0 && a <= 10 && b >= 0 && b <= 10){
            switch (strings[1]) {
                case "+" -> System.out.println(a + b);
                case "-" -> System.out.println(a - b);
                case "*" -> System.out.println(a * b);
                case "/" -> System.out.println(a / b);
                default -> System.out.println("Извините, такого арифметического действия я пока не знаю.");
            }
        } else {
            System.out.println("Числа должны быть в диапазоне от 0 до 10.");
        }
    }
}
