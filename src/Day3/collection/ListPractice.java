package Day3.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    private List<String> students=new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();



    Names names = new Names();

    public ListPractice(){
        names.getName(students);
        this.studentObjs = names.getStudentObjs();
    }



    public List<String> getStudentList(){
        return this.students;
    }
}

