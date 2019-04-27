/**
 * 
 */
package com.objis.cameroun.uc.service;

 

import java.util.List;

import com.objis.cameroun.uc.dao.DaoImpl;
import com.objis.cameroun.uc.dao.IDao;
import com.objis.cameroun.uc.domaine.Produit;
 
public class ServiceImpl implements IService {
	private IDao dao;
	
	public ServiceImpl() {
		this.dao=new DaoImpl();
	}
 
	public int enregistrerProduitService(Produit pd) {
 		return dao.enregistrerProduitDao(pd);
	}
 
	public List<Produit> listProduitsService() {
 		String client = null;
		String type = null;
		String categorie = null;
		String profil = null;
		return dao.listProduitsDao(client, type, categorie, profil);
	}

}
