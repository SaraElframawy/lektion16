public class Person {
    private int age;
   private String firstName;
   private String lastName;
   private char gender;

   Person(String firstName, String lastName, int age, char gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;

    }
    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setFirstName(String firstName){
       this.firstName= firstName;

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(){
       return this.firstName;
    }

    @Override
    public String toString(){
       return "The person name is"+firstName+ lastName+"is\t"+gender+"and he is "+age+"years old";

    }





}
