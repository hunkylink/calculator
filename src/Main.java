import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();


        while (true) {
            System.out.println("Введите выражение:");
            String input = scanner.nextLine();

            if(input.equals("0000")){
                break;
            }

            String[] strings;
            try {
                strings = input.split(" ");
                if (strings.length != 3) throw new Exception("Ошибка! Должно быть два числа и знак операции между ними.");
                Number a = Parser.parseNumber(strings[0]);
                Number b = Parser.parseNumber(strings[2]);
                if (a.isArabic != b.isArabic) throw new Exception("Ошибка! Числа должны быть одной системы счисления.");
                System.out.println("Ответ: " + Math.calculate(a, b, strings[1]));


            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }

        }

    }



    static void printMenu() {
        System.out.println("Привет! Этот калькулятор умеет складывать, вычитать, умножать и делить два числа");
        System.out.println("от 0 до 10 в римской и арабской системах счисления. Введи два числа одной системы,");
        System.out.println("знак арифметической операции между ними (+, -, *, /). Не забудь писать все через пробел!");
        System.out.println("Для выхода введите четыре нуля.");
    }
}
