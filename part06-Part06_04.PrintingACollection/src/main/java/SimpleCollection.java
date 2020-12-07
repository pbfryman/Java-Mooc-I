
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String characters = "";
        
        for (int i = 0; i < elements.size(); i++) {
            if (i < elements.size() - 1) {
                characters += elements.get(i) +"\n";
            } else {
                characters += elements.get(i);
            }
        }
        
        if (elements.size() == 1) {
            return "The collection " + this.name + " has " + elements.size() + " element:\n" + 
            characters;
        } else {
            return "The collection " + this.name + " has " + elements.size() + " elements:\n" + 
            characters;
        }

    }
    
}
