import java.util.ArrayList;
import java.util.Date;
public class Student{
    public Studies studies;
    String name;
    String lName;
    String email;
    String adress;
    String phone;
    Date date;
    String status;
    int semester;
    int Itn;
    int index;
    private static int nextIndex = 1;
    ArrayList<Double> PGOgrades;
    ArrayList<Double> pmrgrades;
    public static ArrayList<Student> allStudents = new ArrayList<>();
    public Student(String name, String lName, String email, String adress, String phone, Date date){
        this.name=name;
        this.lName=lName;
        this.email=email;
        this.phone=phone;
        this.adress=adress;
        this.date=date;
        this.semester=1;
        index = nextIndex;
        nextIndex++;
        this.status="Student";
        this.Itn = 0;
        allStudents.add(this);
    }

    public void enrollStudent(Studies study) {
        this.studies=study;
        study.addStudent(this);
        this.PGOgrades= new ArrayList<>();
        this.pmrgrades= new ArrayList<>();

    }
    public void addGrade(double score, String coursename){
        if(coursename.equals("PGO")){
            this.PGOgrades.add(score);
        } else if (coursename.equals("PMR")) {
            this.pmrgrades.add(score);
        }
    }
    public void promoteToNextSemester(){
        if(this.Itn>this.studies.nItn){
            throw new IllegalArgumentException("More ITN's than allowed");
        } else if (this.semester==studies.nSemesesters) {
            this.status="Graduated";
            throw new IllegalArgumentException("Student has already graduated");
        }else{
            semester++;
        }
    }
    public void displayInfoStudent(){
        System.out.println(this.name+" "+this.lName+" "+this.email+" "+this.phone+" "+this.adress+" "+this.date+" course " + this.studies.sname + " semester " + this.semester  + " Index "+ this.index);
    }
    public static void promoteAllStudents() {
        for (Student student : allStudents) {
            student.promoteToNextSemester();
        }
    }

}