-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: fems_dev
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `economic`
--

DROP TABLE IF EXISTS `economic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `economic` (
  `ecoID` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) NOT NULL COMMENT '类别',
  `money` decimal(10,2) NOT NULL COMMENT '金额',
  `ecoTime` datetime NOT NULL COMMENT '时间',
  `ecoName` varchar(255) NOT NULL COMMENT '出入人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `state` tinyint(4) NOT NULL COMMENT '状态：0-支出；1-收入；2-预支出',
  PRIMARY KEY (`ecoID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='经济出入记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `economic`
--

LOCK TABLES `economic` WRITE;
/*!40000 ALTER TABLE `economic` DISABLE KEYS */;
INSERT INTO `economic` VALUES (1,'工资',6000.00,'2017-11-30 13:31:49','LouieMain','工资',1),(2,'生活费',300.00,'2017-11-30 13:46:45','XTZ','买肉',0),(3,'车内饰',500.00,'2017-11-30 13:47:09','XTZ','车膜',2),(4,'工资2',500.32,'2017-11-30 16:06:31','LouieMain','32',1),(5,'工资3',32.21,'2017-11-30 16:07:28','XTZ','中午饭',0);
/*!40000 ALTER TABLE `economic` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-01 16:44:25
