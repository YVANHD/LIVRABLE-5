package com.objis.cameroun.uc.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ProduitCle extends AbstractTableModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String[] entetes = {"Nom", "Profil","Categorie","Type","Client" };

    private List<Produit> produit;

    public ProduitCle(List<Produit> produit) {
        this.produit = produit;
    }


    public List<Produit> getProduit() {
		return produit;
	}

	public void setProduits(List<Produit> produit) {
		this.produit = produit;
	}



	public int getRowCount(){
		 
       return produit.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // ID
                return produit.get(rowIndex).getIdProduit();

            case 1:
                // Nom
                return produit.get(rowIndex).getNom();
            case 2:
                // Profil
                return produit.get(rowIndex).getProfil();
            case 3:
                // Categorie
                return produit.get(rowIndex).getCategorie();
            case 4:
                // Type
                return produit.get(rowIndex).getType();
            case 5:
                // Client
                return produit.get(rowIndex).getClient();
             
                default:
                throw new IllegalArgumentException();

        }
    }
}
