import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Blake", "Hi, how are you?");
        Message message2 = new Message("Julie", "Hello. I am good. How are you?");
        Message message3 = new Message("Blake", "I'm doing really good. I am going to ramble "
                + "a bit as I am very nervous and don't really know what to say. "
                + "This message may end up being too long to be added to our messages "
                + "list, but we will see what happens. Apparently the message is still "
                + "too long and will require much more text in order to exceed the "
                + "280 character limit.");
        
        MessagingService service = new MessagingService();
        service.add(message);
        service.add(message2);
        service.add(message3);
        
        ArrayList<Message> list = service.getMessages();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getContent());
            System.out.println(list.get(i).getSender());
        }
    }
}
