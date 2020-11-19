package gradesAndStudents;

public class Grades {
    int[] grades;
    int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }

        this.grades[this.size] = value;
        this.size++;
    }

//    public int returnLastValue() {
//        int lastValue = grades[size];
//
//        return lastValue;
//    }

    public double avgTableValue() {
        double result = 0;
        double avg = 0;

        for (int i = 0; i < this.size; i++) {
            result = result + this.grades[i];
            avg = result / this.size;
        }

        return avg;
    }
}