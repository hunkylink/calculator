import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //printMenu();
        int input = scanner.nextInt();
        System.out.println(Converter.arabicToRoman(input));

        /*while (true) {
            System.out.println("Введите выражение:");
            String input = scanner.nextLine();

            try{
                String[] strings = input.split(" "); // В задании примеры выражений написаны через пробел, значит и тут делить строку ввода будем по пробелу.
                if (strings.length != 3) throw new Exception("Ошибка! Должно быть два числа и знак операции между ними.");


            }
            catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }















        }*/

    }

    static void printMenu(){
        System.out.println("Привет! Этот калькулятор умеет складывать, вычитать, умножать и делить два числа");
        System.out.println("от 0 до 10 в римской и арабской системах счисления. Введи два числа одной системы,");
        System.out.println("знак арифметической операции между ними (+, -, *, /). Не забудь писать все через пробел!");

    }
}
