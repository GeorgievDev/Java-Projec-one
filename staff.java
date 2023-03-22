public class staff extends Employee{

    private String staffPosition; //учебен отдел или секретар

    public staff(String name, int age, int idNumber, String dateOfHire, String staffPosition){
        super(name, age, idNumber, dateOfHire);
        this.staffPosition = staffPosition;
    }

    public void show(){
        super.show();
        System.out.println("Positon of hire: " + staffPosition);
    }
}
