package edu.esprit.entities;


import edu.esprit.enums.TypeCategorie;
import java.sql.Timestamp;
import java.util.Objects;

public class Produit {
    private int id_produit;
    private User user;
    private String nom_produit;
    private String image_produit;
    private double prix_produit;
    private String description_produit;
    private boolean disponibilite;
    private TypeCategorie categ_produit;
    private int stock_produit;
    private Timestamp d_publication_produit;

    public Produit(){}


    public Produit(int id_produit, User user, String nom_produit, String image_produit, double prix_produit, String description_produit, boolean disponibilite, TypeCategorie categ_produit, int stock_produit, Timestamp d_publication_produit) {
        this.id_produit = id_produit;
        this.user = user;
        this.nom_produit = nom_produit;
        this.image_produit = image_produit;
        this.prix_produit = prix_produit;
        this.description_produit = description_produit;
        this.disponibilite = disponibilite;
        this.categ_produit = categ_produit;
        this.stock_produit = stock_produit;
        this.d_publication_produit = d_publication_produit;
    }

    public Produit(User user, String nom_produit, String image_produit, double prix_produit, String description_produit, boolean disponibilite, TypeCategorie categ_produit, int stock_produit, Timestamp d_publication_produit) {
        this.user = user;
        this.nom_produit = nom_produit;
        this.image_produit = image_produit;
        this.prix_produit = prix_produit;
        this.description_produit = description_produit;
        this.disponibilite = disponibilite;
        this.categ_produit = categ_produit;
        this.stock_produit = stock_produit;
        this.d_publication_produit = d_publication_produit;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public String getImage_produit() {
        return image_produit;
    }

    public void setImage_produit(String image_produit) {
        this.image_produit = image_produit;
    }

    public double getPrix_produit() {
        return prix_produit;
    }

    public void setPrix_produit(double prix_produit) {
        this.prix_produit = prix_produit;
    }

    public String getDescription_produit() {
        return description_produit;
    }

    public void setDescription_produit(String description_produit) {
        this.description_produit = description_produit;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public TypeCategorie getCateg_produit() {
        return categ_produit;
    }

    public void setCateg_produit(TypeCategorie categ_produit) {
        this.categ_produit = categ_produit;
    }

    public int getStock_produit() {
        return stock_produit;
    }

    public void setStock_produit(int stock_produit) {
        this.stock_produit = stock_produit;
    }

    public java.sql.Timestamp getD_publication_produit() {
        return d_publication_produit;
    }

    public void setD_publication_produit(Timestamp d_publication_produit) {
        this.d_publication_produit = d_publication_produit;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "user=" + user +
                ", nom_produit='" + nom_produit + '\'' +
                ", image_produit='" + image_produit + '\'' +
                ", prix_produit=" + prix_produit +
                ", description_produit='" + description_produit + '\'' +
                ", disponibilite=" + disponibilite +
                ", categ_produit=" + categ_produit +
                ", stock_produit=" + stock_produit +
                ", d_publication_produit=" + d_publication_produit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return id_produit == produit.id_produit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_produit);
    }

}
