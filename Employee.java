public class Employee extends Person{
    private int idNumber;
    private String dateOfHire;

    public Employee(String name, int age, int idNumber, String dateOfHire){
        super( name, age);
        this.idNumber = idNumber;
        this.dateOfHire = dateOfHire;
    }

    public void show(){
        super.show();
        System.out.println("Personal number: " + idNumber);
        System.out.println("Date of hiring:" + dateOfHire);
    }

}
