
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ichla
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {  
        if(jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }     
        Random r = new Random();
        int index = r.nextInt(jokes.size());  
        
        return jokes.get(index);
    }
    
    public void printJokes() {
        for(String percorre : jokes) {
            System.out.println(percorre);
        }
    }
}
