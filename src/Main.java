public class Main {
    public static void main(String[] args) {
        var text = "Привет, Мир!";
        System.out.println(text);

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("\nЗадача 1:\n" + "\ndog = " + dog +
                "\ncat = " + cat + "\npaper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("\nЗадача 2:\n" + "\ndog = " + dog +
                "\ncat = " + cat + "\npaper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("\nЗадача 3:\n" + "\ndog = " + dog +
                "\ncat = " + cat + "\npaper = " + paper);
    }
}