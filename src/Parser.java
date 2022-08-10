public class Parser {
    static Number parseNumber(String number) throws Exception {         //Метод считывает строку, появившуюся при разделении изначального ввода пользователя.
        int value;
        boolean isArabic;

        try {
            value = Integer.parseInt(number);     //Здесь, если спарсится, то в строке содержится число, значит присваиваем объекту значение "арабское".
            isArabic = true;
        } catch (NumberFormatException e) {       //Если не спарсилась строка, значит там римское число, присваиваем объекту значение "римское".
            value = Converter.romanToArabic(number);
            isArabic = false;
        }

        if (value > 10 || value <= 0) {           //Ну тут и так все понятно из текста исключения, проверка на попадание введенного пользователем числав диапазон из задания
            throw new Exception("Неподходящее значение числа, используйте числа от 1 до 10 включительно");
        }
        return new Number(value, isArabic);       //Возвращаем объект с заполненными полями.
    }


}
