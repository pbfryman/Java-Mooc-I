
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Is the room empty? ");
        if (room.isEmpty() == true) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }
        
        System.out.println();
        
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        
        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
