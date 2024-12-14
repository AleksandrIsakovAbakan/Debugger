import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer[] ints = {1, 0, 5, 8, 9, 15, 26, 48, 96, 155, 999, -5, -55, -48};
        System.out.println(maximumEvenNumberInArray(ints));

        String string = "Привет, Александр, с праздником, с Новым Годом";
        System.out.println(programReversesCaseOfCharacters(string));
    }

    /*
    Дан массив целых чисел.
    Найти максимальное число из четных в этом массиве.
    */
    public static Integer maximumEvenNumberInArray(Integer[] integers) {

        Optional<Integer> max = Arrays.stream(integers)
                .filter(integer -> integer % 2 == 0)
                .max(Integer::compare);
        return max.orElse(0);
    }

    /*
    Дана строка "Привет, Александр, с праздником, с Новым Годом".
    Написать программу, которая поменяет регистр символов.
    Т.е. результат должен быть таким: пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ.
    */
    public static String programReversesCaseOfCharacters(String string) {

        StringBuilder builder = new StringBuilder();
        string.chars()
                .map(operand -> Character.isLowerCase(operand) ? Character.toUpperCase(operand)
                        : Character.toLowerCase(operand))
                .forEach(codePoint -> builder.append((char)codePoint));
        return builder.toString();
    }

}
