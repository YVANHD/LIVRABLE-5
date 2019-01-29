package com.objis.cameroun.ucs.service;

import java.util.List;

import com.objis.cameroun.ucs.dao.DaoImpl;
import com.objis.cameroun.ucs.dao.IDao;
import com.objis.cameroun.ucs.domaine.Produit;

public class ServiceImpl implements IService {
	IDao dao;
	
	
	

	public ServiceImpl() {
		dao=new DaoImpl();
	}

	@Override
	public int enregistrerProduitService(Produit pd) {
		
 		return dao.enregistrerProduitDao(pd);
	}

	@Override
	public List<Produit> listProduitsService(String categorie, String profil) {
		dao.listProduitsDao(categorie, profil);
		return null;
	}

	@Override
	public List<Produit> rechercheProduitService(String nom) {
		dao.rechercheProduitDao(nom);	
		return null;
	}

	@Override
	public List<Produit> nombreProduitService(String categorie, String profil) {
		dao.nombreProduitDao(categorie, profil);
 		return null;
	}
	


	 

	 

}
