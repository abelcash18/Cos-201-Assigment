//   Chapter Nine Object Sorting
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

public class ObjectSorting {
    static class Student {
        int grade;

        Student(int grade) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(75),
            new Student(90),
            new Student(60)
        };

        // Bubble Sort
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].grade > students[j + 1].grade) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Grades:");
        for (Student s : students) {
            System.out.println(s.grade);
        }
    }
}
