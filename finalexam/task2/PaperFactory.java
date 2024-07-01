package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    public void printStaff() {
        System.out.println("Staff List:");
        for (Person p : staff) {
            System.out.println(p);
        }
    }

    public List<Person> getStaff() {
        return new ArrayList<>(staff);
    }
}
