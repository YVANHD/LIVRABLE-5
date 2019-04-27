package com.objis.cameroun.uc.presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.uc.domaine.Produit;
import com.objis.cameroun.uc.service.IService;
import com.objis.cameroun.uc.service.ServiceImpl;


public class EnregistrerProduitList extends JFrame {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	//private JTextField familletextField;
	 

	/**
	 * Create the frame.
	 */
	public EnregistrerProduitList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\israel\\Desktop\\Rose-White-1-icon.png"));
		setTitle("Enregistrer un produit");
		setBounds(100, 100, 692, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);//Définition de sa couleur de fond
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 0, 130));
		panel.setBounds(220, 0, 456, 370);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(148, 81, 254, 28);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 27, 254, 28);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 139, 254, 28);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JButton button = new JButton("Enregistrer");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Recupératio des valeurs saisies par l utilisayeur
				String nom = textField_1.getText();
				String profil = textField.getText();
				String categorie = textField_2.getText();
				String type = textField_3.getText();
				String client = textField_4.getText();
				 
				
				// Création d'un Objet produit et initialisation de ses attributs.
				Produit produit = new Produit(0, nom, profil, categorie, type, client);
				
				produit.setNom(nom);
				produit.setProfil(profil);
				produit.setCategorie(categorie);
				produit.setType(type);
				produit.setClient(client);
				
				
				// Enregistrement de l'objet Produit dans la BD
				
				//Appel de couche Service
				
				IService service = new ServiceImpl();
				
				// Appel de methode enregisterProduit de la couhe Service
				
				int status;
				status = service.enregistrerProduitService(produit);
					
				  
				  if(status == 1) {
					  JOptionPane.showMessageDialog(null, "Produit  " + produit.getNom() + 
							  "enregistré dans la BD!");
					  
					  textField_1.setText("");
					  textField.setText("");
					  textField_2.setText("");
					  textField_3.setText("");
					  textField_4.setText("");
					   
					  
				  }else {
					  JOptionPane.showMessageDialog(null, 
							  "Erreur lors de l'enregistrement du Produit!!! ");
				  }
				
				
				service.enregistrerProduitService(produit);
				
				
				
			}
		});
		button.setBounds(241, 312, 89, 23);
		panel.add(button);
			 
		button.setBackground(new Color(148, 0, 211));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(230, 295, 161, 28);
		panel.add(button);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 192, 254, 28);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblNom = new JLabel("NOM");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setBounds(33, 20, 108, 35);
		panel.add(lblNom);
		
		JLabel lblProfil = new JLabel("PROFIL");
		lblProfil.setForeground(new Color(255, 255, 255));
		lblProfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfil.setBounds(33, 78, 108, 35);
		panel.add(lblProfil);
		
		JLabel lblCatgorie = new JLabel("CATEGORIE");
		lblCatgorie.setForeground(new Color(255, 255, 255));
		lblCatgorie.setHorizontalAlignment(SwingConstants.CENTER);
		lblCatgorie.setBounds(33, 136, 105, 35);
		panel.add(lblCatgorie);
		
		JLabel lblType = new JLabel("TYPE");
		lblType.setForeground(new Color(255, 255, 255));
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setBounds(37, 189, 99, 35);
		panel.add(lblType);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(148, 243, 254, 28);
		panel.add(textField_4);
		
		JLabel lblClient = new JLabel("CLIENT");
		lblClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblClient.setForeground(Color.WHITE);
		lblClient.setBounds(33, 236, 99, 35);
		panel.add(lblClient);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 220, 370);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_4 = new JLabel(" ");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setIcon(new ImageIcon("C:\\Users\\israel\\Desktop\\fbk\\drink.jpg"));
		label_4.setBackground(new Color(192, 192, 192));
		label_4.setBounds(0, 0, 220, 371);
		panel_1.add(label_4);
		
		
		 
				
	}
}
	 