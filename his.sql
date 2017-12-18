/*
Navicat MySQL Data Transfer
数据字典（包含基本数据）
Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : his

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-15 11:32:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` varchar(20) NOT NULL COMMENT '账号',
  `pwd` varchar(20) NOT NULL COMMENT '密码',
  `regist_date` datetime DEFAULT NULL COMMENT '添加时间',
  `power` int(3) DEFAULT '0' COMMENT '权限	0.普通管理员（默认）	1.系统管理员',
  `login` int(3) DEFAULT '0' COMMENT '账号状态	0.正常（默认）1.冻结',
  `login_date` datetime DEFAULT NULL COMMENT '最近一次登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin', '2017-12-15 09:45:53', '0', '0', null);

-- ----------------------------
-- Table structure for business
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `id` varchar(25) NOT NULL COMMENT '厂商账号',
  `pwd` varchar(25) NOT NULL COMMENT '厂商密码',
  `date` datetime DEFAULT NULL COMMENT '厂商申请(注册)时间	注册我平台时间',
  `auditing_date` date DEFAULT NULL COMMENT '审核通过时间',
  `state` int(3) DEFAULT '0' COMMENT '状态	0.未审核(默认)	1.审核通过	2.审核驳回',
  `describe` varchar(500) DEFAULT NULL COMMENT '厂商自行描述',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `img` varchar(1000) DEFAULT NULL COMMENT '营业执照等认证信息	存储图片路径，每图片路径使用“，”隔开',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business
-- ----------------------------
INSERT INTO `business` VALUES ('1', '1001', '123456', '2017-12-15 10:25:53', '2017-12-15', '1', '中国最大的厂商', null, null);

-- ----------------------------
-- Table structure for business_data
-- ----------------------------
DROP TABLE IF EXISTS `business_data`;
CREATE TABLE `business_data` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `b_id` bigint(20) NOT NULL COMMENT '厂商账号',
  `wares_id` bigint(20) NOT NULL COMMENT '商品id',
  PRIMARY KEY (`_id`),
  KEY `business_data_business__id_fk` (`b_id`),
  KEY `business_data_wares__id_fk` (`wares_id`),
  CONSTRAINT `business_data_business__id_fk` FOREIGN KEY (`b_id`) REFERENCES `business` (`_id`),
  CONSTRAINT `business_data_wares__id_fk` FOREIGN KEY (`wares_id`) REFERENCES `wares` (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business_data
-- ----------------------------
INSERT INTO `business_data` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for clinic
-- ----------------------------
DROP TABLE IF EXISTS `clinic`;
CREATE TABLE `clinic` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `id` varchar(25) NOT NULL COMMENT '诊所账号',
  `pwd` varchar(25) NOT NULL COMMENT '诊所密码',
  `regist_date` datetime DEFAULT NULL COMMENT '诊所申请(注册)时间	注册我平台时间',
  `auditing_date` date DEFAULT NULL COMMENT '审核通过时间',
  `state` int(3) DEFAULT '0' COMMENT '状态	0.未审核(默认)	1.审核通过	2.审核驳回',
  `describe` varchar(500) DEFAULT NULL COMMENT '诊所自行描述',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `img` varchar(1000) DEFAULT NULL COMMENT '营业执照等认证信息	存储图片路径，每图片路径使用“，”隔开',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clinic
-- ----------------------------
INSERT INTO `clinic` VALUES ('1', 'zs', 'zs', '2017-12-15 10:41:48', '2017-12-15', '0', '湖南最好的诊所', null, null);

-- ----------------------------
-- Table structure for clinic_psp
-- ----------------------------
DROP TABLE IF EXISTS `clinic_psp`;
CREATE TABLE `clinic_psp` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id	药品',
  `clinic` bigint(20) NOT NULL COMMENT '诊所id	',
  `name` varchar(150) DEFAULT NULL COMMENT '药名',
  `gg` varchar(100) DEFAULT NULL COMMENT '规格	例如 66ml',
  `dw` varchar(12) DEFAULT NULL COMMENT '单位	例如 瓶',
  `num` int(10) DEFAULT NULL COMMENT '库存',
  `yf` varchar(150) DEFAULT NULL COMMENT '用法',
  `yl` varchar(150) DEFAULT NULL COMMENT '用量',
  PRIMARY KEY (`_id`),
  KEY `clinic_psp_clinic__id_fk` (`clinic`),
  CONSTRAINT `clinic_psp_clinic__id_fk` FOREIGN KEY (`clinic`) REFERENCES `clinic` (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clinic_psp
-- ----------------------------
INSERT INTO `clinic_psp` VALUES ('1', '1', '板蓝根', '12袋/盒', '袋', '500', '开水冲', '1袋');

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `id` varchar(25) NOT NULL COMMENT '医生账号',
  `pwd` varchar(25) NOT NULL COMMENT '医生密码',
  `name` varchar(25) DEFAULT NULL COMMENT '医生姓名',
  `sex` int(3) DEFAULT '0' COMMENT '医生性别	0.男（默认）	1.女',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `date` datetime DEFAULT NULL COMMENT '入职时间',
  `adept` varchar(250) DEFAULT NULL COMMENT '擅长',
  `clinic` bigint(20) DEFAULT NULL COMMENT '所在诊所',
  PRIMARY KEY (`_id`),
  KEY `doctor_clinic__id_fk` (`clinic`),
  CONSTRAINT `doctor_clinic__id_fk` FOREIGN KEY (`clinic`) REFERENCES `clinic` (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('1', '111222', '111222', '小甜', '1', '20', '2017-12-15 10:44:06', '抓药', '1');

-- ----------------------------
-- Table structure for drug_card
-- ----------------------------
DROP TABLE IF EXISTS `drug_card`;
CREATE TABLE `drug_card` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `clinic` bigint(20) NOT NULL COMMENT '诊所id',
  `doctor` bigint(20) NOT NULL COMMENT '开具医生',
  `user` varchar(25) DEFAULT NULL COMMENT '患者id',
  `ks` varchar(100) DEFAULT NULL COMMENT '科室',
  `zd` varchar(250) DEFAULT NULL COMMENT '诊断',
  `psp` varchar(500) DEFAULT NULL COMMENT '开具药物	例: 6,2;3,1	6号药物 2个	3号药物 1个',
  PRIMARY KEY (`_id`),
  KEY `drug_card_clinic__id_fk` (`clinic`),
  KEY `drug_card_doctor__id_fk` (`doctor`),
  KEY `drug_card_doctor_user_id` (`user`),
  CONSTRAINT `drug_card_clinic__id_fk` FOREIGN KEY (`clinic`) REFERENCES `clinic` (`_id`),
  CONSTRAINT `drug_card_doctor__id_fk` FOREIGN KEY (`doctor`) REFERENCES `doctor` (`_id`),
  CONSTRAINT `drug_card_doctor_user_id` FOREIGN KEY (`user`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug_card
-- ----------------------------
INSERT INTO `drug_card` VALUES ('1', '1', '1', '123456', '外科', '上火了', '1,6');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志id	',
  `user` varchar(20) DEFAULT NULL COMMENT '关联的用户id',
  `tile` varchar(100) DEFAULT NULL COMMENT '日志标题',
  `data` varchar(500) DEFAULT NULL COMMENT '日志数据',
  `date` datetime DEFAULT NULL COMMENT '日志创建时间',
  PRIMARY KEY (`_id`),
  KEY `sys_log_user_id_fk` (`user`),
  CONSTRAINT `sys_log_user_id_fk` FOREIGN KEY (`user`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(20) NOT NULL COMMENT '账号',
  `username` varchar(200) DEFAULT NULL,
  `pwd` varchar(20) NOT NULL COMMENT '密码',
  `date` datetime DEFAULT NULL COMMENT '注册时间',
  `redist_ip` varchar(50) DEFAULT NULL COMMENT '注册时ip',
  `login` int(3) DEFAULT '0' COMMENT '账号状态	0.正常（默认）1.冻结',
  `login_date` datetime DEFAULT NULL COMMENT '最近一次登录时间',
  `sex` int(3) DEFAULT '0' COMMENT '性别',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `address` varchar(200) DEFAULT NULL COMMENT '所在地',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `jf` bigint(20) DEFAULT '0' COMMENT '积分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123456', '123456', '2017-12-15 09:37:48', '127.0.0.1', '0', '2017-12-15 09:37:59', '0', '20', '江西省萍乡市', '15179653254', '0');

-- ----------------------------
-- Table structure for user_psp
-- ----------------------------
DROP TABLE IF EXISTS `user_psp`;
CREATE TABLE `user_psp` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` varchar(25) NOT NULL COMMENT '用户id',
  `ks` varchar(50) DEFAULT NULL COMMENT '申请科室',
  `bw` varchar(50) DEFAULT NULL COMMENT '检查部位',
  `look` varchar(500) DEFAULT NULL COMMENT '检查所见',
  `yj` varchar(500) DEFAULT NULL COMMENT '诊断意见',
  `clinic_id` bigint(20) DEFAULT NULL COMMENT '诊所id',
  `doctor_id` bigint(20) DEFAULT NULL COMMENT '报告医生	医生id',
  `doctor_sh_id` bigint(20) DEFAULT NULL COMMENT '审核医生',
  `date` datetime DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`_id`),
  KEY `user_psp_user_id_fk` (`user_id`),
  KEY `user_psp_clinic__id_fk` (`clinic_id`),
  KEY `user_psp_doctor__id_fk` (`doctor_id`),
  KEY `user_psp_doctor_sh_id` (`doctor_sh_id`),
  CONSTRAINT `user_psp_clinic__id_fk` FOREIGN KEY (`clinic_id`) REFERENCES `clinic` (`_id`),
  CONSTRAINT `user_psp_doctor__id_fk` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`_id`),
  CONSTRAINT `user_psp_doctor_sh_id` FOREIGN KEY (`doctor_sh_id`) REFERENCES `doctor` (`_id`),
  CONSTRAINT `user_psp_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_psp
-- ----------------------------
INSERT INTO `user_psp` VALUES ('1', '123456', '外科', '口', '没什么', '上火了，多喝水', '1', '1', '1', '2017-12-15 10:53:56');

-- ----------------------------
-- Table structure for user_s_car
-- ----------------------------
DROP TABLE IF EXISTS `user_s_car`;
CREATE TABLE `user_s_car` (
  `_id` bigint(20) DEFAULT NULL COMMENT 'id	购物车id',
  `user_id` varchar(25) DEFAULT NULL COMMENT '用户id',
  `wares` bigint(20) DEFAULT NULL COMMENT '商品id',
  `date` datetime DEFAULT NULL COMMENT '创建时间',
  `zt` int(3) DEFAULT '0' COMMENT '状态	0.正常（默认）	1.失效',
  KEY `user_s_car_user_id_fk` (`user_id`),
  KEY `user_s_car_wares__id_fk` (`wares`),
  CONSTRAINT `user_s_car_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `user_s_car_wares__id_fk` FOREIGN KEY (`wares`) REFERENCES `wares` (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_s_car
-- ----------------------------

-- ----------------------------
-- Table structure for wares
-- ----------------------------
DROP TABLE IF EXISTS `wares`;
CREATE TABLE `wares` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `title` varchar(100) NOT NULL COMMENT '商品标题',
  `subtitle` varchar(150) DEFAULT NULL COMMENT '商品副标题',
  `rmb_x` double NOT NULL DEFAULT '0' COMMENT '商品箱价格	默认0',
  `type` int(3) DEFAULT '0' COMMENT '商品出售类型	0.盒/箱（默认）	1.盒	2.箱',
  `sum_x` bigint(20) DEFAULT '0' COMMENT '箱总库存	默认0',
  `sum_h` bigint(20) DEFAULT '0' COMMENT '盒总库存	默认0',
  `surplus_x` bigint(20) DEFAULT '0' COMMENT '盒总库存	默认0',
  `surplus_h` bigint(20) DEFAULT '0' COMMENT '盒剩余库存	默认0',
  `rmb_h` double DEFAULT '0' COMMENT '商品价格	默认0',
  `create_date` datetime DEFAULT NULL COMMENT '上架时间',
  `zt` int(3) DEFAULT '0' COMMENT '商品状态	0.正常（默认）	1.过期失效	2.已下架',
  `spec` varchar(200) DEFAULT NULL COMMENT '药品规格',
  `zxl` varchar(100) DEFAULT NULL COMMENT '装箱量',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wares
-- ----------------------------
INSERT INTO `wares` VALUES ('1', '亚麻跌', '让你爽到爆的', '99', '2', '50', '100', '50', '100', '9.9', '2017-12-15 10:00:11', '0', '一箱20盒', '20盒/箱');

-- ----------------------------
-- Table structure for wares_many
-- ----------------------------
DROP TABLE IF EXISTS `wares_many`;
CREATE TABLE `wares_many` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `id` bigint(20) NOT NULL COMMENT '商品id',
  `brand` varchar(100) DEFAULT NULL COMMENT '品牌',
  `common` varchar(100) NOT NULL COMMENT '通用名',
  `category` varchar(50) DEFAULT NULL COMMENT '类别',
  `number` varchar(200) DEFAULT NULL COMMENT '批准文号',
  `dose` varchar(100) DEFAULT NULL COMMENT '使用剂量',
  `dose_type` varchar(50) DEFAULT NULL COMMENT '产品剂型',
  `usage` varchar(250) DEFAULT NULL COMMENT '用法',
  `apply` varchar(250) DEFAULT NULL COMMENT '适应症',
  `person` varchar(250) DEFAULT NULL COMMENT '使用人群',
  `enterprise` varchar(250) DEFAULT NULL COMMENT '生产企业',
  `img_url` varchar(1000) DEFAULT NULL COMMENT '附加图片	一般存储三张图片路径，每图片路径使用“，”隔开',
  PRIMARY KEY (`_id`),
  KEY `wares_many_wres__id_fk` (`id`),
  CONSTRAINT `wares_many_wres__id_fk` FOREIGN KEY (`id`) REFERENCES `wares` (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wares_many
-- ----------------------------
INSERT INTO `wares_many` VALUES ('1', '1', '亚麻跌', '小泡泡', '塑料用品', '20170601J', '20cm', 'cm', '打开即可', '心理求求', '成人', '湖南宿管', null);
