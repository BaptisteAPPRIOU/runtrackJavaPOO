package Jour08.Job04;

public class Commande {
    private int numeroCommande;
    private String dateCommande;
    private String client;

    public Commande(int numeroCommande, String dateCommande, String client) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
