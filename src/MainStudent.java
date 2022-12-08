import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("Sara","Elframawy",29,'w',
                30,30,20);
        Classroom classroom = new Classroom("Teknisk","term1",students);
        students.add(new Student("Nelly","Ellatif",6,'w'));
        students.add(new Student("Sara","Elframawy",29,'w'));
        classroom.addANewStudent(student);
        classroom.printFullRelatory();
    }
}
