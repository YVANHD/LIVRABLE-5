package com.objis.cameroun.uc.dao;

import java.util.List;

import com.objis.cameroun.uc.domaine.Produit;

public interface IDao {
	public int enregistrerProduitDao (Produit pd);
	public List<Produit> listProduitsDao(String client, String type,String categorie, String profil);

}
