public class Livre {
    private final int ID;
    private final String AUTEUR;
    private final String TITRE;
    private boolean Disponibilite;
    
    public Livre(final int ID, final String AUTEUR, final String TITRE){
        this.ID = ID;
        this.AUTEUR = AUTEUR;
        this.TITRE = TITRE;
        this.disponibilite = true;
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
    
    public boolean isDisponibilite() {
        return this.disponibilite;
  
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}