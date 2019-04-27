/**
 * 
 */
package com.objis.cameroun.uc.domaine;

/**
 * @author Menguele
 *
 */
public class Produit {
	private int idProduit;
	public String nom;
	public String profil;
	public String categorie;
	public String type;
	public String client;
	 
	public Produit(int idProduit, String nom, String profil, String categorie, String type, String client) {
		super();
		this.idProduit = idProduit;
		this.nom = nom;
		this.profil = profil;
		this.categorie = categorie;
		this.type = type;
		this.client = client;
	}
	 
	public int getIdProduit() {
		return idProduit;
	}
	 
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	 
	public String getNom() {
		return nom;
	}
	 
	public void setNom(String nom) {
		this.nom = nom;
	}
	 
	public String getProfil() {
		return profil;
	}
	 
	public void setProfil(String profil) {
		this.profil = profil;
	}
	 
	public String getCategorie() {
		return categorie;
	}
	 
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	 
	public String getType() {
		return type;
	}
	 
	public void setType(String type) {
		this.type = type;
	}
	 
	public String getClient() {
		return client;
	}
	 
	public void setClient(String client) {
		this.client = client;
	}
	 
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nom=" + nom + ", profil=" + profil + ", categorie=" + categorie
				+ ", type=" + type + ", client=" + client + "]";
	}
	 
	

}
