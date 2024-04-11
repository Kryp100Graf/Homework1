public class Main {
    public static void main(String[] args) {

        var text = "Привет, Мир!";
        System.out.println(text);

//        Задачи по переменным
        variablesTasks();

    }

    private static void variablesTasks() {

        firstVarTasks();    //Задачи 1-3
        secondVarTasks();   //Задачи 4-5
        thirdVarTasks();    //Задачи 6-8

    }

    private static void thirdVarTasks() {

//        Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumWeight = firstBoxerWeight + secondBoxerWeight;
        var diffWeight = firstBoxerWeight - secondBoxerWeight;
        if (diffWeight < 0) {
            diffWeight = diffWeight * (-1);
        }
        System.out.println("\nЗадача 6:\n\nОбщий вес бойцов " + sumWeight + "\nРазница в весе составляет " + diffWeight);

//        Задача 7
        diffWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("\nЗадача 7\nРазница в весе (вычитание из большего) составляет " + diffWeight);

        diffWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе (остаток от деления) составляет " + diffWeight);

//        Задача 8
        var workingHours = 640;
        var hoursPerEmployee = 8;
        var countOfEmployee = workingHours / hoursPerEmployee;
        System.out.println("\nЗадача 8\nВсего работников в компании - " + countOfEmployee + " человек");

        countOfEmployee = countOfEmployee + 94;
        workingHours = countOfEmployee * hoursPerEmployee;
        System.out.println("Если в компании работает " + countOfEmployee + " человека, то всего " + workingHours +
                " часов работы может быть поделено между сотрудниками");
    }

    private static void secondVarTasks() {

//        Задача 4
        var friend = 19;
        System.out.println("\nЗадача 4:\n" + "\nfriend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);

//        Задача 5
        var frog = 3.5;
        System.out.println("\nЗадача 5:\n" + "\nfrog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
    }

    private static void firstVarTasks() {

//        Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("\nЗадача 1:\n" + "\ndog = " + dog +
                "\ncat = " + cat + "\npaper = " + paper);

//        Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("\nЗадача 2:\n" + "\ndog + 4 = " + dog +
                "\ncat + 4 = " + cat + "\npaper + 4 = " + paper);

//        Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("\nЗадача 3:\n" + "\ndog - 3.5 = " + dog +
                "\ncat - 1.6 = " + cat + "\npaper - 7639 = " + paper);
    }
}