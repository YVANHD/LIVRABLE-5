package com.objis.cameroun.uc.presentation;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.uc.domaine.Produit;
import com.objis.cameroun.uc.domaine.ProduitCle;
import com.objis.cameroun.uc.service.IService;
import com.objis.cameroun.uc.service.ServiceImpl;
import java.awt.Color;

public class ListProduitCle extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private ProduitCle produitCle;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ListProduitCle() {
		setTitle("Produits Cosm\u00E9tiques");
		setBounds(100, 100, 459, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		JLabel ListProduit = new JLabel("Liste des Produits");
		ListProduit.setBounds(125, 11, 140, 14);
		contentPane.add(ListProduit);
		
		
		//appel de la couche service
		
		IService service = new ServiceImpl();
		
		// Appel de methode ListAgricultea couche serviceursService de l
		
		List<Produit> produits;
		produits = service.listProduitsService();

	    produitCle = new ProduitCle(produits);
		
		table = new JTable(produitCle);
		table.setBounds(10, 262, 414, -200);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBackground(new Color(255, 215, 0));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
	}
}
