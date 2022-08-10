public class Math {
    static String calculate(Number a, Number b, String symbol) throws Exception{
        int result;


        switch(symbol){
            case "+":
                result = a.value + b.value;
                break;
            case "-":
                if (!a.isArabic && (a.value - b.value) < 1) throw new Exception("В римской системе не может быть отрицательного числа и нуля..");
                result = a.value - b.value;
                break;
            case "*":
                result = a.value * b.value;
                break;
            case "/":
                result = a.value / b.value;
                break;
            default:
                throw new Exception("Не знаю такой опреации. Используйте только символы +, -, *, /.");
        }

        if (a.isArabic){
            return String.valueOf(result);
        } else {
            return Converter.arabicToRoman(result);
        }


    }

}
