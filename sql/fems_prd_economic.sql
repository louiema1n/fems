-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: fems_prd
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='经济出入记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `economic`
--

LOCK TABLES `economic` WRITE;
/*!40000 ALTER TABLE `economic` DISABLE KEYS */;
INSERT INTO `economic` VALUES (6,'其他',2332.62,'2017-11-30 19:45:41','XTZ','初始化记录',1),(7,'其他',3397.73,'2017-11-30 19:46:32','LouieMain','初始化记录',1),(8,'其他',300.00,'2017-11-30 19:49:39','LouieMain','身上现金',1),(9,'工资',4285.00,'2017-11-30 19:50:44','XTZ','助学贷款',2);
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

-- Dump completed on 2017-11-30 20:20:07
