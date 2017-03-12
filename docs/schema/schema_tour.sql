/*
 Navicat MySQL Data Transfer

 Source Server         : 148
 Source Server Version : 50545
 Source Host           : 121.43.101.148
 Source Database       : llww_tour

 Target Server Version : 50545
 File Encoding         : utf-8

 Date: 03/05/2017 23:18:57 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

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
--  Table structure for `ttour_activity`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_activity`;
CREATE TABLE `ttour_activity` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `site` varchar(255) DEFAULT NULL COMMENT '地点',
  `start_date` datetime DEFAULT NULL COMMENT '开始时间',
  `end_date` datetime DEFAULT NULL COMMENT '结束时间',
  `description` text COMMENT '详情',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '最近修改人',
  `update_datetime` datetime DEFAULT NULL COMMENT '最近修改时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_bus`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_bus`;
CREATE TABLE `ttour_bus` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `start_site` varchar(32) DEFAULT NULL COMMENT '上车地点',
  `end_site` varchar(32) DEFAULT NULL COMMENT '下车地点',
  `mid_site` varchar(32) DEFAULT NULL COMMENT '途经站点',
  `out_datetime` datetime DEFAULT NULL COMMENT '预定出发时间',
  `total_num` int(11) DEFAULT NULL COMMENT '总人数',
  `booker` varchar(32) DEFAULT NULL COMMENT '预定人',
  `book_note` varchar(255) DEFAULT NULL COMMENT '预定说明',
  `book_datetime` datetime DEFAULT NULL COMMENT '预定时间',
  `distance` int(11) DEFAULT NULL COMMENT '距离',
  `distance_price` bigint(10) DEFAULT NULL COMMENT '距离价格',
  `pay_group` varchar(32) DEFAULT NULL COMMENT '支付组号',
  `pay_code` varchar(32) DEFAULT NULL COMMENT '支付单号',
  `pay_amount` bigint(10) DEFAULT NULL COMMENT '支付金额',
  `pay_datetime` datetime DEFAULT NULL COMMENT '支付时间',
  `driver` varchar(32) DEFAULT NULL COMMENT '司机姓名',
  `mobile` varchar(32) DEFAULT NULL COMMENT '联系电话',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_carpool`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_carpool`;
CREATE TABLE `ttour_carpool` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `start_site` varchar(32) DEFAULT NULL COMMENT '上车地点',
  `end_site` varchar(32) DEFAULT NULL COMMENT '下车地点',
  `out_datetime` datetime DEFAULT NULL COMMENT '拼车时间',
  `total_num` int(11) DEFAULT NULL COMMENT '拼车总人数',
  `take_part_num` int(11) DEFAULT NULL COMMENT '已参与人数',
  `take_part_amount` bigint(10) DEFAULT NULL COMMENT '已到账总金额',
  `distance_price` bigint(10) DEFAULT NULL COMMENT '距离价格',
  `cur_price` bigint(10) DEFAULT NULL COMMENT '下个拼车人看到的拼车价格',
  `next_price` bigint(10) DEFAULT NULL COMMENT '下个拼车人看到的拼车价格',
  `driver` varchar(32) DEFAULT NULL COMMENT '司机姓名',
  `mobile` varchar(32) DEFAULT NULL COMMENT '联系电话',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '最近更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '最近更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_carpool_order`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_carpool_order`;
CREATE TABLE `ttour_carpool_order` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `carpool_code` varchar(32) DEFAULT NULL COMMENT '拼车编号',
  `apply_user` varchar(32) DEFAULT NULL COMMENT '下单人',
  `apply_note` varchar(32) DEFAULT NULL COMMENT '下单说明',
  `apply_datetime` datetime DEFAULT NULL COMMENT '下单时间',
  `quantity` int(11) DEFAULT NULL COMMENT '下单人数',
  `first_amount` bigint(10) DEFAULT NULL COMMENT '首次金额',
  `first_pay_group` varchar(32) DEFAULT NULL COMMENT '首次支付组号',
  `first_pay_code` varchar(32) DEFAULT NULL COMMENT '首次支付单号',
  `first_pay_amount` bigint(10) DEFAULT NULL COMMENT '首次支付金额',
  `first_pay_datetime` datetime DEFAULT NULL COMMENT '首次支付时间',
  `second_amount` bigint(10) DEFAULT NULL COMMENT '第二次金额',
  `second_pay_group` varchar(32) DEFAULT NULL COMMENT '第二次支付组号',
  `second_pay_code` varchar(32) DEFAULT NULL COMMENT '第二次支付单号',
  `second_pay_amount` bigint(10) DEFAULT NULL COMMENT '第二次支付金额',
  `second_pay_datetime` datetime DEFAULT NULL COMMENT '第二次支付时间',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_cart`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_cart`;
CREATE TABLE `ttour_cart` (
  `code` varchar(32) NOT NULL COMMENT '购物车编号',
  `user_id` varchar(32) DEFAULT NULL COMMENT '用户编号',
  `product_code` varchar(32) DEFAULT NULL COMMENT '产品编号',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_category`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_category`;
CREATE TABLE `ttour_category` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `parent_code` varchar(32) DEFAULT NULL COMMENT '父节点',
  `type` varchar(4) DEFAULT NULL COMMENT '类型（1 产品类别 2 产品位置）',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `pic` varchar(255) DEFAULT NULL COMMENT '图片',
  `order_no` int(11) DEFAULT NULL COMMENT '序号',
  `belong` varchar(32) DEFAULT NULL COMMENT '属于谁',
  `company_code` varchar(32) DEFAULT NULL COMMENT '公司编号',
  `system_code` varchar(32) DEFAULT NULL COMMENT '系统编号',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_comment`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_comment`;
CREATE TABLE `ttour_comment` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `parent_code` varchar(32) DEFAULT NULL COMMENT '针对父类编号',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `commer` varchar(32) DEFAULT NULL COMMENT '评论人',
  `comm_datetime` datetime DEFAULT NULL COMMENT '评论时间',
  `approver` varchar(32) DEFAULT NULL COMMENT '审核人',
  `approve_datetime` datetime DEFAULT NULL COMMENT '审核时间',
  `approve_note` varchar(255) DEFAULT NULL COMMENT '审核意见',
  `top_code` varchar(32) DEFAULT NULL COMMENT '针对顶级编号',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_feedback`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_feedback`;
CREATE TABLE `ttour_feedback` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `content` text COMMENT '内容',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `commiter` varchar(32) DEFAULT NULL COMMENT '提交人',
  `contact` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `commit_datetime` datetime DEFAULT NULL COMMENT '提交时间',
  `dealer` varchar(32) DEFAULT NULL COMMENT '处理人',
  `deal_datetime` datetime DEFAULT NULL COMMENT '处理时间',
  `deal_note` varchar(255) DEFAULT NULL COMMENT '处理意见',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_food`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_food`;
CREATE TABLE `ttour_food` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(32) DEFAULT NULL COMMENT '名称',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `pic` varchar(1024) DEFAULT NULL COMMENT '美食图片',
  `price` varchar(255) DEFAULT NULL COMMENT '价格/份',
  `province` varchar(255) DEFAULT NULL COMMENT '省',
  `city` varchar(255) DEFAULT NULL COMMENT '市',
  `area` varchar(255) DEFAULT NULL COMMENT '区',
  `detail` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `longitude` varchar(32) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(32) DEFAULT NULL COMMENT '纬度',
  `location` varchar(32) DEFAULT NULL COMMENT 'UI位置',
  `order_no` varchar(32) DEFAULT NULL COMMENT 'UI次序',
  `supply_time` varchar(32) DEFAULT NULL COMMENT '用餐时间',
  `max_seat` varchar(32) DEFAULT NULL COMMENT '用餐人数',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '最新修改人',
  `update_datetime` datetime DEFAULT NULL COMMENT '最新修改时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_guide`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_guide`;
CREATE TABLE `ttour_guide` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `line_code` varchar(32) DEFAULT NULL COMMENT '针对线路',
  `title` varchar(64) DEFAULT NULL COMMENT '标题',
  `best_date` varchar(32) DEFAULT NULL COMMENT '最佳旅行时间',
  `type` varchar(4) DEFAULT NULL COMMENT '类型',
  `style` varchar(4) DEFAULT NULL COMMENT '形式',
  `description` text COMMENT '图文描述',
  `pic` text COMMENT '图片',
  `collection_times` int(11) DEFAULT NULL COMMENT '收藏次数',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '最近修改人',
  `update_datetime` datetime DEFAULT NULL COMMENT '最近修改时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_hotal`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_hotal`;
CREATE TABLE `ttour_hotal` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(32) DEFAULT NULL COMMENT '酒店名称',
  `category` varchar(32) DEFAULT NULL COMMENT '分类（酒店/民宿）',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `province` varchar(32) DEFAULT NULL COMMENT '省',
  `city` varchar(32) DEFAULT NULL COMMENT '市',
  `area` varchar(32) DEFAULT NULL COMMENT '区',
  `detail` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `longitude` varchar(64) DEFAULT NULL COMMENT '精度',
  `latitude` varchar(64) DEFAULT NULL COMMENT '维度',
  `telephone` varchar(32) DEFAULT NULL COMMENT '酒店电话',
  `description` varchar(255) DEFAULT NULL COMMENT '描述说明',
  `special_desc` text COMMENT '特色',
  `food_desc` text COMMENT '美食',
  `pic1` text COMMENT '展示图',
  `pic2` text COMMENT '轮播图',
  `high_price` bigint(10) DEFAULT NULL COMMENT '最高价格',
  `low_price` bigint(10) DEFAULT NULL COMMENT '最低价格',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `location` varchar(32) DEFAULT NULL COMMENT 'UI位置',
  `order_no` varchar(32) DEFAULT NULL COMMENT 'UI次序',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `ownerId` varchar(32) DEFAULT NULL COMMENT '名宿主人',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_hotal_order`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_hotal_order`;
CREATE TABLE `ttour_hotal_order` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `hotal_code` varchar(32) DEFAULT NULL COMMENT '酒店编号',
  `hotal_room_code` varchar(32) DEFAULT NULL COMMENT '房间类型',
  `start_date` datetime DEFAULT NULL COMMENT '入住时间起',
  `end_date` datetime DEFAULT NULL COMMENT '入住时间止',
  `quantity` varchar(32) DEFAULT NULL COMMENT '数量',
  `apply_user` varchar(32) DEFAULT NULL COMMENT '下单人',
  `check_in_mobile` varchar(32) DEFAULT NULL COMMENT '入住人手机号',
  `amount` bigint(10) DEFAULT NULL COMMENT '金额',
  `pay_grop` varchar(32) DEFAULT NULL COMMENT '支付组号',
  `apply_note` varchar(255) DEFAULT NULL COMMENT '下单说明',
  `apply_datetime` datetime DEFAULT NULL COMMENT '下单时间',
  `check_in_name` varchar(32) DEFAULT NULL COMMENT '入住人',
  `pay_code` varchar(32) DEFAULT NULL COMMENT '支付单号',
  `pay_amount` bigint(10) DEFAULT NULL COMMENT '支付金额',
  `pay_datetime` datetime DEFAULT NULL COMMENT '支付时间',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_hotal_room`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_hotal_room`;
CREATE TABLE `ttour_hotal_room` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(32) DEFAULT NULL COMMENT '名称（房型）',
  `hotal_code` varchar(32) DEFAULT NULL COMMENT '所属酒店',
  `picture` text COMMENT '图片',
  `description` varchar(32) DEFAULT NULL COMMENT '描述说明',
  `price` bigint(10) DEFAULT NULL COMMENT '价格',
  `total_num` int(11) DEFAULT NULL COMMENT '总房间数',
  `remain` int(11) DEFAULT NULL COMMENT '剩余房间数',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_interact`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_interact`;
CREATE TABLE `ttour_interact` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `type` varchar(4) DEFAULT NULL COMMENT '类型',
  `to_type` varchar(4) DEFAULT NULL COMMENT '针对类型',
  `to_entity` varchar(32) DEFAULT NULL COMMENT '针对编号',
  `interacter` varchar(32) DEFAULT NULL COMMENT '交互人',
  `interact_datetime` datetime DEFAULT NULL COMMENT '交互时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_keyword`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_keyword`;
CREATE TABLE `ttour_keyword` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `word` varchar(255) DEFAULT NULL COMMENT '词语',
  `weight` double DEFAULT NULL COMMENT '权重',
  `level` varchar(4) DEFAULT NULL COMMENT '作用等级',
  `reaction` varchar(4) DEFAULT NULL COMMENT '反应',
  `updater` varchar(32) DEFAULT NULL COMMENT '最近修改人',
  `update_datetime` datetime DEFAULT NULL COMMENT '最近修改时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_line`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_line`;
CREATE TABLE `ttour_line` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(32) DEFAULT NULL COMMENT '名称',
  `category` varchar(32) DEFAULT NULL COMMENT '类别',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `style` varchar(4) DEFAULT NULL COMMENT '形式',
  `travel_time` varchar(32) DEFAULT NULL COMMENT '旅行时间(多久)',
  `join_place` varchar(64) DEFAULT NULL COMMENT '集合地',
  `out_date` varchar(255) DEFAULT NULL COMMENT '出行日期',
  `price` bigint(20) DEFAULT NULL COMMENT '价格',
  `path_pic` text COMMENT '线路图片',
  `location` varchar(4) DEFAULT NULL COMMENT 'UI位置',
  `order_no` varchar(32) DEFAULT NULL COMMENT 'UI次序',
  `collect_times` int(11) DEFAULT NULL COMMENT '收藏次数',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '最近修改人',
  `update_datetime` datetime DEFAULT NULL COMMENT '最近修改时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_line_commend`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_line_commend`;
CREATE TABLE `ttour_line_commend` (
  `code` varchar(32) NOT NULL COMMENT '序号',
  `line_code` varchar(32) DEFAULT NULL COMMENT '针对线路',
  `type` varchar(4) DEFAULT NULL COMMENT '类型',
  `com_code` varchar(32) DEFAULT NULL COMMENT '推荐编号',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_line_order`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_line_order`;
CREATE TABLE `ttour_line_order` (
  `code` varchar(32) NOT NULL COMMENT '订单编号',
  `line_code` varchar(32) DEFAULT NULL COMMENT '线路编号',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `ref_food_order` varchar(32) DEFAULT NULL COMMENT '关联美食编号',
  `ref_out_order` varchar(32) DEFAULT NULL COMMENT '关联出行单号',
  `ref_hotal_order` varchar(32) DEFAULT NULL COMMENT '关联酒店单号',
  `apply_user` varchar(32) DEFAULT NULL COMMENT '下单人',
  `apply_note` varchar(255) DEFAULT NULL COMMENT '下单说明',
  `apply_datetime` datetime DEFAULT NULL COMMENT '下单时间',
  `amount` bigint(10) DEFAULT NULL COMMENT '金额',
  `pay_group` varchar(32) DEFAULT NULL COMMENT '支付组号',
  `pay_code` varchar(32) DEFAULT NULL COMMENT '支付单号',
  `pay_amount` bigint(10) DEFAULT NULL COMMENT '支付金额',
  `pay_datetime` datetime DEFAULT NULL COMMENT '支付时间',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_line_tab`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_line_tab`;
CREATE TABLE `ttour_line_tab` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `line_code` varchar(32) DEFAULT NULL COMMENT '针对线路',
  `type` varchar(4) DEFAULT NULL COMMENT '类型',
  `description` text COMMENT '图文描述',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_order`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_order`;
CREATE TABLE `ttour_order` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `type` varchar(4) DEFAULT NULL COMMENT '类型(散买，批发)',
  `receiver` varchar(255) DEFAULT NULL COMMENT '收件人姓名',
  `re_mobile` varchar(32) DEFAULT NULL COMMENT '收件人电话',
  `re_address` varchar(255) DEFAULT NULL COMMENT '收货地址',
  `receipt_type` varchar(4) DEFAULT NULL COMMENT '发票类型(1 个人，2 企业)',
  `receipt_title` varchar(64) DEFAULT NULL COMMENT '发票抬头',
  `apply_user` varchar(32) DEFAULT NULL COMMENT '下单人',
  `apply_note` varchar(255) DEFAULT NULL COMMENT '下单备注',
  `apply_datetime` datetime DEFAULT NULL COMMENT '下单时间',
  `amount1` bigint(20) DEFAULT NULL COMMENT '金额1',
  `amount2` bigint(20) DEFAULT NULL COMMENT '金额2',
  `amount3` bigint(20) DEFAULT NULL COMMENT '金额3',
  `pay_amount1` bigint(20) DEFAULT NULL COMMENT '支付金额1',
  `pay_amount2` bigint(20) DEFAULT NULL COMMENT '支付金额2',
  `pay_amount3` bigint(20) DEFAULT NULL COMMENT '支付金额3',
  `yunfei` bigint(20) DEFAULT NULL COMMENT '运费',
  `pay_datetime` datetime DEFAULT NULL COMMENT '支付时间',
  `prompt_times` int(11) DEFAULT NULL COMMENT '催货次数',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `logistics_code` varchar(32) DEFAULT NULL COMMENT '物流单号',
  `logistics_company` varchar(32) DEFAULT NULL COMMENT '物流公司编号',
  `deliverer` varchar(32) DEFAULT NULL COMMENT '发货人编号',
  `delivery_datetime` datetime DEFAULT NULL COMMENT '发货时间',
  `pdf` varchar(255) DEFAULT NULL COMMENT '物流单',
  `pay_code` varchar(32) DEFAULT NULL COMMENT '第三方支付编号',
  `pay_group` varchar(32) DEFAULT NULL COMMENT '支付组号',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_product`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_product`;
CREATE TABLE `ttour_product` (
  `code` varchar(32) NOT NULL COMMENT '商品编号',
  `category` varchar(32) DEFAULT NULL COMMENT '大类',
  `type` varchar(32) DEFAULT NULL COMMENT '小类',
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `adv_title` varchar(255) DEFAULT NULL COMMENT '广告语',
  `adv_pic` varchar(255) DEFAULT NULL COMMENT '广告图',
  `pic1` varchar(255) DEFAULT NULL COMMENT 'pic1',
  `pic2` varchar(255) DEFAULT NULL COMMENT 'pic2',
  `pic3` varchar(255) DEFAULT NULL COMMENT 'pic3',
  `pic4` varchar(255) DEFAULT NULL COMMENT 'pic4',
  `description` text COMMENT '图文描述',
  `cost_price` bigint(20) DEFAULT NULL COMMENT '进货价',
  `quantity` int(11) DEFAULT NULL COMMENT '库存量',
  `status` varchar(4) DEFAULT NULL COMMENT '产品状态(上架，下架)',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `price1` bigint(20) DEFAULT NULL COMMENT '价格1（人民币）',
  `price2` bigint(20) DEFAULT NULL COMMENT '价格2（虚拟币1）',
  `price3` bigint(20) DEFAULT NULL COMMENT '价格3（虚拟币2）',
  `location` varchar(32) DEFAULT NULL COMMENT '位置(0 普通 1 热门)',
  `order_no` int(11) DEFAULT NULL COMMENT '相对位置编号',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_product_order`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_product_order`;
CREATE TABLE `ttour_product_order` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `order_code` varchar(32) DEFAULT NULL COMMENT '订单编号',
  `product_code` varchar(32) DEFAULT NULL COMMENT '商品编号',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `price1` bigint(20) DEFAULT NULL COMMENT '价格1',
  `price2` bigint(20) DEFAULT NULL COMMENT '价格2',
  `price3` bigint(20) DEFAULT NULL COMMENT '价格3',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_special_line`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_special_line`;
CREATE TABLE `ttour_special_line` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `name` varchar(32) DEFAULT NULL COMMENT '专线名称',
  `address` varchar(255) DEFAULT NULL COMMENT '乘车地点',
  `type` varchar(4) DEFAULT NULL COMMENT '类型',
  `max_num` int(11) DEFAULT NULL COMMENT '核载人数',
  `remain_num` int(11) DEFAULT NULL COMMENT '余票数量',
  `start_site` varchar(255) DEFAULT NULL COMMENT '起点',
  `end_site` varchar(255) DEFAULT NULL COMMENT '终点',
  `pic` text COMMENT '图片',
  `price` bigint(20) DEFAULT NULL COMMENT '价格',
  `out_datetime` datetime DEFAULT NULL COMMENT '出发时间',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_special_line_order`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_special_line_order`;
CREATE TABLE `ttour_special_line_order` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `special_line_code` varchar(32) DEFAULT NULL COMMENT '专线编号',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `seat_no` varchar(32) DEFAULT NULL COMMENT '座位数',
  `apply_user` varchar(32) DEFAULT NULL COMMENT '下单人',
  `apply_note` varchar(255) DEFAULT NULL COMMENT '下单说明',
  `apply_datetime` datetime DEFAULT NULL COMMENT '下单时间',
  `amount` bigint(20) DEFAULT NULL COMMENT '金额',
  `pay_grop` varchar(32) DEFAULT NULL COMMENT '支付组号',
  `pay_datetime` datetime DEFAULT NULL COMMENT '支付时间',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `pay_code` varchar(32) DEFAULT NULL COMMENT '支付单号',
  `pay_amount` bigint(20) DEFAULT NULL COMMENT '支付金额',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `ttour_book_hotal`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_book_hotal`;
create table `ttour_book_hotal` (
	`code` varchar (32) NOT NULL COMMENT '编号',
	`hotal_code` varchar (32) DEFAULT NULL COMMENT '酒店编号',
	`hotal_room_code` varchar (32) DEFAULT NULL COMMENT '酒店房间编号',
	`book_date` date DEFAULT NULL COMMENT '预订日期',
	`remain` int (11) DEFAULT NULL COMMENT '备注',
	PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8; 
-- ----------------------------
--  Table structure for `ttour_travels`
-- ----------------------------
DROP TABLE IF EXISTS `ttour_travels`;
CREATE TABLE `ttour_travels` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `line_code` varchar(32) DEFAULT NULL COMMENT '针对线路',
  `name` varchar(64) DEFAULT NULL COMMENT '名称',
  `description` text COMMENT '文字描述',
  `pic` text COMMENT '图片描述',
  `location` varchar(4) DEFAULT NULL COMMENT 'UI位置',
  `collection_times` int(11) DEFAULT NULL COMMENT '收藏次数',
  `like_times` int(11) DEFAULT NULL COMMENT '点赞次数',
  `report_times` int(11) DEFAULT NULL COMMENT '举报次数',
  `status` varchar(4) DEFAULT NULL COMMENT '状态',
  `publisher` varchar(32) DEFAULT NULL COMMENT '发布人',
  `publish_datetime` datetime DEFAULT NULL COMMENT '发布时间',
  `updater` varchar(32) DEFAULT NULL COMMENT '平台修改人',
  `update_datetime` datetime DEFAULT NULL COMMENT '平台修改时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
