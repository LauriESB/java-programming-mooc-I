
public class Main {

    public static void main(String[] args) {
        // Test your class here
        
        // Part01. Create Room class. The class should contain a list of persons as an instance variable, and it should have a parameterless constructor. In addition, add the following methods to the class:
        // public void add(Person person) - add the person passed as a paramter to the list.
        // public boolean isEmpty() - returns a boolean-type value true or false, that tells whether the room is empty or not.
        // public ArrayList<Person> getPersons() - returns a list of the persons in the room.

        // Part02. Add a public Person shortest() method to the Room class, which returns the shortest person added to the room. If the room is empty, a null reference is returned.
    
        // Part03. Add a public Person take() method to the Room class, which takes the shortest person in the room. When a room is empty, it returns a null reference.
        Room room = new Room();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
    }
}
