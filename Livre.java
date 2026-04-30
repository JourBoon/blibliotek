public class Livre {

    private static int compteur = 1;

    private final String id;
    private final String auteur;
    private final String titre;
    
    private boolean disponible;

    public Livre(String titre, String auteur) {
        this.id = "LIV-" + String.format("%03d", compteur++);
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true; 
    
    public String getId() {
        return id;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String statut = disponible ? "Disponible" : "Emprunté";
        return String.format("[%s] %-20s | %-15s | Statut: %s", 
                             id, titre, auteur, statut);
    }
}