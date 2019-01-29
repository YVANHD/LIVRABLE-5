package com.objis.cameroun.ucs.dao;

import java.util.List;

import com.objis.cameroun.ucs.domaine.Produit;

public interface IDao {
	public int enregistrerProduitDao (Produit pd);
	public List<Produit> listProduitsDao(String categorie, String profil);
	public List<Produit> rechercheProduitDao(String nom);
	public List<Produit> nombreProduitDao(String categorie, String profil);

}
