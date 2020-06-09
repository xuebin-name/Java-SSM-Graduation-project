/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : nn_ljfl

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-06-09 22:34:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL,
  `admin_phone` varchar(255) DEFAULT NULL,
  `admin_sex` int(11) DEFAULT NULL,
  `admin_age` int(11) DEFAULT NULL,
  `admin_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '张华', 'zhang123', '15823695246', '1', '25', '陕西');

-- ----------------------------
-- Table structure for `ceshi`
-- ----------------------------
DROP TABLE IF EXISTS `ceshi`;
CREATE TABLE `ceshi` (
  `cs_id` int(11) NOT NULL AUTO_INCREMENT,
  `cs_text` varchar(255) DEFAULT NULL,
  `type_id` int(11) NOT NULL,
  PRIMARY KEY (`cs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ceshi
-- ----------------------------
INSERT INTO `ceshi` VALUES ('1', '木头属于什么垃圾？', '1');
INSERT INTO `ceshi` VALUES ('2', '鱼骨属于什么垃圾？', '1');
INSERT INTO `ceshi` VALUES ('3', '牛仔裤属于什么垃圾', '1');
INSERT INTO `ceshi` VALUES ('4', '玻璃杯属于什么垃圾？', '1');

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `user_address` varchar(255) DEFAULT NULL,
  `rubbis_stuts` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '张三', '1525498563', '2020-04-26 14:11:44', '陕西省', '1');
INSERT INTO `goods` VALUES ('2', 'ss', 'sss', '2020-04-26 13:54:29', '北京市北京市', '1');
INSERT INTO `goods` VALUES ('3', 'ss', 'sss', '2020-04-26 13:55:11', '北京市北京市东城区', '1');
INSERT INTO `goods` VALUES ('4', '张华', '1589634635', '2020-04-26 14:10:01', '山西省太原市小店区', '1');
INSERT INTO `goods` VALUES ('5', '孙晓', '158463463225', '2020-04-26 14:10:57', '浙江省嘉兴市海盐县临海区', '1');
INSERT INTO `goods` VALUES ('6', '孙晓', '158463463225', '2020-05-14 21:46:53', '浙江省嘉兴市海盐县临海区', '1');
INSERT INTO `goods` VALUES ('7', '张小小', '15897562359', '2020-04-25 18:58:12', '北京市北京市东城区', '0');
INSERT INTO `goods` VALUES ('8', '薛斌', '18840437727', '2020-05-14 18:19:13', '山西省长治市襄垣县', '0');
INSERT INTO `goods` VALUES ('9', '薛斌', '18840437727', '2020-05-14 18:22:49', '山西省太原市小店区', '0');
INSERT INTO `goods` VALUES ('10', '薛斌', '18840437727', '2020-05-14 18:23:50', '山西省长治市城区', '0');
INSERT INTO `goods` VALUES ('11', '张明', '18852463524', '2020-05-14 18:28:32', '北京市北京市东城区', '0');
INSERT INTO `goods` VALUES ('12', '张三', '15863556668', '2020-05-15 15:40:37', '山西省长治市襄垣县', '1');
INSERT INTO `goods` VALUES ('14', '薛斌', '18840437727', '2020-05-16 11:04:10', '山西省长治市襄垣县', '1');

-- ----------------------------
-- Table structure for `rubbish`
-- ----------------------------
DROP TABLE IF EXISTS `rubbish`;
CREATE TABLE `rubbish` (
  `rubbish_id` int(11) NOT NULL AUTO_INCREMENT,
  `rubbish_name` varchar(255) DEFAULT NULL,
  `rubbish_title` varchar(255) DEFAULT NULL,
  `type_id` int(11) NOT NULL,
  PRIMARY KEY (`rubbish_id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `rubbish_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `typemodel` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rubbish
-- ----------------------------
INSERT INTO `rubbish` VALUES ('1', '钢笔', '金属制品', '1');
INSERT INTO `rubbish` VALUES ('2', '垃圾袋', '塑料', '2');
INSERT INTO `rubbish` VALUES ('3', '铅笔', '木制', '2');
INSERT INTO `rubbish` VALUES ('4', '木棒', '木制', '1');
INSERT INTO `rubbish` VALUES ('11', '利乐包', '纸质', '1');
INSERT INTO `rubbish` VALUES ('12', '充电电池', '化合物', '2');
INSERT INTO `rubbish` VALUES ('13', '铬镍电池', '有害化合物', '2');
INSERT INTO `rubbish` VALUES ('14', '铅酸电池', '有害化合物', '2');
INSERT INTO `rubbish` VALUES ('15', '蓄电池', '有害化合物', '2');
INSERT INTO `rubbish` VALUES ('16', '药品', '废弃药物', '2');

-- ----------------------------
-- Table structure for `throwclaim`
-- ----------------------------
DROP TABLE IF EXISTS `throwclaim`;
CREATE TABLE `throwclaim` (
  `throw_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_id` int(11) NOT NULL,
  `throw_title` varchar(255) DEFAULT NULL,
  `throw_datils` varchar(255) DEFAULT NULL,
  `throw_prompt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`throw_id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `throwclaim_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `typemodel` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of throwclaim
-- ----------------------------
INSERT INTO `throwclaim` VALUES ('1', '1', null, null, '1、可回收物应轻投轻放，清洁干燥、避免污染；');
INSERT INTO `throwclaim` VALUES ('2', '1', null, null, '2、废纸应尽量平整；');
INSERT INTO `throwclaim` VALUES ('3', '1', null, null, '3、立体包装物请清空内容物，清洁后压扁投放；');
INSERT INTO `throwclaim` VALUES ('4', '1', null, null, '4、有尖锐边角的，应包裹后投放');
INSERT INTO `throwclaim` VALUES ('5', '2', null, null, '1、分类投放有害垃圾是，应注意轻放。');
INSERT INTO `throwclaim` VALUES ('6', '2', null, null, '2、废灯管等易破损的有害垃圾应连带包装或包裹后投放；');
INSERT INTO `throwclaim` VALUES ('7', '2', null, null, '3、废弃药品宜连带包装一并投放；杀虫剂等压力罐装容器，应排空内容物后投放；');
INSERT INTO `throwclaim` VALUES ('8', '2', null, null, '4、在公共场所产生有害垃圾且未发现对应收集容器时，应携带至有害垃圾投放点妥善投放。');
INSERT INTO `throwclaim` VALUES ('9', '3', null, null, '1、湿垃圾投放需破袋处理。盛放湿垃圾的容器，如塑料袋等，在投放时应予去除。');
INSERT INTO `throwclaim` VALUES ('10', '3', null, null, '2、湿垃圾应从产生时就与其他品种垃圾分开收集，投放前尽量沥干水分。');
INSERT INTO `throwclaim` VALUES ('11', '3', null, null, '3、有包装物的湿垃圾应将包装物去除后分类投放，包装无应投放到对应的可回收物或干垃圾收集容器。');
INSERT INTO `throwclaim` VALUES ('12', '4', null, null, '1、禁止混投。');
INSERT INTO `throwclaim` VALUES ('13', '4', null, null, '2、干垃圾应投入干垃圾收集容器，并保持周边环境整洁。');

-- ----------------------------
-- Table structure for `timu`
-- ----------------------------
DROP TABLE IF EXISTS `timu`;
CREATE TABLE `timu` (
  `tm_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_id` int(255) NOT NULL,
  `cs_id` int(11) NOT NULL,
  `ct_state` int(11) NOT NULL,
  PRIMARY KEY (`tm_id`),
  KEY `cs_id` (`cs_id`),
  CONSTRAINT `timu_ibfk_1` FOREIGN KEY (`cs_id`) REFERENCES `ceshi` (`cs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of timu
-- ----------------------------
INSERT INTO `timu` VALUES ('1', '1', '1', '0');
INSERT INTO `timu` VALUES ('2', '3', '2', '0');
INSERT INTO `timu` VALUES ('3', '1', '2', '0');
INSERT INTO `timu` VALUES ('4', '1', '4', '0');

-- ----------------------------
-- Table structure for `typemodel`
-- ----------------------------
DROP TABLE IF EXISTS `typemodel`;
CREATE TABLE `typemodel` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(255) DEFAULT NULL,
  `type_datil` varchar(255) DEFAULT NULL,
  `type_include` varchar(255) DEFAULT NULL,
  `type_k1` varchar(255) DEFAULT NULL,
  `type_k2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of typemodel
-- ----------------------------
INSERT INTO `typemodel` VALUES ('1', '可回收物', '可回收垃圾是指适宜回收、可循环利用的生活废弃物。', '常见包括各类废金属、玻璃瓶、易拉罐、饮料瓶、塑料玩具、书本、报纸、广告单、纸板箱、衣服、床上用品、电子产品等。', null, null);
INSERT INTO `typemodel` VALUES ('2', '有害垃圾', '有害垃圾指废电池、废灯管、废药品、废油漆及其容器等对人体健康或者自然环境造成直接或者潜在危害的生活废弃物。', '常见包括废电池、废荧光灯管、废灯泡、废水银温度计、废油漆桶、过期药品等。', null, null);
INSERT INTO `typemodel` VALUES ('3', '厨余（湿）垃圾', '湿垃圾又称为厨余垃圾、有机垃圾，即易腐垃圾，指食材废料、剩菜剩饭、过期食品、瓜皮果核、花卉绿植、中药药渣等易腐的生物质生活废弃物。', '湿垃圾是居民日常生活及食品加工、饮食服务、单位供餐等活动中产生的垃圾，包括丢弃不用的菜叶、剩菜、剩饭、果皮、蛋壳、茶渣、骨头、动物内脏、鱼鳞、树叶、杂草等，其主要来源为家庭厨房、餐厅、饭店、食堂、市场及其他与食品加工有关的行业。', null, null);
INSERT INTO `typemodel` VALUES ('4', '其他（干）垃圾', '干垃圾即其它垃圾，指除可回收物、有害垃圾、厨余垃圾（湿垃圾）以外的其它生活废弃物。', '其他（干）垃圾包括除砖瓦陶瓷、渣土、卫生间废纸、瓷器碎片等难以回收的废弃物。', null, null);

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_data` datetime DEFAULT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for `way`
-- ----------------------------
DROP TABLE IF EXISTS `way`;
CREATE TABLE `way` (
  `way_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_id` int(11) NOT NULL,
  `way_datils` varchar(255) DEFAULT NULL,
  `way_title` varchar(255) DEFAULT NULL,
  `way_k1` varchar(255) DEFAULT NULL,
  `way_k2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`way_id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `way_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `typemodel` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of way
-- ----------------------------
