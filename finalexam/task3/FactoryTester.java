package finalexam.task3;

import java.io.IOException;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        // creating Person instances
        Person person1 = new Person("John", "Doe", "1234567890");
        Person person2 = new Person("Jane", "Doe", "0987654321");

        // add persons to the factory
        factory.addPerson(person1);
        factory.addPerson(person2);

        // print the staff list
        factory.printStaff();

        // save the staff list to a file staff_list.dat
        try {
            factory.saveStaffToFile("staff_list.dat");
        } catch (IOException e) {
            System.out.println("Error saving staff list: " + e.getMessage());
        }

        // clears the staff list
        factory = new PaperFactory();
        factory.printStaff();  // should print  empty list

        // load the staff list from the file staff_list.dat
        try {
            factory.loadStaffFromFile("staff_list.dat");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading staff list: " + e.getMessage());
        }

    
        factory.printStaff();
    }
}
