/*
 Navicat MySQL Backup

 Source Server         : myMysql
 Source Server Version : 50610
 Source Host           : localhost
 Source Database       : prodowjavatest

 Target Server Version : 50610
 File Encoding         : utf-8

 Date: 08/17/2015 15:30:38 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `foo`
-- ----------------------------
DROP TABLE IF EXISTS `foo`;
CREATE TABLE `foo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
