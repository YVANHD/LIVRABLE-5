package com.objis.cameroun.ucs.domaine;

public class Produit {
	private int idProduit;
	public String nom;
	public String profil;
	public String categorie;
	 
	
	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(int idProduit, String nom, String profil, String categorie) {
		super();
		this.idProduit = idProduit;
		this.nom = nom;
		this.profil = profil;
		this.categorie = categorie;
		 
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
	 
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nom=" + nom + ", profil=" + profil + ", categorie=" + categorie
				  + "]";
	}

}
