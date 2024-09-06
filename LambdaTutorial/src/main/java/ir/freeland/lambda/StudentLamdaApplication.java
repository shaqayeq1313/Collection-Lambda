package ir.freeland.lambda;

import java.util.*;
import java.util.stream.Collectors;


public class StudentLamdaApplication {
    public static void main(String[] args) {
    	
        List<Student> students = Arrays.asList(
            new Student("Alex", "Johnson", 21, 19),
            new Student("Emily", "Davis", 22, 16),
            new Student("Michael", "Smith", 20, 14),
            new Student("Sophia", "Brown", 23, 17),
            new Student("Daniel", "Lee", 22, 12),
            new Student("Olivia", "Miller", 19, 15),
            new Student("James", "Wilson", 25, 20),
            new Student("Ava", "Moore", 21, 18),
            new Student("Ethan", "Taylor", 24, 13),
            new Student("Isabella", "Anderson", 20, 20)
        );

        // Sort by grade (ascending)
        List<Student> sortedByGrade = students.stream().sorted(Comparator.comparingInt(Student::getGrade)).collect(Collectors.toList());
        System.out.println("Sorted by grade (ascending):");
        sortedByGrade.forEach(System.out::println);

        // Sort by grade (descending)
        List<Student> sortedByGradeDesc = students.stream().sorted(Comparator.comparingInt(Student::getGrade).reversed()).collect(Collectors.toList());
        System.out.println("\nSorted by grade (descending):");
        sortedByGradeDesc.forEach(System.out::println);

        // Print students whose grade is more than 10
        System.out.println("\nStudents with grade more than 10:");
        students.stream().filter(s -> s.getGrade() > 10).forEach(System.out::println);

        // Print students whose grade is less than 10
        System.out.println("\nStudents with grade less than 10:");
        students.stream().filter(s -> s.getGrade() < 10).forEach(System.out::println);

        // Print students by age
        List<Student> sortedByAge = students.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
        System.out.println("\nSorted by age:");
        sortedByAge.forEach(System.out::println);

        // Print average grade
        double averageGrade = students.stream().mapToInt(Student::getGrade).average().orElse(0);
        System.out.println("\nAverage grade: " + averageGrade);

        // Print average grades more than 18
        double averageGradeMoreThan18 = students.stream().filter(s -> s.getGrade() > 18).mapToInt(Student::getGrade).average().orElse(0);
        System.out.println("Average grade for grades more than 18: " + averageGradeMoreThan18);
    }
}

