public class Parser {
    static Number parseNumber(String number) throws Exception {
        int value;
        boolean isArabic;

        try {
            value = Integer.parseInt(number);
            isArabic = true;
        } catch (NumberFormatException e) {
            value = Converter.romanToArabic(number);
            isArabic = false;
        }

        if (value > 10 || value <= 0) {
            throw new Exception("Неподходящее значение числа, используйте числа от 1 до 10 включительно");
        }
        return new Number(value, isArabic);
    }


}
