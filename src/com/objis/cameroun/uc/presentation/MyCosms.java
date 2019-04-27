      package com.objis.cameroun.uc.presentation;

  
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyCosms extends JFrame{
 private static final long serialVersionUID = 2602265113547608182L;
 
/*construction de l'interface graphique*/
	public MyCosms() {
		super("UCosmetic");
		setForeground(Color.GREEN);
		setBackground(Color.PINK);
		
		
		
		this.setSize(new Dimension(678, 496));//on a dimensionner la fenetre graphique
		this.setLocationRelativeTo(null); //null correspond au desktop, donc
		//on a centrer la fenetre en plein milieu de l'ecran
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );//on definit le comportement en cas 
		//de clic sur la croix.
		//dispose on close pour liberer l'ensemble des ressources de la fenetre graphique
		
		
		
		/* construction et injection de la barre de menu*/
		this.setJMenuBar(createMenuBar() );
		
		 // Construction et injection de la barre d'outils
        JPanel contentPane = (JPanel) getContentPane();//recuperation du contentPane
        contentPane.setLayout(new BorderLayout()); //diviser la zone en nord, sud, est, ouest, centre
        contentPane.add( this.createToolbar(), BorderLayout.NORTH );
        
     // The content of the window
       // JTree projectTree = new JTree();
        /* JScrollPane leftScrollPane = new JScrollPane( new JTree() );*/
       // projectTree.setPreferredSize( new Dimension( 200, 0 ) );
        
     //  JTextArea textArea = new JTextArea();
      //  JScrollPane rightScrollPane = new JScrollPane( textArea );
        
      
		
		 
		
		 JScrollPane westComponent = new JScrollPane(new JTree());
		 westComponent.setPreferredSize(new Dimension(200, 0));
		contentPane.add(westComponent, BorderLayout.WEST );
		
		 
			 
			 
		 
		// JTextField txtcontent = new JTextField("Edition");
		// txtcontent.setHorizontalAlignment(SwingConstants.TRAILING);
		/*JScrollPane scrollComponent = new JScrollPane(txtcontent); */
		// contentPane.add(txtcontent);
		
	 
		contentPane.add(createRightPanel(), BorderLayout.EAST);
 
		 contentPane.add(new JLabel("La barre de status"), BorderLayout.SOUTH);
		 
		 JDesktopPane desktopPane = new JDesktopPane();
		 getContentPane().add(desktopPane, BorderLayout.CENTER);
	}
	
	 
	 
	
	
/* methode de construction de la barre de menu*/
	
	    public JMenuBar createMenuBar() {
		    // La barre de menu à proprement parler
		JMenuBar menuBar = new JMenuBar();
	 

        	// Définition du menu déroulant "File" et de son contenu
		JMenu mnuFile = new JMenu("Menu");  
		mnuFile.setMnemonic('M');
		
		JMenuItem mnuNew = new JMenuItem("New Produit"); 
		mnuFile.setMnemonic('P');
		mnuNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		mnuNew.setIcon(new ImageIcon("icons/new.png"));  
		
		 
		mnuFile.add(mnuNew);
		
		mnuFile.addSeparator();
		
		
		 JMenuItem mnuOpenFile = new JMenuItem( "Open List ..." );
		 mnuOpenFile.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		ListProduitCle frame = new ListProduitCle();
				frame.setVisible(true);
		 	}
		 });
	        mnuOpenFile.setIcon( new ImageIcon( "icons/open.png" ) );
	        mnuOpenFile.setMnemonic( 'O' );
	        mnuOpenFile.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK) );
	        mnuFile.add(mnuOpenFile);

	        JMenuItem mnuEnregistreProduit = new JMenuItem( "Enregistrer Produit ..." );
	        mnuEnregistreProduit.setIcon( new ImageIcon( "icons/save.png" ) );
	        mnuEnregistreProduit.setMnemonic( 'S' );
	        mnuEnregistreProduit.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK) );
	        mnuEnregistreProduit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EnregistrerProduitList frame = new EnregistrerProduitList();
					frame.setVisible(true);
				}
			});
	        mnuFile.add(mnuEnregistreProduit);

	        JMenuItem mnuSaveFileAs = new JMenuItem( "Save As ..." );
	        mnuSaveFileAs.setIcon( new ImageIcon( "icons/save_as.png" ) );
	        mnuSaveFileAs.setMnemonic( 'A' );
	        mnuFile.add(mnuSaveFileAs);

	        mnuFile.addSeparator();

	        JMenuItem mnuExit = new JMenuItem( "Exit" );
	        mnuExit.setIcon( new ImageIcon( "icons/exit.png" ) );
	        mnuExit.setMnemonic( 'x' );
	        mnuExit.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK) );
	        mnuFile.add(mnuExit);
	        
	        menuBar.add(mnuFile);
	        
	        // Définition du menu déroulant "Edit" et de son contenu
	        JMenu mnuEdit = new JMenu( "Edit" );
	        mnuEdit.setMnemonic( 'E' );
	        
	        JMenuItem mnuUndo = new JMenuItem( "Undo" );
	        mnuUndo.setIcon( new ImageIcon( "icons/undo.png" ) );
	        mnuUndo.setMnemonic( 'U' );
	        mnuUndo.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK) );
	        mnuEdit.add(mnuUndo);
	        
	        JMenuItem mnuRedo = new JMenuItem( "Redo" );
	        mnuRedo.setIcon( new ImageIcon( "icons/redo.png" ) );
	        mnuRedo.setMnemonic( 'R' );
	        mnuRedo.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK) );
	        mnuEdit.add(mnuRedo);
	        
	        mnuEdit.addSeparator();
	        
	        JMenuItem mnuCopy = new JMenuItem( "Copy" );
	        mnuCopy.setIcon( new ImageIcon( "icons/copy.png" ) );
	        mnuCopy.setMnemonic( 'C' );
	        mnuCopy.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK) );
	        mnuEdit.add(mnuCopy);
	        
	        JMenuItem mnuCut = new JMenuItem( "Cut" );
	        mnuCut.setIcon( new ImageIcon( "icons/cut.png" ) );
	        mnuCut.setMnemonic( 't' );
	        mnuCut.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK) );
	        mnuEdit.add(mnuCut);
	        
	        JMenuItem mnuPaste = new JMenuItem( "Paste" );
	        mnuPaste.setIcon( new ImageIcon( "icons/paste.png" ) );
	        mnuPaste.setMnemonic( 'P' );
	        mnuPaste.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK) );
	        mnuEdit.add(mnuPaste);
	        

	        JMenu mnuWindow = new JMenu( "Window" );
	        JMenuItem mnuCascade = new JMenuItem( "Cascade" );
	        
	        mnuWindow.add(  mnuCascade );
	        JMenuItem mnuTileHorizontaly = new JMenuItem( "Tile horizontaly" );
	       
	        mnuWindow.add(  mnuTileHorizontaly );
	        JMenuItem mnuTileVerticaly = new JMenuItem( "Tile verticaly" );
	       
	        mnuWindow.add(  mnuTileVerticaly );
	        JMenuItem mnuIconifyAll = new JMenuItem( "Iconify all" );
	       
	        mnuWindow.add(  mnuIconifyAll );
	        menuBar.add( mnuWindow );


	        menuBar.add(mnuEdit);

	        // Définition du menu déroulant "Help" et de son contenu
	        JMenu mnuHelp = new JMenu( "Help" );
	        mnuHelp.setMnemonic( 'H' );
	        
	        menuBar.add( mnuHelp );
 

			
		 
		 

	return menuBar;
}
	public JToolBar createToolbar() {
		JToolBar Toolbar = new JToolBar();
		
		JButton btnNew = new JButton( new ImageIcon( "icons/new.png") );
        btnNew.setToolTipText( "New File (CTRL+N)" );
      /*  btnNew.addActionListener( this::btnNewListener );*/
        Toolbar.add( btnNew );

        JButton btnSave = new JButton( new ImageIcon( "icons/save.png" ) );
        btnSave.setToolTipText( "Save (CTRL+S)" );
        Toolbar.add( btnSave );

        JButton btnSaveAs = new JButton( new ImageIcon( "icons/save_as.png" ) );
        btnSaveAs.setToolTipText( "Save As..." );
        Toolbar.add( btnSaveAs );

        Toolbar.addSeparator();

        JButton btnCopy = new JButton( new ImageIcon( "icons/copy.png") );
        btnCopy.setToolTipText( "Copy (CTRL+C)" );
        Toolbar.add( btnCopy );

        JButton btnCut = new JButton( new ImageIcon( "icons/cut.png") );
        btnCut.setToolTipText( "Cut (CTRL+X)" );
        Toolbar.add( btnCut );

        JButton btnPaste = new JButton( new ImageIcon( "icons/paste.png") );
        btnPaste.setToolTipText( "Paste (CTRL+V)" );
        Toolbar.add( btnPaste );

        Toolbar.addSeparator();

        JButton btnExit = new JButton( new ImageIcon( "icons/exit.png") );
        btnExit.setToolTipText( "Exit (ALT+F4)" );
        Toolbar.add( btnExit );

        Toolbar.addSeparator();

        // Autres types de composants graphiques
        Toolbar.add( new JButton( new ImageIcon( "icons/aFile.png" ) ) );
       /* toolBar.add( new JCheckBox( "Cochez" ) );*/
        JTextField textField = new JTextField( "Rechercher" );
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        Toolbar.add( textField );

        return Toolbar;
       	}
	
	public JPanel createRightPanel() {
			 
	    	JPanel panel = new JPanel(new GridLayout(4,1) );
	    	//Définition de sa couleur de fond
	    	panel.setBackground(Color.ORANGE);
	    	
			panel.add(new JButton("produits pour bebes et enfants"));
			panel.add(new JButton("soins des cheveux"));
			panel.add(new JButton("produits solaires"));
			panel.add(new JButton("soins du corps"));
			panel.add(new JButton("deodorants et parfums"));
			panel.add(new JButton("maquillage"));
			panel.add(new JButton("soins du visage"));
			panel.add(new JButton("produits d'hygiene dentaire"));

			return panel;
		}
	@SuppressWarnings("unused")
	private void btnNewListener( ActionEvent event ) {
        JOptionPane.showMessageDialog( this, "Button clicked !" );
    }
 

	public static void main(String[] args) throws Exception{
		//appliquer le look nimbus feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());//fournir un lookandfeel particulier à la
		//fenetre le look nimbus
		
		//afficher ma fenetre
		MyCosms mycosm = new MyCosms();//instancier la fenetre
		mycosm.setVisible(true);//afficher la fenetre

	}
}
