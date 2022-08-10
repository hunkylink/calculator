public class Math {
    static String calculate(Number a, Number b, String symbol) throws Exception{   //Метод проверяет какой символ стоит между двумя числами и выполняет операцию
        int result;                                                                //с полями объектов(чисел).


        switch(symbol){
            case "+":
                result = a.value + b.value;
                break;
            case "-":   //Тут также будет проверка на 0 и отрицательные числа в случае если числа римские.
                if (!a.isArabic && (a.value - b.value) < 1) throw new Exception("В римской системе не может быть отрицательного числа и нуля..");
                result = a.value - b.value;
                break;
            case "*":
                result = a.value * b.value;
                break;
            case "/":
                result = a.value / b.value;
                break;
            default:   //Если символ операции отличается от четырех указанных в задании.
                throw new Exception("Не знаю такой опреации. Используйте только символы +, -, *, /.");
        }

        if (a.isArabic){    //если изначальное число арабское, то печатаем как есть.
            return String.valueOf(result);
        } else {            //если изначальное число римское - конвертируем и выводим.
            return Converter.arabicToRoman(result);
        }


    }

}
