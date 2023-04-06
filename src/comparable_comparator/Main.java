package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kiên", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tùng", 38, "HT");

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st.toString());
        }
        System.out.println("So sánh theo tuổi:");
        Collections.sort(lists, new AgeComparator());
        for (Student st : lists){
            System.out.println(st.toString());
        }

    }
}
