package service;

public class Adulte extends Client{

    private String nom;
    private String prenom;
    protected static final Integer prix = 10;

    public Adulte() {
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getPrix(){
        return prix;
    }
}
