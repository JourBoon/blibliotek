import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private final List<Livre> COLLECTION;

    public Bibliotheque(){
        this.COLLECTION = new ArrayList<>();
    }

    public void displayCollection(){
        for(Livre books : this.getBookCollection()){
            System.out.println(books.toString());
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

    public void findBook(String search){
        boolean positiveResult = false;

        System.out.println("\nRésultat de votre recherche :");

        for(Livre books : this.getBookCollection()){
            if(books.getAuteur().contains(search) || books.getID().contains(search) || books.getTitre().contains(search)) {
                System.out.println(books.toString());
                positiveResult = true;
            }
        }

        if(!positiveResult) {
            System.out.println("Aucun résultat correspondant.");
        }
    }

    public Livre findBookByID(String id){
        for(Livre book : this.getBookCollection()){
            if(book.getID().equals(id))
                return book;
        }

        return null;
    }

    public void borrowBook(String id){
        Livre book = this.findBookByID(id);
        if(book == null){
            System.out.println("\nCette action n'a pas pu être effectuée.");
        } else {
            book.setDisponible(false);
            System.out.println("Le livre '" + book.getTitre() + "', vient d'être emprunté.");
        }
    }

    public void unborrowBook(String id){
        Livre book = this.findBookByID(id);
        if(book == null){
            System.out.println("\nCette action n'a pas pu être effectuée.");
        } else {
            book.setDisponible(true);
            System.out.println("Le livre '" + book.getTitre() + "', est à nouveau disponible.");
        }
    }

    public List<Livre> getCollection(){
        return this.COLLECTION;
    }

    public void addBook(Livre book){
        this.COLLECTION.add(book);
    }

    public void removeBook(Livre book){
        this.COLLECTION.remove(book);
    }

}