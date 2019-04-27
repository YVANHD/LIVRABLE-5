/**
 * 
 */
package com.objis.cameroun.uc.dao;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.objis.cameroun.uc.domaine.Produit;
 
public class DaoImpl implements IDao {
	/*public DaoImpl() {
		super();
		 
	}*/

		// Etape 1 : récupération de la connexion
		Connection cn = ConnectionMYSQL.getInstance();

	public int enregistrerProduitDao(Produit pd) {
		try {

			
			// Etape 2 : Création d'un objet  statement et preparation de la requete
			

			String sql = "insert into `produit`(`nom`,`profil`,`categorie`,`type`,`client`)" 
					+"values (?,?,?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			ps.setString(1, pd.getNom());
			ps.setString(2, pd.getProfil());
			ps.setString(3, pd.getCategorie());
			ps.setString(4, pd.getType());
			ps.setString(5, pd.getClient());
			 
			 
			// Etape 3 : exécution requÃªte
			ps.executeUpdate();
			
			return 1;
						
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
			return 0;
			
		}
	}

	 
	 
	public List<Produit> listProduitsDao(String client, String type, String categorie, String profil) {
		
		 //création d'une collection des Produits
		List<Produit> maListProduit= new ArrayList<Produit>();
	
		try {

			// Etape 1 : récupération de la connexion
			

			// Etape 2 : préparation requete
			
			String sql = "SELECT * FROM produit";
			
			Statement st = cn.createStatement();

			

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				
				//recuperation des valeurs d'une ligne de la table Produit, pour initialiser dans un objet Produit
				Produit pd =  new Produit(0, sql, sql, sql, sql, sql);
				pd.setIdProduit(rs.getInt("idProduit"));
				pd.setNom(rs.getString("nom"));
				pd.setProfil(rs.getString("profil")); 
				pd.setCategorie(rs.getString("categorie"));
				pd.setType(rs.getString("type"));
				pd.setClient(rs.getString("client"));
			 
				 
				
				//ajout de Produit dans List maListProduit
				maListProduit.add(pd); // cette instruction permet d'inser l'objet Produit dans ma liste Produit
				
			}
			
			// Etape 5 : gestion des exceptions et liberation 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		return maListProduit;
		
	}

}
