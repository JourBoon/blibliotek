import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        System.out.println("=== TP JAVA BIBLIOTHEQUE BOMBOCLAATT ===");

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
                scanner.nextLine();

                switch (choix) {
                    case 1 -> {
                        System.out.print("Titre : "); String titre = scanner.nextLine();
                        System.out.print("Auteur : "); String auteur = scanner.nextLine();
                        if(titre.equals("") || auteur.equals("")){
                            System.out.println("\nVeuillez renseigner le titre et l'auteur.");
                        } else {
                            biblio.addBook(new Livre(titre, auteur));
                        }
                    }
                    case 2 -> biblio.displayCollection();
                    case 3 -> {
                        System.out.print("ID du livre à emprunter : ");
                        biblio.borrowBook(scanner.nextLine());
                    }
                    case 4 -> {
                        System.out.print("ID du livre à retourner : ");
                        biblio.unborrowBook(scanner.nextLine());
                    }
                    case 5 -> {
                        System.out.print("Entrez un titre ou un auteur : ");
                        biblio.findBook(scanner.nextLine());
                    }
                    case 6 -> {
                        quitter = true;
                        System.out.println("Fermeture du système... Au revoir !");
                    }
                    default -> System.out.println("Choix invalide.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez entrer un nombre valide.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
