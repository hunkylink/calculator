import java.util.HashMap;
import java.util.TreeMap;

public class Converter {

    static int romanToArabic(String number){                              //Конвертируем из римского в арабское по принципу сравнения двух соседних символов.
        HashMap<Character, Integer> romanNumbers = new HashMap<>();       //Если меньшее число стоит справа от большего, они складываются.
        romanNumbers.put('I', 1);                                         //Если меньшее стоит слева от большего, оно вычитается из большего. (Спасибо википедия, долго голову ломал)
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        int b = 0, result = 0;

        for (int i = number.length(); i > 0; i--) {
            int a = romanNumbers.get(number.charAt(i - 1));
            if (a >= b) {
                result += a;
            } else {
                result -= a;
            }
            b = a;
        }
        return result;
    }

    static String arabicToRoman(int number){                               //Метод с рекурсией честно подглядел в интернете.
        TreeMap<Integer, String> romanNumbers = new TreeMap<>();           //Находим ближайший ключ меньше заданного числа,
        romanNumbers.put(1, "I");                                          //потом добавляем к нему справа следующее, с учетом вычета предыдущего ключа.
        romanNumbers.put(4, "IV");                                         //Пока расписывал комментарии, нашел ошибку, некорректно обрабатывались числа 4, 9 и тд.
        romanNumbers.put(5, "V");                                          //Исправлено.
        romanNumbers.put(9, "IX");
        romanNumbers.put(10, "X");
        romanNumbers.put(40, "XL");
        romanNumbers.put(50, "L");
        romanNumbers.put(90, "XC");
        romanNumbers.put(100, "C");

        int i = romanNumbers.floorKey(number);

        if (number == i) {
            return romanNumbers.get(number);
        }
        return romanNumbers.get(i) + arabicToRoman(number - i);
    }

}
