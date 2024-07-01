package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("John", "Doe", "1234567890");
        Person person2 = new Person("Jane", "Doe", "0987654321");

        factory.addPerson(person1);
        factory.addPerson(person2);

        factory.printStaff();

        
        boolean deleted = factory.deletePerson(person1);
        System.out.println("Person deleted: " + deleted);

        factory.printStaff();

        // attempt to delete a person not on list (should return false)
        Person person3 = new Person("Jim", "Beam", "5555555555");
        deleted = factory.deletePerson(person3);
        System.out.println("Person deleted: " + deleted);

        factory.printStaff();
    }
}
