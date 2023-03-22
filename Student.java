public class Student extends Person{
    
    private int facultyNumber;
    private String uniSpecialty;

    public Student(String name, int age,int facultyNumber, String uniSpecialty){
        super(name, age);
        this.facultyNumber = facultyNumber;
        this.uniSpecialty = uniSpecialty;
    }

    public void show(){
        super.show();
        System.out.println("Faculty number: " + facultyNumber);
        System.out.println("Specialty: " + uniSpecialty);
    }

}
