import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Michaela", 19, 5050, "Softuer enginering"));
        people.add(new Faculty("Georgi", 35, 3276, "26.05.2020", "Profesor"));
        people.add(new staff("Ivan", 23, 3456, "27.08.2019", "Assistant"));
        people.add(new Student("Ivelina", 23, 5150, "Lingustics"));
        people.add(new Faculty("Dimitrina", 52, 3226, "25.05.2020", "Profesor"));
        people.add(new staff("Snejanka", 22, 3466, "27.10.2019", "Secretary"));
    
        for(int i=0;i<people.size();i++){
            people.get(i).show();
            System.out.println();
        }
    }
}
