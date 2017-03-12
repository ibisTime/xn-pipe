/*
-- Query: SELECT `type`,`ckey`,`cvalue`,`updater`,now() as `update_datetime`,`remark`,`system_code` FROM llww_tour.tsys_config
LIMIT 0, 10000

-- Date: 2017-03-06 23:11
*/
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('1','busDistancePrice','1','admin',now(),'大巴距离单价',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('2','carDepositRate','0.1','admin',now(),'首付定金比例',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('2','carAddAmountRate','0.01','admn',now(),'每位增加金额比例',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('2','carDistancePrice','0.01','admin',now(),'拼车距离单价',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','perCnyToXnbLine','0.01','admin',now(),'线路每多少元兑换一个积分',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','perCnyToXnbHotal','10','admin',now(),'酒店每多少元兑换一个积分',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','perCnyToXnbSLine','100','admin',now(),'专线每多少元兑换一个积分',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','perCnyToXnbBus','10','admin',now(),'大巴每多少元兑换一个积分',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','perCnyToXnbCar','10','admin',now(),'拼车每多少元兑换一个积分',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','xnbRegister','1','admin',now(),'注册送几个积分',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','xnbSign','1','admin',now(),'签到送几个积分',NULL);
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('3','xnbPublish','1','admin',now(),'发布游记送几个积分',NULL);