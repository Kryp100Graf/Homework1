public class Main {
    public static void main(String[] args) {

        var text = "Привет, Мир!";
        System.out.println(text);

        firstTasks();
        secondTasks();

    }

    private static void secondTasks() {

        var friend = 19;
        System.out.println("\nЗадача 4:\n" + "\nfriend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);

        var frog = 3.5;
        System.out.println("\nЗадача 5:\n" + "\nfrog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
    }

    private static void firstTasks() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("\nЗадача 1:\n" + "\ndog = " + dog +
                "\ncat = " + cat + "\npaper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("\nЗадача 2:\n" + "\ndog + 4 = " + dog +
                "\ncat + 4 = " + cat + "\npaper + 4 = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("\nЗадача 3:\n" + "\ndog - 3.5 = " + dog +
                "\ncat - 1.6 = " + cat + "\npaper - 7639 = " + paper);
    }
}