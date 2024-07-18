
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ichla
 */
public class BirdsData {

    private ArrayList<BirdsOb> birds;

    public BirdsData() {
        birds = new ArrayList<>();
    }

    public void addBird(Scanner scan) {
        System.out.println("Name: ");
        String name = scan.nextLine();

        System.out.println("Name in Latin");
        String latinName = scan.nextLine();

        BirdsOb bird = new BirdsOb(name, latinName, 0);
        birds.add(bird);

    }

    public void birdFound(String name, String latinName, int ob) {
        BirdsOb bob = new BirdsOb(name, latinName, ob);
        birds.add(bob);
    }

    public void birdCreateObservation(Scanner scan) {
        System.out.println("Bird?");
        String bird = scan.nextLine();

        boolean found = false;
        for (BirdsOb percorre : birds) {
            if (percorre.getName().equals(bird)) {
                percorre.setOb(1);
                found = true;
                break;
                //birdFound(percorre.getName(), percorre.getLatinName(), percorre.getOb());
            } 
        }
        
        if(!found) {
            System.out.println("Not a bird");
        }
    }

    public void printAll() {
        for (BirdsOb bird : birds) {
            System.out.println(bird);
        }
    }

    public void printOneBird(Scanner scan) {
        System.out.println("Bird?");
        String bird = scan.nextLine();
        
        boolean found = false;

        for (BirdsOb percorre : birds) {
            if (percorre.getName().equals(bird)) {
                System.out.println(percorre);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Not a bird");
        }
    }

}
