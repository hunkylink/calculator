import java.util.HashMap;
import java.util.TreeMap;

public class Converter {

    static int romanToArabic(String number){
        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
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

    static String arabicToRoman(int number){
        TreeMap<Integer, String> romanNumbers = new TreeMap<>();
        romanNumbers.put(1, "I");
        romanNumbers.put(5, "V");
        romanNumbers.put(10, "X");
        romanNumbers.put(50, "L");
        romanNumbers.put(100, "C");

        int i = romanNumbers.floorKey(number);

        if (number == i) {
            return romanNumbers.get(number);
        }
        return romanNumbers.get(i) + arabicToRoman(number - i);
    }

}
