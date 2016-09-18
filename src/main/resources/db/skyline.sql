/*
Navicat MySQL Data Transfer

Source Server         : skyline
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : skyline

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2016-09-18 13:38:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` char(32) NOT NULL COMMENT '用户Id',
  `user_name` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `register_time` datetime NOT NULL,
  `register_ip` double(255,0) NOT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `last_login_ip` double(255,0) DEFAULT NULL,
  `login_count` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
