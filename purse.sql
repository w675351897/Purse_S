/*
 Navicat Premium Data Transfer

 Source Server         : local_DB
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : purse

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 26/12/2019 21:22:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Uid` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '可以丢弃',
  `Account_TypeId` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '交易种类',
  `Account_Price` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Account_PL` varchar(11) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '1' COMMENT 'Statement of profit or loss',
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `DeleteStauts` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for account_000100
-- ----------------------------
DROP TABLE IF EXISTS `account_000100`;
CREATE TABLE `account_000100`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Uid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Account_TypeId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易种类',
  `Account_Price` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Account_PL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1' COMMENT 'Statement of profit or loss',
  `Account_Date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `DeleteStauts` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除状态',
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for account_admin
-- ----------------------------
DROP TABLE IF EXISTS `account_admin`;
CREATE TABLE `account_admin`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Uid` int(255) NULL DEFAULT NULL,
  `Account_TypeId` int(255) NULL DEFAULT NULL COMMENT '交易种类',
  `Account_Price` double(255, 2) NOT NULL,
  `Account_PL` int(11) NOT NULL DEFAULT 1 COMMENT 'Statement of profit or loss',
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `DeleteStauts` int(255) NULL DEFAULT NULL COMMENT '删除状态',
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_admin
-- ----------------------------
INSERT INTO `account_admin` VALUES (1, 1, 1, 123.00, 1, '10/01', 0);
INSERT INTO `account_admin` VALUES (2, 2, 2, 222.00, 0, '10/24', 0);

-- ----------------------------
-- Table structure for account_living
-- ----------------------------
DROP TABLE IF EXISTS `account_living`;
CREATE TABLE `account_living`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Uid` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT '0' COMMENT 'Uid=0，表示操作用户为本账户。',
  `Account_TypeId` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '交易种类',
  `Account_Price` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Account_PL` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '-' COMMENT 'Statement of profit or loss\r\n正负支出',
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `DeleteStauts` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_living
-- ----------------------------
INSERT INTO `account_living` VALUES (7, '0', '1', '614', '+', '2019-12-01', '0');
INSERT INTO `account_living` VALUES (8, '9', '2', '118', '-', '2019-12-01', '0');
INSERT INTO `account_living` VALUES (9, '0', '3', '108', '-', '2019-12-02', '0');
INSERT INTO `account_living` VALUES (10, '0', '4', '146', '-', '2019-12-01', '0');
INSERT INTO `account_living` VALUES (11, '0', '5', '41', '-', '2019-12-03', '0');
INSERT INTO `account_living` VALUES (12, '0', '6', '16', '-', '2019-12-02', '0');
INSERT INTO `account_living` VALUES (13, '0', '7', '16', '-', '2019-12-05', '0');
INSERT INTO `account_living` VALUES (14, '0', '8', '12', '-', '2019-12-09', '0');
INSERT INTO `account_living` VALUES (15, '0', '9', '25', '-', '2019-12-11', '0');

-- ----------------------------
-- Table structure for account_living01
-- ----------------------------
DROP TABLE IF EXISTS `account_living01`;
CREATE TABLE `account_living01`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Price` double(255, 2) NOT NULL,
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Account_PL` int(11) NOT NULL DEFAULT 1 COMMENT 'Statement of profit or loss',
  `DeleteStauts` int(255) NULL DEFAULT NULL COMMENT '删除状态',
  `Account_Uid` int(255) NULL DEFAULT 4,
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_living01
-- ----------------------------
INSERT INTO `account_living01` VALUES (1, 500.00, '2019-10-24', 0, 0, 4);

-- ----------------------------
-- Table structure for account_team
-- ----------------------------
DROP TABLE IF EXISTS `account_team`;
CREATE TABLE `account_team`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Price` double(255, 2) NOT NULL,
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Account_PL` int(11) NOT NULL DEFAULT 1 COMMENT 'Statement of profit or loss',
  `DeleteStauts` int(255) NULL DEFAULT NULL COMMENT '删除状态',
  `Account_Uid` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for account_testqsl
-- ----------------------------
DROP TABLE IF EXISTS `account_testqsl`;
CREATE TABLE `account_testqsl`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Uid` int(255) NULL DEFAULT NULL,
  `Account_TypeId` int(255) NULL DEFAULT NULL COMMENT '交易种类',
  `Account_Price` double(255, 2) NOT NULL,
  `Account_PL` int(11) NOT NULL DEFAULT 1 COMMENT 'Statement of profit or loss',
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `DeleteStauts` int(255) NULL DEFAULT NULL COMMENT '删除状态',
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for account_type
-- ----------------------------
DROP TABLE IF EXISTS `account_type`;
CREATE TABLE `account_type`  (
  `TypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别ID',
  `TypeName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '类别名称',
  PRIMARY KEY (`TypeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_type
-- ----------------------------
INSERT INTO `account_type` VALUES (1, '一般');
INSERT INTO `account_type` VALUES (2, '餐饮');
INSERT INTO `account_type` VALUES (3, '购物');
INSERT INTO `account_type` VALUES (4, '服饰');
INSERT INTO `account_type` VALUES (5, '交通');
INSERT INTO `account_type` VALUES (6, '娱乐');
INSERT INTO `account_type` VALUES (7, '社交');
INSERT INTO `account_type` VALUES (8, '居家');
INSERT INTO `account_type` VALUES (9, '通讯');
INSERT INTO `account_type` VALUES (10, '零食');

-- ----------------------------
-- Table structure for account_user
-- ----------------------------
DROP TABLE IF EXISTS `account_user`;
CREATE TABLE `account_user`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Price` double(255, 2) NOT NULL,
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Account_PL` int(11) NOT NULL DEFAULT 1 COMMENT 'Statement of profit or loss',
  `DeleteStauts` int(255) NULL DEFAULT NULL COMMENT '删除状态',
  `Account_Uid` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account_user
-- ----------------------------
INSERT INTO `account_user` VALUES (1, 1.00, '1', 123, 1, 10);
INSERT INTO `account_user` VALUES (2, 2.00, '2', 222, 0, 0);

-- ----------------------------
-- Table structure for account_xianyu
-- ----------------------------
DROP TABLE IF EXISTS `account_xianyu`;
CREATE TABLE `account_xianyu`  (
  `Account_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Account_Uid` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Account_TypeId` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '交易种类',
  `Account_Price` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Account_PL` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL DEFAULT '1' COMMENT 'Statement of profit or loss',
  `Account_Date` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `DeleteStauts` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '删除状态',
  PRIMARY KEY (`Account_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `Admin_Id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `Admin_Name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Admin_Password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Role` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`Admin_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin', 1);
INSERT INTO `admin` VALUES (2, 'superadmin', 'superadmin', 0);
INSERT INTO `admin` VALUES (3, 'Living01', 'Living01', 1);

-- ----------------------------
-- Table structure for t&u
-- ----------------------------
DROP TABLE IF EXISTS `t&u`;
CREATE TABLE `t&u`  (
  `Team_Id` int(255) NULL DEFAULT NULL,
  `User_Id` int(255) NULL DEFAULT NULL,
  `IsLeader` int(255) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t&u
-- ----------------------------
INSERT INTO `t&u` VALUES (1, 1, 1);

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team`  (
  `Team_Id` int(255) NOT NULL AUTO_INCREMENT,
  `Team_Name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Team_LeaderId` int(255) NOT NULL,
  `Team_LeaderName` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Team_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES (1, 'Team01', 1, 'User');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `User_Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_Name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `User_Password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Role` int(11) NULL DEFAULT 1 COMMENT '用户权限编号',
  PRIMARY KEY (`User_Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Living', 'Living', 1);
INSERT INTO `user` VALUES (2, 'admin', 'admin', 1);
INSERT INTO `user` VALUES (5, 'test01', 'test01', 1);
INSERT INTO `user` VALUES (6, 'test02', 'test02', 1);
INSERT INTO `user` VALUES (7, 'test03', 'test03', 1);

SET FOREIGN_KEY_CHECKS = 1;
