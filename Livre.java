public class Livre {
    private final int ID;
    private final String AUTEUR;
    private final String TITRE;

    public Livre(final int ID, final String AUTEUR, final String TITRE){
        this.ID = ID;
        this.AUTEUR = AUTEUR;
        this.TITRE = TITRE;
    }
    
    public Integer getID() {
        return this.ID;
  
    }

    public String getAuteur() {
        return this.AUTEUR;
  
    }

    public String getTitre() {
        return this.TITRE;
  
    }   
}