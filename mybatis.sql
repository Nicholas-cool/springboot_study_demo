/*
Navicat MySQL Data Transfer

Source Server         : mysql_connect
Source Server Version : 80036
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 80036
File Encoding         : 65001

Date: 2024-05-27 13:25:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int NOT NULL,
  `department_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('101', '技术部');
INSERT INTO `department` VALUES ('102', '销售部');
INSERT INTO `department` VALUES ('103', '售后部');
INSERT INTO `department` VALUES ('104', '后期部');
INSERT INTO `department` VALUES ('105', '运营部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `last_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gender` int NOT NULL,
  `department` int NOT NULL,
  `birth` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1008 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1001', '张三', '2488393@qq.com', '1', '101', '2024-05-01 20:28:28');
INSERT INTO `employee` VALUES ('1002', '李四', '2323232@qq.com', '1', '102', '2024-03-12 20:29:08');
INSERT INTO `employee` VALUES ('1003', '王五', '2392924@gmail.com', '0', '103', '2023-11-29 20:29:40');
INSERT INTO `employee` VALUES ('1004', 'Mike', '2323233@outlook.com', '1', '104', '2024-05-16 20:30:05');
INSERT INTO `employee` VALUES ('1005', 'Little', '2323fh3@126.com', '0', '105', '2024-03-28 20:30:34');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `pwd` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Little', '13234322');
INSERT INTO `user` VALUES ('2', 'Tom', '82903111');
INSERT INTO `user` VALUES ('5', '小王', '1212');
INSERT INTO `user` VALUES ('33', '小米', '123456');
