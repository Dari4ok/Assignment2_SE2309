import java.util.ArrayList;
import java.util.Collections;

interface Payable {
    double getPaymentAmount();
}

public class Main_block {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("Marzhan", "Myrzakhanova", "Manager", 27045.78));
        peopleList.add(new Employee("Zhumabek", "Aidosuly", "President", 999999999.00));
        peopleList.add(new Student("Darkhan", "Babakhanov", 3.4));
        peopleList.add(new Student("Adilbek", "Zhalgasov", 2.7));


        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
