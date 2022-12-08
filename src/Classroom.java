import java.util.ArrayList;

public class Classroom {
    private String classroomName;
    private String classroomTerm;
    private ArrayList <Student> students;

    Classroom(String classroomName, String classroomTerm, ArrayList<Student>students){
        this.classroomName=classroomName;
        this.classroomTerm=classroomTerm;
        this.students= students;

    }
    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public String getClassroomTerm() {
        return classroomTerm;
    }

    public void setClassroomTerm(String classroomTerm) {
        this.classroomTerm = classroomTerm;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addANewStudent(Student student){
        students.add(student);
    }
    public void removeAStudent(String firstName){
        for (int i =0 ;i<students.size();i++){
            if(students.get(i).getFirstName() == firstName){ //arraylist
                students.remove(students.get(i));

            }
            }

        System.out.println("Student"+ firstName+"is successfully deleted");
    }
    public void printFullRelatory(){
        System.out.println("the classroom name is"+classroomName+"and the term is"+ classroomTerm+
                "the students goes to are"+students.toString());
    }



}
