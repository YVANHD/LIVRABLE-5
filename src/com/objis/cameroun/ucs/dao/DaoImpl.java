package com.objis.cameroun.ucs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.objis.cameroun.ucs.domaine.Produit;

public class DaoImpl implements IDao {
	
	
	
	
	public DaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

		// Etape 1 : récupération de la connexion
		Connection cn = ConnectionMYSQL.getInstance();

		 
		public int EnregistrerProduitDao(Produit pd) {
		

			try {

				

				// Etape 2 : Création d'un objet  statement et preparation de la requete
				

				String sql = "insert into `produit`(`nom`,`profil`,`categorie`)" 
						+"values (?,?,?)";
				
				PreparedStatement ps=  cn.prepareStatement(sql);
				ps.setString(1, pd.getNom());
				ps.setString(2, pd.getProfil());
				ps.setString(3, pd.getCategorie());
				 
				 
				 
				
			
				// Etape 3 : exécution requÃªte
				ps.executeUpdate();
				
				return 1;
				
				
				
				// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
			} catch (SQLException e) {
				e.printStackTrace();
				
				return 0;
				
			}
			
	}

		public void modifierProduit(Produit pd) {
			 // TODO Auto-generated method stub
			 
			 try{
			 String sql="UPDATE produit SET nom = ?, profil = ?, categorie=?";
			 
			 PreparedStatement ps = cn.prepareStatement(sql);
			 
			 
			 ps.setString(1, pd.getNom());
				ps.setString(2, pd.getProfil());
				ps.setString(3, pd.getCategorie());
				 
			 
			 int res = ps.executeUpdate();
			 
			 if(res > 0){
			 System.out.println("L'Enregistrement d'un Produit est Modifié avec succès");
			 }
			 
			 }
			 catch(SQLException e){
			 e.printStackTrace(); 
			 }
			 }
		public void supprimerProduit(int id) {
			 // TODO Auto-generated method stub
			Produit pd = new Produit();
			 pd.setIdProduit(id);
			 try{
			 
			 String sql="DELETE FROM produit WHERE idProduit = ? "; 
			 PreparedStatement pst = cn.prepareStatement(sql);
			 pst.setLong(1, pd.getIdProduit());
			 
			 int res = pst.executeUpdate();
			 
			 if(res > 0){
			 System.out.println("Produit suprimmé succès...");
			 }
			 
			 }
			 catch(SQLException e){
			 e.printStackTrace();
			 }
		}
		
		 
		public List<Produit> listProduitsDao() {


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
					
					//recuperation des valeurs d'une ligne de la table agriculteur, pour initialiser dans un objet eleve
					Produit pd =  new Produit();
					pd.setIdProduit(rs.getInt("idProduit"));
					pd.setNom(rs.getString("nom"));
					pd.setProfil(rs.getString("profil"));
					pd.setCategorie(rs.getString("categorie"));
				 
					 
					
					//ajout de Produit dans List maListProduit
					maListProduit.add(pd); // cette instruction permet d'inser l'objet Produit dans ma liste Produit
					
				}
				
				// Etape 5 : gestion des exceptions et liberation 'automatique' des ressources
			} catch (SQLException e) {
				e.printStackTrace();
				
			} 
			
			return maListProduit;
			
		}

	


	 
	public List<Produit> listProduitsDao(String categorie, String profil) {
 		return null;
	}

	 
	public List<Produit> rechercheProduitDao(String nom) {
 		return null;
	}

	 
	public List<Produit> nombreProduitDao(String categorie, String profil) {
 		return null;
	}

	 
	public int enregistrerProduitDao(Produit pd) {
		

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet  statement et preparation de la requete
			

			String sql = "insert into `produit`(`nom`,`profil`,`categorie`)"+"values (?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			ps.setString(1, pd.getNom());
			ps.setString(2, pd.getProfil());
			ps.setString(3, pd.getCategorie());
			
			// Etape 3 : exécution requête
			ps.executeUpdate();			
			return 1;
			
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
			return 0;
		} 
	
	}

	 
	public List<Produit> getListProduitsDao(String categorie, String profil) {
		

        //création d'une collection de la collection des produits
		List<Produit> maListproduit= new ArrayList<Produit>();
	
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			
			String sql = "SELECT * FROM produit ";
			
			Statement st = cn.createStatement();

			

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				//recuperation des valeurs d'une ligne de la table produit, pour initialiser dans un objet produit
				Produit produit =  new Produit(0, sql, sql, sql);
				produit.setIdProduit(rs.getInt("id"));
				produit.setNom(rs.getString("nom"));
				produit.setProfil(rs.getString("profil"));
				produit.setCategorie(rs.getString("categorie"));
				 
 				
				//ajout de Produit dans List maListProduit
				maListproduit.add(produit); // cette instruction permet d'inserrerl'objet produit dans ma liste produit
				
			}
			
			// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		return maListproduit;
		
	}

	 
	public List<Produit> rechercheProduitDao1(String nom) {
		

        //création d'une collection de la collection des Produits
		List<Produit> rechPd= new ArrayList<Produit>();
	
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			
			String sql = "SELECT * FROM produit ";
			
			Statement st = cn.createStatement();

			

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				//recuperation des valeurs d'une ligne de la table produit, pour initialiser dans un objet produit
				Produit pd =  new Produit(0, sql, sql, sql);
				pd.setIdProduit(rs.getInt("id"));
				pd.setNom(rs.getString("nom"));
				pd.setProfil(rs.getString("profil"));
				pd.setCategorie(rs.getString("categorie"));
				 
				 
				
				//ajout du produit dans List maListProduit
				rechPd.add(pd); // cette instruction permet d'inserrerl'objet produit dans ma liste produit
				
			}
			
			// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		return rechPd;
		
	}
	 
	public List<Produit> nombreProduitDao() {
		

        //création d'une collection des produits
		List<Produit> nbPd= new ArrayList<Produit>();
	
		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			
			String sql = "SELECT * FROM produit ";
			
			Statement st = cn.createStatement();

			

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				//recuperation des valeurs d'une ligne de la table eleve, pour initialiser dans un objet eleve
				Produit pd =  new Produit(0, sql, sql, sql);
				pd.setIdProduit(rs.getInt("id"));
				pd.setNom(rs.getString("nom"));
				pd.setProfil(rs.getString("profil"));
				pd.setCategorie(rs.getString("categorie"));
			 
				nbPd.add(pd);
				
			}
			
			// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		return nbPd;
		
	}

}
