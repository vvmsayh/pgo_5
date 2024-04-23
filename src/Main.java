import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Date date;
        Student s1=new Student("John", "Lennon", "s696969@pjwstk.edu.pl", "Warsaw", "999", new Date(2010, 4,15));
        Student s2=new Student("Hue", "Janus", "Huejanus@pjwstk.edu.pl", "aleja stanuw", "6969", new Date(1999, 6,11));
        Studies it=new Studies("IT", "AAA", 7,5);

        s1.enrollStudent(it);
        s1.addGrade(4,"PGO");
        s2.enrollStudent(it);
        s2.addGrade(4,"PGO");
        s1.displayInfoStudent();
        s2.displayInfoStudent();
        Student.promoteAllStudents();
        s1.displayInfoStudent();
        s2.displayInfoStudent();
    }
}