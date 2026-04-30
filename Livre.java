public class Livre {

    private static int compteur = 1;

    private final String ID;
    private final String AUTEUR;
    private final String TITRE;
    
    private boolean disponible;

    public Livre(String titre, String auteur) {
        this.ID = "LIV-" + String.format("%03d", compteur++);
        this.TITRE = titre;
        this.AUTEUR = auteur;
        this.disponible = true; 
    }

    public String getID() {
        return this.ID;
    }

    public String getAuteur() {
        return this.AUTEUR;
    }

    public String getTitre() {
        return this.TITRE;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String statut = this.disponible ? "Disponible" : "Emprunté";
        return String.format("[%s] %-20s | %-15s | Statut: %s", 
                             this.ID, this.TITRE, this.AUTEUR, statut);
    }
}