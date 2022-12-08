import java.text.DecimalFormat;

public class Student extends Person {
    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;
    private double averageGrade;
    Boolean clearedTheCourse;

    public Student (String firstName, String lastName, int age,char gender){
        super(firstName, lastName, age, gender);
    }


     public Student (String firstName, String lastName, int age, char gender, double firstGrade,
                      double secondGrade, double thirdGrade) {
        super(firstName, lastName, age, gender);
         this.firstGrade=firstGrade;
         this.secondGrade=secondGrade;
         this.thirdGrade=thirdGrade;

     }
    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
   public double calculateAverage(double firstGrade,double secondGrade,double thirdGrade){
        double Average = (firstGrade+secondGrade+thirdGrade)/3;
       // this.averageGrade =Average;
        return Average;
   }
   public boolean hasClearedTheCourse(){
        if(averageGrade <6){
            clearedTheCourse =false;
        } else {
            clearedTheCourse=true;
        }
        return clearedTheCourse;
   }


    @Override
    public String toString(){
        calculateAverage(firstGrade,secondGrade,thirdGrade);
      //  return "the person Name is"+getFirstName()+getLastName()+"is "+getAge()+"years old"+"is a"+getGender()+"has in first grade:" +
           //     firstGrade+"in second grade "+ secondGrade+ "in third grade"+thirdGrade;
        DecimalFormat dc = new DecimalFormat("#.0");
        if (hasClearedTheCourse()){
            return "the person Name is" + getFirstName() + getLastName() + "is " + getAge() + "years old" + "is a" + getGender() + "has in first grade:" +
                    firstGrade + "in second grade " + secondGrade + "in third grade" + thirdGrade + "got " + firstGrade + "," +
                    secondGrade + "," + thirdGrade + "\n final grade" + dc.format(averageGrade)+"is finished this course";
        }
        return "the person Name is" + getFirstName() + getLastName() + "is " + getAge() + "years old" + "is a" + getGender() + "has in first grade:" +
                firstGrade + "in second grade " + secondGrade + "in third grade" + thirdGrade + "got " + firstGrade + "," +
                secondGrade + "," + thirdGrade + "\n final grade" +dc.format(averageGrade) +"isn't finished this course";
    }


}
