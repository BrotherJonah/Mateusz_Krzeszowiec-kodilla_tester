import java.util.Random;

public class RandomNumber { //statyczna kompilacja w Javie
    public static void main(String[] args){
        int randomNumber = getCountOfRandomNumber(9);

        System.out.println("Wylosowana liczba to: " + randomNumber);

        wheel();
    }

    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public static void wheel(){
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
