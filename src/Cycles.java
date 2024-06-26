public class Cycles {

    public static void t1() {

            /*
    С помощью цикла for выведите в консоль все числа от 1 до 10.
Критерии оценки
 Использовали цикл for.
 Все значения от 1 до 10 вывели в консоль.
 Переменная в цикле носит простое значение,
 например буквенное i.
     */

        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }
    }

    public static void t2() {
        /*
        С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        for (int k = 10; k >= 1; k--) {
            System.out.println(k);
        }
    }

    public static void t3() {
        /*
        Выведите в консоль все четные числа от 0 до 17.

        Подсказка
Четными числами считаются числа, которые делятся на 2 без остатка.
В нашем случае к нулю нужно прибавлять 2, тогда все числа будут четными.

         */
        for (int k = 0; k <= 17; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }

        // после прочтения подсказки
        for (int h = 0; h <= 17; h += 2) {
            System.out.println(h);
        }
    }

    public static void t4() {
        /*
        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
         */
        for (int o = 10; o >= -10; o--) {
            System.out.println(o);
        }
    }

    public static void t5() {
        /*
        Напишите программу, которая выводит в консоль все високосные года,
        начиная с 1904 года до 2096. В консоль результат должен выводиться в формате:
        «… год является високосным».
         */
        for (int y = 1904; y <= 2096; y += 4) {
            System.out.println(y + " год является високосным");
        }
    }

    public static void t6() {
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */
        for (int t = 7; t <= 98; t += 7) {
            System.out.println(t);
        }
    }

    public static void t7() {
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512
         */
        for (int u = 1; u <= 512; u *= 2) {
            System.out.println(u);
        }
    }

    public static void t8() {
        /*
        Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей «в банку».

Выведите сумму накоплений за каждый месяц в консоль в формате:
 «Месяц …, сумма накоплений равна … рублей».
         */
        int total = 0;
        int vklad = 29000;
        for (int r = 1; r <= 12; r++) {
            total += vklad;
            System.out.println(String.format("Месяц %d, сумма накоплений равна %d рублей", r, total));
        }
    }

    public static void t9() {
        /*
        Перепишите решение задачи выше при условии, что деньги
        вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
         */
        int total = 0;
        int vklad = 29000;
        for (int r = 1; r <= 12; r++) {
            total += vklad + total / 100;
            System.out.println(String.format("Месяц %d, сумма накоплений равна %d рублей", r, total));
        }
    }

    public static void t10() {
        /*
        Напишите программу, которая выводит в консоль таблицу умножения на 2:
        2*1=2
        2*2=4
        2*3=6
        2*4=8
        2*5=10
        2*6=12
        2*7=14
        2*8=16
        2*9=18
        2*10=20
         */
        for (int m = 1; m <= 10; m++) {
            System.out.println(String.format("2*%d=%d", m, m * 2));
        }
    }

    public static void t11() {
        /*
        Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.

С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.

Результат программы должен быть выведен в консоль с тем количеством месяцев,
которое необходимо для накопления данной суммы. Формат сообщения:
«Месяц …, сумма накоплений равна … рублей» .

Критерии проверки
 Применили цикл while для решения задания.
 В консоль вывели по порядку суммы накоплений за каждый месяц
 Инициализировали переменную для обозначения вклада.
 Инициализировали переменную для суммы накоплений.
         */
        int total = 0;
        int salary = 15000;
        int month = 1;
        while (total < 2459000) {
            total += salary;
            System.out.println(String.format("Месяц %d, сумма накоплений равна %d", month, total));
            month++;
        }
    }

    public static void t12() {
        /*
        Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
Не забудьте выполнить переход на новую строку между двумя циклами.
В результате программы вывод должен получиться следующий:

1 2 3 4 5 6 7 8 9 10

10 9 8 7 6 5 4 3 2 1
         */
        int num = 1;
        String out = "";
        while (num <= 10) {
            out += num + " ";
            num++;
        }
        num = 10;
        out += "\n";
        for (; num > 0; num--) {
            out += num + " ";
        }
        System.out.println(out);
    }

    public static void t13() {
        /*
        В стране Y население равно 12 миллионов человек.

Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
Рассчитайте, какая численность населения будет через 10 лет,
если показатели рождаемости и смертности постоянны.
В консоль выведите результат операции на каждый год в формате:
«Год …, численность населения составляет …».
Критерии проверки
 Для решения задачи использовали конструкцию цикла.
 В консоль вывели результат операции на каждый год в формате: «Год …, численность населения составляет …».
 Инициализировали переменные, которые содержат в себе данные о рождаемости, общей численности и смертности.
 Названия переменных подчиняются правилу camelCase.
         */
        int population = 12_000_000;
        int year = 1;
        int birthRate = 0;
        int deathRate = 0;
        while (year <= 10) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * (-8);
            population += birthRate + deathRate;
//            population += population / 1000 * 17 - population / 1000 * 8;
            System.out.printf("Год %d, численность населения составляет %d\n", year, population);
            year++;
        }
    }

    public static void t14() {
        /*
        Василий решил положить деньги на накопительный счет,
        где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
        Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        чтобы собрать сумму в 12 миллионов рублей при условии,
        что процент банка от накоплений не меняется, а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.

        Критерии оценки
        Инициализировали переменную, хранящую в себе сумму накоплений.
        Использовали цикл для подсчета количества месяцев.
        В консоль вывели результат количества месяцев и промежуточных сумм накоплений.
         */
        int total = 15_000;
        int month = 1;
        while (total <= 12_000_000) {
            total += total / 100 * 7;
            System.out.printf("Месяц %d, сумма накоплений %d рублей\n", month, total);
            month++;
        }
    }

    public static void t15() {
        /*
        Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
         а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.

         Критерии оценки
         Инициализировали переменную, хранящую в себе сумму накоплений.
         Использовали цикл для подсчета количества месяцев.
         В консоль вывели результат количества месяцев и промежуточных сумм накоплений каждого 6-го месяца.
         */
        int total = 15_000;
        int month = 1;
        while (total <= 12_000_000) {
            total += total / 100 * 7;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %d рублей\n", month, total);
            }
            month++;
        }
        System.out.printf("Месяц %d, сумма накоплений %d рублей\n", month, total);
    }

    public static void t16() {
        /*
        Василий решил, что будет копить деньги ближайшие 9 лет.
        Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.

        Критерии оценки
         Инициализировали переменную, хранящую в себе сумму накоплений.
          Использовали цикл для подсчета количества месяцев.
           В консоль вывели результат количества месяцев и промежуточных сумм накоплений каждого 6-го месяца.
         */
        int month = 1;
        int year = 1;
        int total = 15_000;
        int interestRate = 7;
        int depositTerm = 12 * 9;
        for (; month <= depositTerm; month++) {
            total += total / 100 * interestRate;
            if (month % 6 == 0) {
                System.out.printf("Год %d, месяц %d, сумма накоплений %d рублей\n", year, (month % 12 == 0) ? 12 : 6, total);
            }
            if (month % 12 == 0) {
                year++;
            }
        }

    }

    public static void t17() {
        /*
        В компании пятница — отчетный день.
        Нужно написать программу, которая считает дни месяца по датам,
        определяет, какой день пятница, и выводит сообщение с напоминанием,
        что нужно подготовить еженедельный отчет.

        Создайте переменную типа int, которая хранит в себе
        номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную)
        сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».

        В нашем месяце 31 день. В результате у вас должно получиться
        от 4 до 5 сообщений с напоминаниями по разным датам.

        Критерии оценки
         Инициализировали переменную, хранящую в себе дату.
          Создали цикл.
          Условия цикла записали корректно.
          Условия задачи соблюдаются и выполняются.
          Сообщение в консоль выводится корректно и учитывает все значения переменной.
         */
        int date = 1;
        int dayOfFriday = 3;
        while (date <= 31) {
            if (date == dayOfFriday) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", date);
                dayOfFriday += 7;
            }
            date++;
        }

    }

    public static void t18() {
        /*
        Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        а также следующий год ее появления (ближайшие 100 лет).

        Для вычисления периода можно создать две дополнительные переменные,
        которые содержат год за 200 лет до текущего (из созданной ранее переменной)
        в качестве старта и 100 лет после в качестве завершения периода расчета.

        В результате решения задачи в консоли должен получиться следующий результат:

        1896
        1975
        2054

        Критерии оценки
         Соблюдаются все условия задачи.
         Операцию цикла написали без ошибок.
         Цикл выводит корректные значения.
         Значения переменным присвоили корректно.
         */
        int startPeriod = 1824;
        int endPeriod = 2124;
        int cometPeriod = 79;
        for (int year = 0; year <= endPeriod; year += cometPeriod) {
            if (year >= startPeriod & year <= endPeriod) {
                System.out.println(year);
            }
        }
    }

}
