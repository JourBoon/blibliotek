
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
        System.out.println("TITRE, AUTEUR, ID, EXEMPLAIRES : ");

        for(Livre books : this.getBookCollection()){
            System.out.println(books.getTitre() + ", " + books.getAuteur() + ", ID : " + books.getID() + ", Exemplaires : " + this.countBook(books));
        }
    }

    public List<Livre> getBookCollection(){
        List<Livre> bookList = this.COLLECTION;

        for(Livre books : this.COLLECTION){
            if(!bookList.contains(books)){
                bookList.add(books);
            }
        }

        return bookList;
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