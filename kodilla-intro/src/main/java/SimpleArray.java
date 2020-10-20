public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[] {"Kasia", "Basia", "Zosia", "Marysia", "Michał"};
        String[] movies = new String[4];

        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        int numberOfElements1 = movies.length;

        System.out.println("Ilość elementów w tablicy1: ");
        System.out.println(numberOfElements);
        System.out.println("Ilość elementów w tablicy2: ");
        System.out.println(numberOfElements1);

        movies[0] = "Harry Potter";
        movies[1] = "Lord of the Rings";
        movies[2] = "Forrest Gump";
        movies[3] = "Day Potatoe";

        System.out.println("\n Elementy będące w tablicy names: ");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            }

        System.out.println("\n A tu od końca: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
