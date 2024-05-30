import java.util.Scanner;

public class Strings {
    public static Scanner sc = new Scanner(System.in);

    public static void t1() {
        /*
        Представьте, что вы работаете в небольшой компании.
        Данные сотрудников хранятся в неструктурированном формате.
        Бухгалтерия попросила написать программу,
        в которой  можно работать с Ф. И. О. сотрудников.

        Напишите четыре строки:

        С именем firstName — для хранения имени.
        С именем middleName — для хранения отчества.
        С именем lastName — для хранения фамилии.
        С именем fullName — для хранения Ф. И. О.
        сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: «ФИО сотрудника — …».

        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".

        Критерии оценки
        Инициализировали строки верно.
        Сложение строк провели корректно.
        При изменении данных в строках результат программы выводится корректно.
        Все условия задания выполнили.
         */

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        StringBuilder fullName = new StringBuilder();

        System.out.println(fullName.append(lastName).append(" ").append(firstName).append(" ").append(middleName));
    }

    public static void t2() {
        /*
        Для ежемесячного отчета и ведения документации бухгалтерии
        нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).

        Напишите программу, которая изменит написание Ф. И. О. сотрудника
        с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.

        В качестве строки с исходными данными используйте строку fullName.

        Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
         */


        /*String fulName = "Ivanov Ivan Ivanovich";
        System.out.println(fulName.toUpperCase());*/

        StringBuilder fullName = new StringBuilder("Ivanov Ivan Ivanovich");
        System.out.println(fullName.toString().toUpperCase());
    }

    public static void t3() {
        /*
        Система, в которой мы работаем, не принимает символ «ё».
        Напишите программу, которая заменяет символ «ё» на символ «е».

        В качестве исходных данных используйте строку
        fullName и данные в ней — "Иванов Семён Семёнович".

        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».

        Критерии оценки
        Применили метод, меняющий написание данных строки.
        При изменении содержания строки результат программы выполняется.
        Результат программы вывели в консоль согласно условиям задачи.
         */

        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е"));
    }

    // Сложные задачи
    public static void t4() {
        /*Напишите программу, которая возвращает в качестве результата строку,
        в которой каждый символ удвоен.

        Например:
        doubleChar("The") → "TThhee"
         */
        StringBuilder str;
        StringBuilder res;
        str = new StringBuilder("пыщь-пыщь, ололо");
        res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            res.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.printf("%s%n%s%n", str, res);
    }

    public static void t5() {
        /*
        Напишите программу, которая возвращает в качестве значения строку,
        в которой слово находится в середине исходной строки, например "<<слово>>".

        Примечание: используйте str.substring(i, j) для извлечения строки,
        начиная с индекса i и до индекса j, но не включая его.

        Например:
        makeOutWord("<<>>", "Yay") → "<<Yay>>"
        makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        makeOutWord("[[]]", "word") → "[[word]]"
         */
//        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку-обрамление:");
        String str1 = sc.nextLine();//"<-{@@@}->";
        System.out.println("Введите строку");
        String str2 = sc.nextLine();
        int mid = str1.length() / 2;
        if (str1.length() % 2 == 0) {
            System.out.println(str1.substring(0, mid) + str2 +
                    str1.substring(mid));
        } else {
//            throw new RuntimeException("В строке-обрамлении нечетное количество символов");
            System.out.println("В строке-обрамлении нечетное количество символов.\n" +
                    "Предположим, что в середине строки три одинаковых символа и пропустим средний из них");
            System.out.println(str1.substring(0, mid) + str2 +
                    str1.substring(mid + 1));
        }


    }

    public static void t6() {
        /*
        Даны две строки, a и b. Напишите программу, которая возвращает новую строку,
        состоящую из первого символа a и последнего символа b. Если строка имеет длину 0,
        используйте '@' для ее отсутствующего символа.
        Например:
        lastChars("last", "chars") → "ls"
        lastChars("yo", "java") → "ya"
        lastChars("hi", "") → "h@"
         */
//        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String a = sc.nextLine();
        System.out.println("Введите вторую строку:");
        String b = sc.nextLine();
        System.out.printf("Результат:%n%s%s", (a.length() > 0) ? a.charAt(0) : '@',
                ((b.length() > 0) ? b.charAt(b.length() - 1) : '@'));

    }

    public static void t7() {
        /*
        Напишите программу, которая возвращает в качестве значения новую строку,
        в которой 2 последних символа заменены местами.

        lastTwo("coding") → "codign"
        lastTwo("cat") → "cta"
        lastTwo("ab") → "ba"
         */
        boolean checkInput = true;
        System.out.println("Введи строку:");
        while (checkInput) {
            StringBuilder str = new StringBuilder(sc.nextLine());

            if (str.length() > 1) {
                checkInput = false;
                StringBuilder reverseLastTwoSymbols = new StringBuilder(str.substring(str.length() - 2, str.length()));
                reverseLastTwoSymbols.reverse();
                System.out.println("Результат:");
                System.out.println(str.delete(str.length() - 2, str.length()).append(reverseLastTwoSymbols));
            } else {
                System.out.println("Введите строку из не менее чем 2 символов:");
            }
        }
//        StringBuilder buff = str.delete(l - 2,l).
//                append(str.charAt(l-1)).append(str.charAt(l-2));

    }

    public static void t8() {
        /*
        Даны две строки любой длины. Напишите программу,
        которая в качестве результата возвращает третью строку,
        в которой две исходные соединены.
        При этом если строки имеют разную длину, то символы из более длинной
        строки опускаются и используются только последние символы.

        Например, «Hello» и «Hi» дают «loHi».
        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"
         */
        System.out.println("Введите \"хуй\"");
        String str1 = sc.nextLine();// "Хуй";
        System.out.println("Введите \"hello\"");
        String str2 = sc.nextLine();// "Hello";
        System.out.print("Поздравляю, вы - ");
        if (str1.length() > str2.length()) {
            System.out.println(str1.substring(str1.length() - str2.length()) + str2);
        } else {
            System.out.println(str1 + str2.substring(str2.length() - str1.length()));
        }
    }

    public static void t9() {
        /*
        Напишите программу, которая выводит в консоль, сколько раз слово ”hi” встречается в строке.
        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2
         */

//        String str = "hihohi";
        String s = sc.nextLine();
        String[] his = s.split("hi");
        System.out.printf("countHi(\"%s\") → %d", s, his.length);
    }
}
