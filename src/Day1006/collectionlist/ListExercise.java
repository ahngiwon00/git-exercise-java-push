package Day1006.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("안소민");
    }
    public List<String> getStudents(){
        return students;
    }

}
