package BoundedGenerics;

import java.util.ArrayList;
import java.util.List;

public class StudentSorter implements Comparable<StudentSorter> {
    private String name;
    private int age;

    public StudentSorter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
       return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String toString() {
        return "StudentSorter{" + "name= " + name + '\'' + ", age =" + age + '}';
    }

    public  int compareTo(StudentSorter other) {
        return Integer.compare(this.age, other.age);
    }

}
