public class Students {
    public static void main(String[] args) {
        Grades studentA = new Grades();
        studentA.add(2);
        studentA.add(4);
        studentA.add(2);
        studentA.add(1);
        studentA.add(6);
        studentA.add(5);
        studentA.add(8);
        studentA.add(10);
        studentA.add(9);
        studentA.add(9);

        System.out.println("Oceny studenta A: " + studentA.grades[9]);
    }
}
