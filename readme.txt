		             ***********************DESCRIPTION DE L'APPLICATION******
							
	MyCosm est une application qui permet de reperer immédiatement la presence d'ingredients indesirables dans les produits cosmétiques du Cameroun et d'ailleurs.
	Cette application permettra de réaliser de multiples taches entre autres :
	
			L'accès à l’historique des produits les plus consultés par les utilisateurs dans l'application
			Un utilisateur doit pouvoir choisir un thème pour sa page
			L’inscription de l'utilisateur : il s’agit ici de l’enregistrement du consommateur
  			La génération du profil d’un étudiant après son inscription
			L’application pourra proposer une plateforme pour les échanges entre les experts et les consommateurs
  			L’ administrateur pourra ajouter ou rechercher un produit
			l'utilisateur pourra imprimer la fiche d'un produit
			l'administrateur pourra enregistrer et modifier les produits introduits par les consommateurs dans chaque famille et categories de produit
			l'utilisateur pourra ajouter un nouveau produit.
		 
		
				****************************LES FONCTIONNALITES QUI MARCHENT POUR LE MOMENT******************
								
	Pour le moment, grace à l'application on peut:
		> enregistrer un nouveau produit dans la base de données
		 
		
			***************************LES PRE-REQUIS POUR EXECUTER L'APPLICATION*******************

	1- pour executer cette application, il faut au préalable avoir installé un jdk ou au moins un jre sur son ordinateur
	
	pour le faire, voici les étapes à suivre :
				
		1- Rendez-vous sur la partie Java du site d’Oracle : http://www.oracle.com/technetwork/java
		2- Dans la zone de droite ’software downloads’, cliquez sur le lien ’Java SE’ (pour Java Standard Edition)
		3- Cliquez sur l’icône ’Java’ pour télécharger le JDK
		4- Accepter la licence
		5- De préférence choisir la version la plus récente (dernière sur la liste)
			> si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
			> si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
			> la version 32 bit fonctionne sur un Système Windows 32 bit ou 64 bit.
		6- Cliquez sur le bouton "Enregistrer le fichier". Le téléchargement commence
		7- Double cliquez sur le fichier téléchargé. L’assistant d’installation du JDK se lance
		8- Cliquez sur le bouton "Next" des fenêtre qui vont s'afficher
		9- Au moment d’installer un environnement d’exécution indépendant du JDK, l’assistant vous consulte. Acceptez les options par défaut et cliquez sur "Next"
			NB:  Même si vous supprimez par la suite le répertoire d’installation du JDK (qui contient aussi une JRE), vous pourrez tout de même exécuter des programmes Java sur votre ordinateur
		10- Vous arrivez à l’écran de fin d’installation, qui vous précise que l’installation s’est bien déroulée 
		11- Cliquez sur Close: L’installation du JDK est terminée.

		NB: la version du jdk utilisé pour cette application est la version 8

	2- Avoir un serveur de données MySQL installé sur l'ordinateur ( le demarrer avant l'exécution de l'application)
	
	3- Avoir créeé la base de données "bdcosmetics"

		
		****************************LES ETAPES POUR VOIR LA DOCUMENTATION DE L'APPLICATION************************
								
		> Ouvrir le dossier "projet X"
		> Ouvrir le repertoire "documentation"
		> Double-cliquer sur le fichier "index"
		
								
			**************************LES ETAPES DE L'EXECUTION DE L'APPLICATION **************************
								
	Pour executer l'application, voici les etapes à suivre :
	
		> Si vous etes dans Windows 10:
		
		1- ouvrir le dossier "Projet X"
		2- Dans la barre de taches, cliquer sur "Fichier", puis "Ouvrir Windows PowerShell" et ensuite "Ouvrir Windows PowerShell en tant qu'administrateur" 
		3- tapez la commande 'java -jar Systeme.jar'
		
		> Dans le cas contraire :
		
		1- Ouvrir l'invite de commande de votre ordinateur
		2- Se positioner dans le dossier "Projet X" (commande : 'cd [chemin]/[dossier cible]')
		3- Quand vous etes dans le dossier "Projet X", taper la commande 'java -jar Systeme.jar'
