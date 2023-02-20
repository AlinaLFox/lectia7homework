import lesson.Student;
import lesson.School;

public class Main {
    public static void main(String[] args) {

        School school = new School();

        Student students[] = new Student[20];
        students[0] = new Student("Basil", 8);
        students[1] = new Student("Elyn", 9);

        school.addNewLesson("English", "First group", students);

        Student students2[] = new Student[18];
        students2[0] = new Student("Nora", 2);
        students2[1] = new Student("George", 7);

        school.addNewLesson("English", "Second group", students2);

        System.out.println("Nota medie per student; " + school.calculateMediumGpS());

    }
}