package by.itacademy.Ex13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Алексей", 17, "Мужской", 83.0, 1);
        Student student2 = new Student("Юлия", 18, "Женский", 65.0, 2);
        Student student3 = new Student("Михаил", 20, "Мужской", 85.0, 1);
        Student student4 = new Student("Анна", 22, "Женский", 69.0, 3);
        Student student5 = new Student("Александр", 19, "Мужской", 70.0, 2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections.sort(students, Comparator.comparingInt(Student::getAge).thenComparing(Student::getName));

        Map<Integer, List<Student>> studentsByYear = new HashMap<>();
        for (Student student : students) {
            studentsByYear.computeIfAbsent(student.getStudyYear(), k -> new ArrayList<>()).add(student);
        }
        try (FileWriter fileWriter = new FileWriter("students.txt")) {
            for (Integer year : studentsByYear.keySet()) {
                fileWriter.write("год обучения: " + year + "\n");
                for (Student student : studentsByYear.get(year)) {
                    fileWriter.write(student.getName() + " " + student.getAge() + " " + student.getSex() + " " + student.getWeight() + "\n");
                }
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("студенты записаны в файл students.txt");
    }
}

