package com.objis.cameroun.ucs.presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.ucs.domaine.Produit;
import com.objis.cameroun.ucs.service.IService;
import com.objis.cameroun.ucs.service.ServiceImpl;


public class EnregistrerProduitList extends JFrame {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomTextField;
	private JTextField categorieTextField;
	private JTextField profilTextField;
	 

	/**
	 * Create the frame.
	 */
	public EnregistrerProduitList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\israel\\Desktop\\Rose-White-1-icon.png"));
		setTitle("Enregistrer un produit");
		setBounds(100, 100, 400, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);//Définition de sa couleur de fond
		contentPane.setBackground(Color.lightGray);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Nom:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(15, 16, 104, 29);
		contentPane.add(lblNewLabel);
		
		nomTextField = new JTextField();
		nomTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		nomTextField.setBounds(129, 16, 215, 39);
		contentPane.add(nomTextField);
		nomTextField.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Profil :");
		lblPrnom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrnom.setBounds(11, 74, 103, 46);
		contentPane.add(lblPrnom);
		
		JLabel lblDomaine = new JLabel("Categorie :");
		lblDomaine.setHorizontalAlignment(SwingConstants.CENTER);
		lblDomaine.setBounds(15, 134, 99, 46);
		contentPane.add(lblDomaine);
		
		categorieTextField = new JTextField();
		categorieTextField.setFont(new Font("Times New Roman", Font.BOLD, 17));
		categorieTextField.setBounds(129, 134, 215, 39);
		contentPane.add(categorieTextField);
		categorieTextField.setColumns(10);
		
	 
		
		 
		
		JButton btnNewButton = new JButton("Enregistrer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//RecupÃ©ration des valeurs saisies par l'utilisateur
				String nom = nomTextField.getText();
				String profil = profilTextField.getText();
				String categorie = categorieTextField.getText();
				 
		 
				
				// Création d'un objet Produit et initialisation de ses attributs
				Produit pd = new Produit();
				pd.setNom(nom);
				pd.setProfil(profil);
				pd.setCategorie(categorie);
				 
				 
				// Appel de la couche service
				IService service = new ServiceImpl();
				
				// Enregistrement de l'objet Produit dans la BD via la couche service
				int status;
				status = service.enregistrerProduitService(pd);
				
				if(status == 1) {
					  JOptionPane.showMessageDialog(null, "Produit " + pd.getNom() + 
							  "enregistrer dans la BD!");
					  
					  nomTextField.setText("");
					  profilTextField.setText("");
					  categorieTextField.setText("");
					  
					  
					  
				  }else {
					  JOptionPane.showMessageDialog(null, 
							  "Erreur lors de l'enregistrement du produit /n Reessayez svp ");
				  }
			}
		});
		btnNewButton.setBounds(229, 229, 115, 29);
		contentPane.add(btnNewButton);
		
		profilTextField = new JTextField();
		profilTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		profilTextField.setBounds(129, 78, 215, 39);
		contentPane.add(profilTextField);
		profilTextField.setColumns(10);
	}
}
