public class MethodExample {
    public static void main(String[] args){ //Główna metoda main. Czy tylko w niej mogę się odwoływać do innych metod? dlaczego public?
        System.out.println(sayHello());
    }

    private static String sayHello() { //przykład metody zwracającej wartość. dlaczego private skoro można deklarować metody bez pierwszych słów?
        String text = "Hello from FirstClass!";

        return text;
    }
}