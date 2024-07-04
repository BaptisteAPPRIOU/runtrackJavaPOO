package Jour08.Job04;

public class Article {
    private int reference;
    private String designation;
    private double prixUnitaire;
    private int quantitestock;

    public Article(int reference, String designation, double prixUnitaire, int quantitestock) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.quantitestock = quantitestock;
    }
    
    public Article(Article a) {
        this.reference = a.reference;
        this.designation = a.designation;
        this.prixUnitaire = a.prixUnitaire;
        this.quantitestock = a.quantitestock;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantitestock() {
        return quantitestock;
    }

    public void setQuantitestock(int quantitestock) {
        this.quantitestock = quantitestock;
    }

    public void affiche() {
        System.out.println("Reference: " + reference);
        System.out.println("Designation: " + designation);
        System.out.println("Prix unitaire: " + prixUnitaire);
        System.out.println("Quantite en stock: " + quantitestock);
    }
}
