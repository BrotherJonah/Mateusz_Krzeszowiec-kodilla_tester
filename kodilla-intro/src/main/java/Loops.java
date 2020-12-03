public class Loops {
    public static void main(String[] args){

        int[] tablicaA = {3, 7};

        int x = sumNumbers(tablicaA);
        System.out.println(x);
    }

    public static int sumNumbers(int[] numbers) { //żebym oblicył sumę, potrzebuję tablicy o nazwie numbers. "daj mi to to dam Ci coś innego" ; numbers - nazwa której używam tylko w metodzie.
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        return result;
    }
}
