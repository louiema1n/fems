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
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `prjid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `prjname` varchar(255) NOT NULL COMMENT '项目名称',
  `phase` varchar(255) NOT NULL COMMENT '阶段',
  `mainwork` varchar(255) NOT NULL COMMENT '主要工作',
  `requirement` varchar(255) NOT NULL COMMENT '具体要求',
  `leader` varchar(255) NOT NULL COMMENT '负责人',
  `assistant` varchar(255) DEFAULT NULL COMMENT '协助人',
  `reviewer` varchar(255) DEFAULT NULL COMMENT '审核人',
  `strtime` date DEFAULT NULL COMMENT '预计开始时间',
  `etoc` date DEFAULT NULL COMMENT 'Estimated Time Of Completion预计完成时间',
  `endtime` date DEFAULT NULL COMMENT '实际完成时间',
  `state` int(11) NOT NULL COMMENT '状态',
  `remark` varchar(20000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`prjid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='项目管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'剑河县人民医院病理科合作共建','沟通','与医院负责人、科室负责人、业务员沟通了解相关共建事宜','了解病理科人员及资质情况','罗雨','付正乾','庞敏','2017-12-01','2017-12-31',NULL,1,'1'),(2,'剑河县人民医院病理科合作共建','沟通','与医院负责人、科室负责人、业务员沟通了解相关共建事宜','了解科室仪器设备情况','罗雨','付正乾','庞敏','2017-11-17','2017-12-31',NULL,1,'2'),(3,'剑河县人民医院病理科合作共建','沟通','与医院负责人、科室负责人、业务员沟通了解相关共建事宜','掌握科室用地面积、网络、水电等基础设施情况','罗雨','付正乾','庞敏','2017-10-12','2017-12-31','2017-12-01',1,'');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
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
