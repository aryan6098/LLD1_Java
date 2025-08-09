package BoundedGenerics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {

    public static void sortStudentsByAgeDescending(List<StudentSorter> students) {
        students.sort(Comparator.comparingInt(StudentSorter ::getAge).reversed());
//        students.sort((s1,s2)-> Integer.compare(s2.getAge(), s1.getAge()));
    }
    public static void main(String[] args) {
        List<StudentSorter> studentSorters = new ArrayList<>();
        studentSorters.add(new StudentSorter("Raj", 20));
        studentSorters.add(new StudentSorter("Aryan", 25));
        studentSorters.add(new StudentSorter("Bob", 23));
        System.out.println("Befor Sorting");
        for(StudentSorter s : studentSorters) {
            System.out.println(s.getName() + " " + s.getAge());
        }

        System.out.print("After Sorting : ");

        sortStudentsByAgeDescending(studentSorters);

        for(StudentSorter s : studentSorters) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}
