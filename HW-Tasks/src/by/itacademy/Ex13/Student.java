package by.itacademy.Ex13;

class Student extends Man {
    private int studyYear;

    public Student(String name, int age, String sex, double weight, int studyYear) {
        super(name, age, sex, weight);
        this.studyYear = studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public void increaseStudyYear() {
        this.studyYear++;
    }

    public int getStudyYear() {
        return studyYear;
    }
}


