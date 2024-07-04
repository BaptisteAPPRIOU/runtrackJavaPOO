package Jour08.Job04;

import java.util.Vector;
import java.util.Scanner;

public class Commerciale {
    Vector <Article> articles = new Vector <Article> ();
    Vector <Client> clients = new Vector <Client> ();
    Vector <Commande> commandes = new Vector <Commande> ();
    Vector <Ligne> lignes = new Vector <Ligne> ();

    public void passerCommande(Commande commande) {
        commandes.add(commande);
    }

    public void annulerCommande(Commande commande) {
        commandes.remove(commande);
    }

    public void ajouterArticle(Article article) {
        articles.add(article);
    }

    public void supprimerArticle(Article article) {
        articles.remove(article);
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void supprimerClient(Client client) {
        clients.remove(client);
    }

    public void nettoyerEcran() {
        try {                                                                               // Clear the screen            
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder processBuilder;
            if (os.contains("win")) {
                processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                processBuilder = new ProcessBuilder("clear");
            }
            processBuilder.inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error while clearing the screen.");
        }
    }

    public static void main(String[] args) {
        Commerciale commerciale = new Commerciale();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------Gestion commerciale------------");
            System.out.println("1) Ajouter un article");
            System.out.println("2) Supprimer un article");
            System.out.println("3) Ajouter un client");
            System.out.println("4) Supprimer un client");
            System.out.println("5) Passer une commande");
            System.out.println("6) Annuler une commande");
            System.out.println("0) Quitter");

            System.out.println("Entrez un choix : ");
            String choix = sc.nextLine();

            switch (choix) {
                case "1":
                    System.out.print("Entrez la référence de l'article : ");
                    int ref = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entrez la désignation de l'article : ");
                    String des = sc.nextLine();
                    System.out.print("Entrez le prix unitaire de l'article : ");
                    double pu = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Entrez la quantité en stock de l'article : ");
                    int qte = sc.nextInt();
                    sc.nextLine();
                    Article article = new Article(ref, des, pu, qte);
                    commerciale.ajouterArticle(article);
                    System.out.println("Article ajouté");
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    commerciale.nettoyerEcran();
                    break;

                case "2":
                    System.out.print("Entrez la référence de l'article à supprimer : ");
                    ref = sc.nextInt();
                    sc.nextLine();
                    for (Article a : commerciale.articles) {
                        if (a.getReference() == ref) {
                            commerciale.supprimerArticle(a);
                            System.out.println("Article supprimé");
                            System.out.println("Press Enter to continue...");
                            sc.nextLine();
                            commerciale.nettoyerEcran();
                            break;
                        }
                    }
                    System.out.println("Pas d'article' avec cette référence");
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    commerciale.nettoyerEcran();
                    break;

                case "3":
                    System.out.print("Entrez l'identité du client : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entrez le nom social du client : ");
                    String nomS = sc.nextLine();
                    System.out.print("Entrez l'adresse du client : ");
                    String adresse = sc.nextLine();
                    System.out.print("Entrez le chiffre d'affaire du client : ");
                    double ca = sc.nextDouble();
                    sc.nextLine();
                    Client client = new Client(id, nomS, adresse, ca);
                    commerciale.ajouterClient(client);
                    System.out.println("Client ajouté");
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    commerciale.nettoyerEcran();
                    break;

                case "4":
                    System.out.print("Entrez l'identité du client à supprimer : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    for (Client c : commerciale.clients) {
                        if (c.getIdentite() == id) {
                            commerciale.supprimerClient(c);
                            System.out.println("Client supprimé");
                            System.out.println("Press Enter to continue...");
                            sc.nextLine();
                            commerciale.nettoyerEcran();
                            break;
                        }
                    }
                    System.out.println("Pas de client avec cette identité");
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    commerciale.nettoyerEcran();
                    break;

                case "5":
                    System.out.print("Entrez le numéro de la commande : ");
                    int numC = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entrez la date de la commande : ");
                    String date = sc.nextLine();
                    System.out.print("Entrez le client : ");
                    String clnt = sc.nextLine();
                    Commande commande = new Commande(numC, date, clnt);
                    commerciale.passerCommande(commande);
                    System.out.println("Commande passée");
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    commerciale.nettoyerEcran();
                    break;

                case "6":
                    System.out.print("Entrez la référence de la commande à annuler : ");
                    numC = sc.nextInt();
                    sc.nextLine();
                    for (Commande c : commerciale.commandes) {
                        if (c.getNumeroCommande() == numC) {
                            commerciale.annulerCommande(c);
                            System.out.println("Commande annulée");
                            System.out.println("Press Enter to continue...");
                            sc.nextLine();
                            commerciale.nettoyerEcran();
                            break;
                        }
                    }
                    System.out.println("Pas de commande avec cette référence");
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    commerciale.nettoyerEcran();
                    break;

                case "0":
                    System.out.println("Au revoir");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalide");
                    System.out.println("Press Enter to continue...");
                    sc.nextLine();
                    commerciale.nettoyerEcran();
                    break;
            }
        }
    }
}
