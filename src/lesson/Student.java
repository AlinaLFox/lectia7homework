package lesson;

public class Student {
    private int grade;
    private String name;

   public Student (String name, int grade) {
       this.grade = grade;
       this.name = name;
   }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
