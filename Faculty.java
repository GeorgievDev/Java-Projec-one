public class Faculty extends Employee{
    
    private String facultyPosition; //асистент, доцент и професор

    public Faculty(String name, int age, int idNumber, String dateOfHire, String facultyPosition){
        super(name, age, idNumber, dateOfHire);
        this.facultyPosition = facultyPosition;
    }

    public void show(){
        super.show();
        System.out.print("Positon in faculty: " + facultyPosition);
    }
}
