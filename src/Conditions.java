public class Conditions {
	public static void task1() {

    /*
    Задача 1
С помощью условного оператора напишите программу, которая выводит в консоль:

 сообщение о том, что человеку 18 или больше лет;
 сообщение, что возраст совершеннолетия еще не наступил и нужно немного подождать.
При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
 «Если возраст человека равен …, то (вывести в зависимости от результата)
  он совершеннолетний / он не достиг совершеннолетия, нужно немного подождать».

  Критерии оценки
 Инициализировали переменные.
 Имя переменных отражает данные, которые они содержат.
 Параметры условного оператора решают задание.
 Решение задачи выводится в консоль.
     */
		System.out.println("\nЗадачи по теме Условия" +
				"\nЗадача 1");
		int age = 17;

		if (age >= 18) {
			System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
		} else {
			System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
		}
	}

	public static void task2() {

    /*
    Задача 2
Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:

«На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
«Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
При выполнении каждого условия выведите в консоль: «На улице … градусов,
(вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».

Критерии оценки
 Инициализировали переменные.
 Имя переменных отражает данные, которые они содержат.
 Параметры условного оператора решают задание.
 Решение задачи выводится в консоль.
     */

		System.out.println("\nЗадача 2");
		int[] temps = {0, 10, 5};

		for (int temperature : temps) {
			if (temperature < 5) {
				System.out.println("На улице холодно, нужно надеть шапку");
			} else if (temperature > 5) {
				System.out.println("Сегодня тепло, можно идти без шапки");
			} else {
				System.out.println("Там 5 градусов, я хз, чо делать");
			}
		}
	}

	public static void task3() {
        /*
        Задача 3
За превышение скорости водителю могут выписать штраф. Напишите программу, которая сообщает водителю о том, что:

 скорость превышена, если она больше 60 км/ч;
 превышения скорости нет, если она меньше 60 км/ч.
При выполнении каждого условия программа должна выводить такое сообщение: «Если скорость …,
то (вывести в зависимости от результата) придется заплатить штраф / можно ездить спокойно».



Критерии оценки
 Инициализировали переменные.
 Имя переменных отражает данные, которые они содержат.
 Параметры условного оператора решают задание.
 Решение задачи выводится в консоль.
         */
		System.out.println("\nЗадача 3");
		int[] speedArr = {30, 60, 120};
		for (int speed :
				speedArr) {
			if (speed < 60) {
				System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
			} else if (speed > 60) {
				System.out.println("Если скорость " + speed + ", придется заплатить штраф");
			} else {
				System.out.println("Скорость ровно 60. Результат ХЗ, когда говно ТЗ.");
			}
		}
	}

	public static void task4() {
        /*
        Задача 4
Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека в зависимости от его возраста:

 Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
 Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
 Если человеку больше 18 лет, но меньше 24, то его место в университете.
 А если человеку больше 24, то ему пора ходить на работу.
При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
«Если возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)».



Критерии оценки
 Инициализировали переменные.
 Имена переменных отражают данные, которые содержат.
 Параметры условного оператора решают задание.
 Решение задачи выводится в консоль.
 Для решения использовали конструкцию else.
         */
		System.out.println("\nЗадача 4");
		int[] ages = {1, 2, 8, 19, 60};
		for (int age :
				ages) {
			if (age >= 2 & age < 7) {
				System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
			} else if (age >= 7 & age < 19) {
				System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
			} else if (age >= 19 & age < 25) {
				System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
			} else if (age >= 25) {
				System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
			} else {
				System.out.println("Ему всего год, какой ходить");
			}
		}

	}

	public static void task5() {
        /*
        Задача 5
Как правило, на аттракционах действуют ограничения для детей по возрасту:

 Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
 Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
 Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
Напишите программу, которая выводит в консоль сообщение в формате:
«Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе,
можно кататься на аттракционе в сопровождении / без сопровождения взрослого)».



Критерии оценки
 Инициализировали переменные.
 Имена переменных отражают данные, которые содержат.
 Параметры условного оператора решают задание.
 Решение задачи выводится в консоль.
 Для решения использовали конструкцию else.
         */
		System.out.println("\nЗадача 5");
		int[] ages = {3, 6, 15};
		for (int age :
				ages) {
			if (age < 5) {
				System.out.println("Если возраст ребенка равен " + age
						+ ", то ему нельзя кататься на аттракционе");
			} else if (age < 14) {
				System.out.println("Если возраст ребенка равен " + age
						+ ", то ему можно кататься на аттракционе в сопровождении взрослого");
			} else {
				System.out.println("Если возраст ребенка равен " + age
						+ ", то ему можно кататься на аттракционе без сопровождения взрослого");
			}
		}
	}

	public static void task6() {

        /*
        Задача 6
Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.

С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль сообщение о том,
есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.



Критерии оценки
 Инициализировали переменные.
 Имена переменных отражают данные, которые содержат.
 Параметры условного оператора решают задание.
 Решение задачи выводится в консоль.
 Для решения использовали конструкцию else.
         */
		System.out.println("\nЗадача 6");
		int[] tickets = {0, 10, 63, 32, 82, 102,};
		int seat = 60;
		int stay = 42;
		for (int ticket :
				tickets) {
			if (ticket < 60) {
				System.out.println("При занятых " + ticket + ", свободных мест:\nсидячих - " + (seat - ticket) + "\nстоячих - " + stay);
			} else if (ticket < 102) {
				System.out.println("При занятых " + ticket + ", свободных мест:\nсидячих - 0\nстоячих - " + (stay + seat - ticket));
			} else {
				System.out.println("Мест нет");
			}
		}

	}

	public static void task7() {
        /*
        Задача 7
Даны три числа:

int one;
int two;
int three;

С помощью условного оператора и конструкции else напишите программу,
которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.



Критерии оценки
 Инициализировали переменные.
 Параметры условного оператора решают задание.
 Решение задачи выводится в консоль.
 Для решения использовали конструкцию else.
         */
		System.out.println("\nЗадача 7");
		int one = -5000;
		int two = 0;
		int three = 3;
		int max;

		if (one > two) {
			max = one;
		} else {
			max = two;
		}
		if (max < three) {
			max = three;
		}
		System.out.println("Даны числа:\n" + one + "\n" + two + "\n" + three + "\n" +
				"Максимальное: " + max);

	}

	public static void task8() {
        /*
        У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона,
        ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.

        Напишите программу, которая определяет, чем пользуется клиент (iOS или android),
        и выдает соответствующее сообщение:

        Для iOS — «Установите версию приложения для iOS по ссылке».
        Для android — «Установите версию приложения для android по ссылке».
        Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — android).

        Критерии оценки
        Программа написана корректно и выдает правильный результат.
        Соблюдаются все условия задания.
        Соблюдаются правила названия переменных и пунктуация.
        Корректно инициализировали переменные.
         */

		System.out.println("\nЗадача 8");
		int clientOS = 0;
		int iOS = 0;
		int android = 1;
		String iOSMessage = "Установите версию приложения для iOS по ссылке";
		String androidMessage = "Установите версию приложения для android по ссылке";
		String unknownOS = "Неизвестная операционная система";

		if (clientOS == iOS) {
			System.out.println(iOSMessage);
		} else if (clientOS == android) {
			System.out.println(androidMessage);
		} else {
			System.out.println(unknownOS);
		}
	}

	public static void task9() {
        /*
        Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.

        Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
        Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:

        Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        Для Android: «Установите облегченную версию приложения для Android по ссылке».
        Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.

        Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.

        Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).



        Критерии оценки
         Программа выполняет все условия задачи.
         Написали код без вложенностей.
         Соблюдаются правила названия переменных и пунктуация.
         В зависимости от условий задачи в консоль выводится корректная фраза.
         */

		System.out.println("\nЗадача 9");
		int clientDeviceYear = 2015;
		int conditionYear = 2015;
		int clientOS = 0;
		int iOS = 0;
		int android = 1;
		String iOSMessage = "Установите версию приложения для iOS по ссылке";
		String androidMessage = "Установите версию приложения для android по ссылке";
		String iOSLightMessage = "Установите облегченную версию приложения для iOS по ссылке";
		String androidLightMessage = "Установите облегченную версию приложения для android по ссылке";
		String unknownOS = "Неизвестная операционная система";

		if (clientOS == iOS) {
			if (clientDeviceYear >= conditionYear) {
				System.out.println(iOSMessage);
			} else {
				System.out.println(iOSLightMessage);
			}
		} else if (clientOS == android) {
			if (clientDeviceYear >= conditionYear) {
				System.out.println(androidMessage);
			} else {
				System.out.println(androidLightMessage);
			}
		} else {
			System.out.println(unknownOS);
		}

	}

	public static void task10() {
        /*
        Напишите программу, которая определяет, является ли год високосным или нет.

Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.

Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
 « …. год является високосным»
 или
 «... год не является високосным».

Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
 Также високосным является каждый четырехсотый год.

Критерии оценки
 Код работает корректно, при изменении значения переменной выдает верное значение.
 При изменении условий задачи в консоль выводится корректная фраза.
 Соблюдаются правила названия переменных и пунктуация.
         */
		System.out.println("\nЗадача 10");
		int year = 2100;
		String leapYearMessage = String.format("%s год является високосным", year);
		String notLeapYearMessage = String.format("%s год не является високосным", year);
		if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {  //пиздец неуверен в правильности условия, ебучая задача, ненавижу, блять
			System.out.println(leapYearMessage);
		} else {
			System.out.println(notLeapYearMessage);
		}

	}

	public static void task11() {
        /*
        В банке для клиентов организовывается доставка карт на дом.
        Чтобы известить клиента о том, когда будет доставлена его карта,
        нужно знать расстояние от офиса до адреса доставки.

Правила доставки такие:

Доставка в пределах 20 км занимает сутки.
Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.

Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.

Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
Критерии оценки
 Программа написана корректно, выдает верный результат при изменении значения переменной.
 При изменении значения переменной с расстоянием фраза, выведенная в консоль, корректируется.
 Соблюдаются правила синтаксиса и пунктуации.
         */

		System.out.println("\nЗадача 11");
		int deliveryDistance = 95;
		int oneDayRange = 20;
		int twoDayRange = 60;
		int threeDayRange = 100;
		int deliveryTime = 1;


		if (deliveryDistance <= oneDayRange) {
		} else if (deliveryDistance <= twoDayRange) {
			deliveryTime += 1;
		} else if (deliveryDistance <= threeDayRange) {
			deliveryTime += 2;
		} else {
			deliveryTime += 3;
		}

		String deliveryMessage = String.format("Потребуется дней: %o", deliveryTime);
		String overRangeDeliveryMessage = "Свыше 100 км доставки нет";

		if (deliveryTime < 4) {
			System.out.println(deliveryMessage);
		} else {
			System.out.println(overRangeDeliveryMessage);
		}

	}

	public static void task12() {
        /*
        Напишите программу, которая определяет по номеру месяца в году,
        к какому сезону этот месяц принадлежит.
        Например, 1-й месяц (он же январь) принадлежит к сезону зима.

Для написания программы используйте оператор switch.
Для обозначения номера месяца используйте переменную monthNumber = 12.

Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).

Критерии оценки
 Применили оператор switch.
 Прописали условие, при котором программа не будет выполняться.
 Корректно присвоили значение переменной.
 Соблюдаются правила синтаксиса и пунктуации.
         */

		System.out.println("\nЗадача 12");
		int monthNumber = 9;
		int upperEblanCondition = 13;
		int lowerEblanCondition = 0;
		String monthName = "";
		String seasonName = "";

		switch (monthNumber) {
			case 1:
			case 2:
			case 12:
				seasonName = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				seasonName = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				seasonName = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				seasonName = "Autumn";
				break;
			default:
				System.out.println("Введи нормальное число, от 1 до 12, ебло.");
		}

		switch (monthNumber) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "Jule";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
			default:
				System.out.println("см. выше, ебло.");
		}
		if (monthNumber < upperEblanCondition & monthNumber > lowerEblanCondition) {
			System.out.println(String.format("%s, %s", monthName, seasonName));
		}


	}

}