
import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
        messages = new ArrayList<>();
    }
    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            messages.add(message);
        }  
    }
    public ArrayList<Message> getMessages() {
        return new ArrayList<>(messages);
    }
}
