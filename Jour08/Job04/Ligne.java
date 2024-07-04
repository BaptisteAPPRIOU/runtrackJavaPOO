package Jour08.Job04;

public class Ligne {
    private Commande commande;
    private String article;
    private int quantiteCommande;

    public Ligne(Commande commande, String article, int quantiteCommande) {
        this.commande = commande;
        this.article = article;
        this.quantiteCommande = quantiteCommande;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(int quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }
}
