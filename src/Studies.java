import java.util.ArrayList;

public class Studies {
    String sname;
    String scode;
    int nSemesesters;
    int nItn;
    ArrayList<Student> students;
    public Studies(String sname, String scode, int nSemesesters, int nItn){
        this.sname=sname;
        this.scode=scode;
        this.nSemesesters=nSemesesters;
        this.nItn=nItn;
        this.students=new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }


}
