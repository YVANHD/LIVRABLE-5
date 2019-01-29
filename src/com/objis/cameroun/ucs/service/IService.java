package com.objis.cameroun.ucs.service;

import java.util.List;

import com.objis.cameroun.ucs.domaine.Produit;

public interface IService {
	public int enregistrerProduitService (Produit pd);
	public List<Produit> listProduitsService(String categorie, String profil);
	public List<Produit> rechercheProduitService(String nom);
	public List<Produit> nombreProduitService(String categorie, String profil);
	//void enregistrerProduit(Produit pd);
 
}
