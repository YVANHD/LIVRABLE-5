/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.7.22 : Database - bdcosmetics
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdcosmetics` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bdcosmetics`;

/*Table structure for table `produit` */

DROP TABLE IF EXISTS `produit`;

CREATE TABLE `produit` (
  `idproduit` int(30) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `profil` varchar(255) DEFAULT NULL,
  `categorie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idproduit`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `produit` */

insert  into `produit`(`idproduit`,`nom`,`profil`,`categorie`) values (4,'gel ','','soins de cheveux'),(5,'savon','enfant','soins du corps');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
