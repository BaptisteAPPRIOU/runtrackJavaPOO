package Jour07.Job00;

public class Personne {
    public String nom;
    public String prenom;
    protected String dateNaissance;
    protected String lieuNaissance;
    private String adresse;
    private String telephone;

    public Personne(String nom, String prenom, String dateNaissance, String lieuNaissance, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static void main(String[] args) {
       Personne personne = new Personne("Doe", "John", "01/01/1970", "Paris", "1 rue de Paris", "0123456789");
    }
}
