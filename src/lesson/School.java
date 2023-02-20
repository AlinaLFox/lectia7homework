package lesson;

public class School {

    private int mediumGradePerStudent;
    private Lesson lessons[] = new Lesson[20];
    private int numberOfLessons = 0;

    public int calculateMediumGpS() {
        int sum = 0;
        int numberOfStudents = 0;
        for (int x = 0; x < calculateNumberOfLessons(); x++) {
            sum = sum + lessons[x].getSumGrade();
            numberOfStudents = numberOfStudents + lessons[x].getNumberOfStudents();
        }
        mediumGradePerStudent = sum / numberOfStudents;

        return mediumGradePerStudent;
    }

    public void addNewLesson (String name, String description, Student[] students) {
        int numberOfStudentPerLesson = calculateNumberOfStudents (students);

        Lesson lesson = new Lesson();
        lesson.setName(name);
        lesson.setDescription(description);
        lesson.setNumberOfStudents(numberOfStudentPerLesson);
        lesson.setStudents(students);
        lessons[numberOfLessons] = lesson;
        numberOfLessons++;
    }

    private int calculateNumberOfStudents(Student[] students){
        int numberOfStudentPerLesson = 0;
        for (int x = 0; x < students.length; x++) {
            if(students[x] != null) {
                numberOfStudentPerLesson++;
            }
        }
        return numberOfStudentPerLesson;
    }

    private int calculateNumberOfLessons() {
        int numberOfLessons = 0;
        for (int x= 0; x < lessons.length; x++) {
            if(lessons[x] != null) {
                numberOfLessons++;
            }
        }
        return numberOfLessons;
    }
}
