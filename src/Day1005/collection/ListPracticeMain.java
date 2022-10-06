package Day1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        ListPractice listPractice = new ListPractice();
        List<String> students =listPractice.getStudentList();

        for(String student : students){
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
