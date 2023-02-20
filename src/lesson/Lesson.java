package lesson;

 class Lesson {
    private int numberOfStudents;
    private int sumGrade;
    private String description;
    private String name;

    private Student[] students = new Student[200];

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getSumGrade() {
        for (int x = 0; x < numberOfStudents; x++) {
            sumGrade = sumGrade + students[x].getGrade();
        }
        return sumGrade;
    }

    public void setSumGrade(int sumGrade) {
        this.sumGrade = sumGrade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
