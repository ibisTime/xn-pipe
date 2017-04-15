/*
 Navicat MySQL Data Transfer

 Source Server         : 148
 Source Server Version : 50545
 Source Host           : 121.43.101.148
 Source Database       : xn_pipe

 Target Server Version : 50545
 File Encoding         : utf-8

 Date: 03/13/2017 14:04:01 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tp_assign`
-- ----------------------------
DROP TABLE IF EXISTS `tp_assign`;
CREATE TABLE `tp_assign` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户编号',
  `demand_code` varchar(32) DEFAULT NULL COMMENT '需求编号',
  `dealer_code` varchar(32) DEFAULT NULL COMMENT '经销商编号',
  `create_datetime` datetime DEFAULT NULL,
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


-- ----------------------------
--  Table structure for `tp_dealer`
-- ----------------------------
DROP TABLE IF EXISTS `tp_dealer`;
CREATE TABLE `tp_dealer` (
  `code` varchar(32) NOT NULL COMMENT '经销商编号',
  `login_name` varchar(32) DEFAULT NULL COMMENT '登录账号',
  `name` varchar(255) DEFAULT NULL COMMENT '经销商名称',
  `province` varchar(32) DEFAULT NULL COMMENT '省',
  `city` varchar(32) DEFAULT NULL COMMENT '市',
  `area` varchar(32) DEFAULT NULL COMMENT '区',
  `address` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `longitude` varchar(64) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(64) DEFAULT NULL COMMENT '纬度',
  `owner` varchar(32) DEFAULT NULL COMMENT '负责人',
  `contact` varchar(64) DEFAULT NULL COMMENT '联系方式',
  `mobile` varchar(32) DEFAULT NULL COMMENT '信息通知手机',
  `pic` text COMMENT '缩略展示图',
  `detail` text COMMENT '图文详情',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `create_datetime` datetime DEFAULT NULL COMMENT '入驻时间',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `userId` varchar(32) DEFAULT NULL COMMENT '关联用户ID',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tp_demand`
-- ----------------------------
DROP TABLE IF EXISTS `tp_demand`;
CREATE TABLE `tp_demand` (
  `code` varchar(32) NOT NULL COMMENT '需求编号',
  `dealer_code` varchar(32) DEFAULT NULL COMMENT '经销商编号',
  `start_datetime` datetime DEFAULT NULL COMMENT '开始时间',
  `end_datetime` datetime DEFAULT NULL COMMENT '结束时间',
  `province` varchar(32) DEFAULT NULL COMMENT '省',
  `city` varchar(32) DEFAULT NULL COMMENT '市',
  `area` varchar(32) DEFAULT NULL COMMENT '区',
  `address` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `longitude` varchar(64) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(64) DEFAULT NULL COMMENT '纬度',
  `price` varchar(255) DEFAULT NULL COMMENT '价格',
  `summary` varchar(255) DEFAULT NULL COMMENT '简述',
  `pic` text COMMENT '需求图片',
  `detail` text COMMENT '详细描述',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `create_datetime` datetime DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- ----------------------------
--  Table structure for `tp_demand_order`
-- ----------------------------
DROP TABLE IF EXISTS `tp_demand_order`;
CREATE TABLE `tp_demand_order` (
  `code` varchar(32) NOT NULL COMMENT '需求订单编号',
  `type` varchar(4) DEFAULT NULL COMMENT '类型（派单、主动接单）',
  `demand_code` varchar(32) DEFAULT NULL COMMENT '需求编号',
  `dealer_code` varchar(32) DEFAULT NULL COMMENT '经销商编号',
  `receive_datetime` datetime DEFAULT NULL COMMENT '接单时间',
  `receiver` varchar(32) DEFAULT NULL COMMENT '接单人',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `give_integral` bigint(20) DEFAULT NULL COMMENT '赠送积分数量',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tp_hear`
-- ----------------------------
DROP TABLE IF EXISTS `tp_hear`;
CREATE TABLE `tp_hear` (
  `user_id` varchar(32) NOT NULL COMMENT '用户编号',
  `content` varchar(32) DEFAULT NULL COMMENT '找活内容（1,2,3,4,5,6）',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tp_news`
-- ----------------------------
DROP TABLE IF EXISTS `tp_news`;
CREATE TABLE `tp_news` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `type` varchar(4) DEFAULT NULL COMMENT '类别（1-新闻）',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `keywords` varchar(255) DEFAULT NULL,
  `content` text COMMENT '内容',
  `pic` varchar(255) DEFAULT NULL COMMENT '图片url',
  `scan_num` int(11) DEFAULT NULL COMMENT '浏览数',
  `comment_num` int(11) DEFAULT NULL COMMENT '评论数',
  `location` varchar(4) DEFAULT NULL COMMENT 'UI位置',
  `order_no` int(11) DEFAULT NULL COMMENT '序号',
  `status` varchar(4) DEFAULT NULL COMMENT '状态(0 未发布 1已发布 2 下架)',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tsys_config`
-- ----------------------------
DROP TABLE IF EXISTS `tsys_config`;
CREATE TABLE `tsys_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `type` varchar(4) DEFAULT NULL COMMENT '类型',
  `ckey` varchar(32) DEFAULT NULL COMMENT 'key值',
  `cvalue` varchar(255) DEFAULT NULL COMMENT '值',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `system_code` varchar(32) DEFAULT NULL COMMENT '系统编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tsys_dict`
-- ----------------------------
DROP TABLE IF EXISTS `tsys_dict`;
CREATE TABLE `tsys_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号（自增长）',
  `type` char(1) DEFAULT NULL COMMENT '类型（第一层/第二层）',
  `parent_key` varchar(32) DEFAULT NULL COMMENT '父key',
  `dkey` varchar(32) DEFAULT NULL COMMENT 'key',
  `dvalue` varchar(255) DEFAULT NULL COMMENT '值',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `system_code` varchar(32) DEFAULT NULL COMMENT '系统编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tp_comment`
-- ----------------------------
DROP TABLE IF EXISTS `tp_comment`;
CREATE TABLE `tp_comment` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `type` varchar(4) DEFAULT NULL COMMENT '类型(1 水电工)',
  `content` text CHARACTER SET utf8mb4 COMMENT '内容',
  `parent_code` varchar(32) DEFAULT NULL COMMENT '上级编号',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `commentator` varchar(32) DEFAULT NULL COMMENT '评论人',
  `comm_datetime` datetime DEFAULT NULL COMMENT '评论时间',
  `approver` varchar(32) DEFAULT NULL COMMENT '审核人',
  `approve_datetime` datetime DEFAULT NULL COMMENT '审核时间',
  `remark` text COMMENT '备注',
  `entity_code` varchar(32) DEFAULT NULL COMMENT '针对实体',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;