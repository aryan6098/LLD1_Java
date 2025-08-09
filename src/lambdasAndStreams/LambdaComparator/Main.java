package lambdasAndStreams.LambdaComparator;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<StudentSorter> students = new ArrayList<>();
        students.addAll(List.of(
                new StudentSorter( "Raj", 1),
                new StudentSorter("Aryan", 25),
                new StudentSorter("Kumar", 23),
                new StudentSorter("Shyam", 13)
        ));

        for(StudentSorter s : students) {
            System.out.println(s);
        }

        Comparator<StudentSorter> comparatorByName = (o1, o2) -> {
            if(o1.getName().equals(o2.getName())) {
                return o1.compareTo(o2);
            }
            if(o1.getName().compareTo(o2.getName()) < 0) {
                return  - 1;
            }
            return 1;
        };

        Collections.sort(students);
        System.out.println("After age Sorting");


        for(StudentSorter s : students) {
            System.out.println(s);
        }

        Collections.sort(students, comparatorByName);

        System.out.println(students);
    }
}
