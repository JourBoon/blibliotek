import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        System.out.println("=== TP JAVA BIBLIOTEK BOMBOCLAAT ===");

        while (!quitter) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher la liste des livres");
            System.out.println("3. Emprunter un livre");
            System.out.println("4. Retourner un livre");
            System.out.println("5. Rechercher un livre (Titre/Auteur)");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");

            try {
                int choix = scanner.nextInt();
                scanner.nextLine(); // Consommer le retour à la ligne

                switch (choix) {
                    case 1 -> {
                        System.out.print("ID : "); String id = scanner.nextLine();
                        System.out.print("Titre : "); String titre = scanner.nextLine();
                        System.out.print("Auteur : "); String auteur = scanner.nextLine();
                        biblio.ajouterLivre(new Livre(id, titre, auteur));
                    }
                    case 2 -> biblio.afficherLivres();
                    case 3 -> {
                        System.out.print("ID du livre à emprunter : ");
                        biblio.emprunterLivre(scanner.nextLine());
                    }
                    case 4 -> {
                        System.out.print("ID du livre à retourner : ");
                        biblio.retournerLivre(scanner.nextLine());
                    }
                    case 5 -> {
                        System.out.print("Entrez un titre ou un auteur : ");
                        biblio.rechercherLivre(scanner.nextLine());
                    }
                    case 6 -> {
                        quitter = true;
                        System.out.println("Fermeture du système... Au revoir !");
                    }
                    default -> System.out.println("❌ Choix invalide.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Erreur : Veuillez entrer un nombre valide.");
                scanner.nextLine(); // Nettoyer le tampon
            }
        }
        scanner.close();
    }
}
