
public class Main {

    public static void main(String[] args) {

        // add the following two methods to the class:
        // public void add(Message message) - adds a message passed as a parameter to the messaging service as long as the message content is at most 280 characters long.
        // public ArrayList<Message> getMessages() - returns the messages added to the messaging service.

        Message day07092024time729pm = new Message("Luana", "Hello Paula, could you please send me that book PDF");
        Message day07092024time820pm = new Message("Paula", "kkkkkkkkkkkkkkksalksalskalkslakslkalskalsklakslaklskalkslakslkalsklakslakslkalskalkslakslkalkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        Message day07092024time822pm = new Message("Luana", "Oh, I think your cat layed on your keyboard again");
        Message day07092024time900pm = new Message("Paula", "OMG, he did! haha sorry for that, I'll send you the pdf right away");

        MessagingService ms = new MessagingService();
     
        ms.add(day07092024time729pm);
        ms.add(day07092024time820pm);
        ms.add(day07092024time900pm);
        System.out.println(ms.getMessages());

    }
}
