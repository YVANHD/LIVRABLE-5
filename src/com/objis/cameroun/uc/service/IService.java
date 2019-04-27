/**
 * 
 */
package com.objis.cameroun.uc.service;

import java.util.List;

import com.objis.cameroun.uc.domaine.Produit;

/**
 * @author Menguele
 *
 */
public interface IService {
	public int enregistrerProduitService (Produit pd);
	public List<Produit> listProduitsService();

}
