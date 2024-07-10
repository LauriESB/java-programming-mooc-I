
import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        people = new ArrayList<>();
    }
    public void add(Person person) {
        people.add(person);
    }
    public boolean isEmpty() {
        return people.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return new ArrayList<>(people);
    }
    public Person shortest() {
        if(this.people.isEmpty()) {
            return null;
        }
        
        Person checkShortest = this.people.get(0);
        
        for(Person percorre : this.people) {
            if(checkShortest.getHeight() > percorre.getHeight()) {
                checkShortest = percorre;
            }
        }
        return checkShortest;
    }
    
    public Person take() {
        if(people.isEmpty()) {
            return null;
        }
        Person take = shortest();
        
        people.remove(take);
        return take;
    }
}
