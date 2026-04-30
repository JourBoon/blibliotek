public class Livre {
    
    private final int ID;
    private final String AUTEUR;
    private final String TITRE;
    private boolean disponibilite;
    
    public Livre(final String ID, final String AUTEUR, final String TITRE){
        private static int compteur = 1;
private String id;

public Livre(String titre, String auteur) {
    this.id = "LIV-" + String.format("%03d", compteur++);
};
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
    
    @Override
    public String toString() {
        return String.format("[%s] %s - %s (%s)", 
            id, titre, auteur, (disponibilite ? "Dispo" : "Emprunté"));
    }
}
