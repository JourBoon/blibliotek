
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private final List<Livre> COLLECTION;

    public Bibliotheque(){
        this.COLLECTION = new ArrayList<>();
    }

    public int countStock(){
        return this.COLLECTION.size();
    }

    public int countBook(Livre book){
        int count = 0;

        for(Livre books : this.COLLECTION){
            if(books.equals(book))
                count++;
        }
        
        return count;
    }

    public void displayCollection(){
        List<Livre> displayList = this.COLLECTION;
        

        for(Livre books : this.COLLECTION){
            if(!displayList.contains(books)){
                displayList.add(books);
            }
        }

        System.out.println("TITRE, AUTEUR, ID, EXEMPLAIRES : ");

        for(Livre books : displayList){
            System.out.println(books.getTitre() + ", " + books.getAuteur() + ", ID : " + books.getID() + ", Exemplaires : " + this.countBook(books));
        }
    }

    public List<Livre> getCollection(){
        return this.COLLECTION;
    }

    public void addBook(Livre book, int amount){
        this.COLLECTION.add(book);
    }

    public void removeBook(Livre book){
        this.COLLECTION.remove(book);
    }

}