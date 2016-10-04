package com.courses.spalah;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWorkStrings {
    /**
     * Метод должен вернуть количество четных чисел в строке.
     * <p>Например:
     * дана строка - 1_4_8_11_22, ответ - 3
     *
     * @param s строка типа число1_число2_число3_число4
     * @return количество четных числе в строке
     */
    public static int countEvenInString(String s) {

        String[] ArrayOfNumbers = s.split("_");
        int count = 0;
        for (String num : ArrayOfNumbers) {
            if (Integer.parseInt(num) % 2 == 0) count++;
        }
        return count;
    }

    /**
     * Метод должен удалить указанный символ из строки (кроме случая, если
     * символ находится на первой, последней или срединной позиции)
     * <p>Например:
     * данна строка - xabxxxx, символ - x, ответ - xabx
     *
     * @param symbol символ который необходимо удалить
     * @param s      исходная строка
     * @return результирующая строка
     */
    public static String removeSymbolFromString(String symbol, String s) {

        String[] arrayOfStrings = s.split("");
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            //adding strings in the firs and the last position in any case and middle if we have
            if (i == 0 || i == s.length() - 1 || i == indexOfCenterPosition(s)) {
                newString.append(arrayOfStrings[i]);
                continue;
            } else if (!symbol.equals(arrayOfStrings[i])) {
                newString.append(arrayOfStrings[i]);
            }

        }
        return newString.toString();
    }

    private static int indexOfCenterPosition(String s) {

        if (s.length() % 2 != 0) return (s.length() - 1) / 2;
        else return 0;
    }
}
