public class test1 {
    public static void main(String[] args) { //czy typ danych int?

        int secondResult = sum(1, 2);
        System.out.println("Wynik sumy z zadanymi wartościami to: " + secondResult);

        sumAndDisplay(1, 3);
    }

    private static int sum(int a, int b) {
        int result = a + b;

        return result;
    }

    public static void sumAndDisplay(int a, int b) {
        int result = a + b;

        System.out.println(result);
    }
}