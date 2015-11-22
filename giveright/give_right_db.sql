CREATE DATABASE  IF NOT EXISTS `give_right_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `give_right_db`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: give_right_db
-- ------------------------------------------------------
-- Server version	5.6.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `idAccount` int(11) NOT NULL AUTO_INCREMENT,
  `accountType` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `timestamp` datetime DEFAULT NULL,
  PRIMARY KEY (`idAccount`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (2,0,'alreinz','1234','lorenzdiz@gmail.com','2015-11-21 00:00:00'),(3,0,'arneil','1234','arneil@gmail.com','2015-11-22 00:00:00'),(4,0,'DLSU','DLSU1234','dlsu@gmail.com','2015-11-22 00:00:00'),(6,1,'gawadkalinga','GK1234','gk@gmail.com','2015-11-22 00:00:00');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `batch`
--

DROP TABLE IF EXISTS `batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batch` (
  `idBatch` int(11) NOT NULL AUTO_INCREMENT,
  `idReliefOperation` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `dateDelivered` datetime DEFAULT NULL,
  `batchNumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`idBatch`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
INSERT INTO `batch` VALUES (1,1,'Ongoing',NULL,1);
/*!40000 ALTER TABLE `batch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `beneficiary`
--

DROP TABLE IF EXISTS `beneficiary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `beneficiary` (
  `idbeneficiary` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(45) DEFAULT NULL,
  `province` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `familyCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`idbeneficiary`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `beneficiary`
--

LOCK TABLES `beneficiary` WRITE;
/*!40000 ALTER TABLE `beneficiary` DISABLE KEYS */;
INSERT INTO `beneficiary` VALUES (1,'6','Leyte','Tacloban',10000);
/*!40000 ALTER TABLE `beneficiary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation`
--

DROP TABLE IF EXISTS `donation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation` (
  `iddonation` int(11) NOT NULL,
  `idVolunteer` int(11) DEFAULT NULL,
  `idBatch` int(11) DEFAULT NULL,
  `idreliefoperation` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `dateDonated` date DEFAULT NULL,
  `timestamp` date DEFAULT NULL,
  PRIMARY KEY (`iddonation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation`
--

LOCK TABLES `donation` WRITE;
/*!40000 ALTER TABLE `donation` DISABLE KEYS */;
INSERT INTO `donation` VALUES (1,1,1,2,'1',1,'Donated','2015-11-22',NULL),(2,1,1,2,'1',1,'Donated',NULL,NULL);
/*!40000 ALTER TABLE `donation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donationrequest`
--

DROP TABLE IF EXISTS `donationrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donationrequest` (
  `iddonationrequest` int(11) NOT NULL,
  `idreliefoperation` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `quantity` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddonationrequest`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donationrequest`
--

LOCK TABLES `donationrequest` WRITE;
/*!40000 ALTER TABLE `donationrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `donationrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organizer`
--

DROP TABLE IF EXISTS `organizer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organizer` (
  `idorganizer` int(11) NOT NULL AUTO_INCREMENT,
  `idaccount` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `contactNumber1` varchar(45) DEFAULT NULL,
  `contactNumber2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idorganizer`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organizer`
--

LOCK TABLES `organizer` WRITE;
/*!40000 ALTER TABLE `organizer` DISABLE KEYS */;
INSERT INTO `organizer` VALUES (1,6,'Gawad Kalinga','123456123','');
/*!40000 ALTER TABLE `organizer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reliefoperation`
--

DROP TABLE IF EXISTS `reliefoperation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reliefoperation` (
  `idreliefoperation` int(11) NOT NULL AUTO_INCREMENT,
  `idbeneficiary` int(11) DEFAULT NULL,
  `idOrganizer` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `locationLong` double DEFAULT NULL,
  `locationLat` double DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `province` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idreliefoperation`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reliefoperation`
--

LOCK TABLES `reliefoperation` WRITE;
/*!40000 ALTER TABLE `reliefoperation` DISABLE KEYS */;
INSERT INTO `reliefoperation` VALUES (2,1,1,'Yolanda Goods','2015-01-23',NULL,'Ongoing',10,5,'NCR','NCR','Makati City');
/*!40000 ALTER TABLE `reliefoperation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volunteer`
--

DROP TABLE IF EXISTS `volunteer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `volunteer` (
  `idVolunteer` int(11) NOT NULL AUTO_INCREMENT,
  `idAccount` int(11) DEFAULT NULL,
  `volunteerType` int(11) DEFAULT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `organizationName` varchar(45) DEFAULT NULL,
  `contactNumber1` varchar(45) DEFAULT NULL,
  `contactNumber2` varchar(45) DEFAULT NULL,
  `region` varchar(45) DEFAULT NULL,
  `province` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`idVolunteer`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteer`
--

LOCK TABLES `volunteer` WRITE;
/*!40000 ALTER TABLE `volunteer` DISABLE KEYS */;
INSERT INTO `volunteer` VALUES (1,2,0,'Albert Lorenz','Dizon','LSCS','09173171215',NULL,'NCR','NCR','Makati','1993-01-15'),(2,3,0,'Arneil','Leonin',NULL,'123456','','NCR','NCR','Quezon City','0003-01-01'),(3,4,1,NULL,NULL,'De La Salle University','12345','','NCR','NCR','Manila City','0002-12-31');
/*!40000 ALTER TABLE `volunteer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volunteerrequest`
--

DROP TABLE IF EXISTS `volunteerrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `volunteerrequest` (
  `idvolunteerrequest` int(11) NOT NULL AUTO_INCREMENT,
  `idreliefoperation` int(11) DEFAULT NULL,
  `task` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idvolunteerrequest`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteerrequest`
--

LOCK TABLES `volunteerrequest` WRITE;
/*!40000 ALTER TABLE `volunteerrequest` DISABLE KEYS */;
INSERT INTO `volunteerrequest` VALUES (1,2,'Packaging','Needed');
/*!40000 ALTER TABLE `volunteerrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volunteerwork`
--

DROP TABLE IF EXISTS `volunteerwork`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `volunteerwork` (
  `idvolunteerwork` int(11) NOT NULL AUTO_INCREMENT,
  `idVolunteer` int(11) DEFAULT NULL,
  `idReliefOperation` int(11) DEFAULT NULL,
  `task` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `dateCompleted` date DEFAULT NULL,
  `timestamp` date DEFAULT NULL,
  PRIMARY KEY (`idvolunteerwork`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteerwork`
--

LOCK TABLES `volunteerwork` WRITE;
/*!40000 ALTER TABLE `volunteerwork` DISABLE KEYS */;
INSERT INTO `volunteerwork` VALUES (1,1,NULL,'Packaging','Completed','2015-11-22',NULL);
/*!40000 ALTER TABLE `volunteerwork` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-22 11:45:49
