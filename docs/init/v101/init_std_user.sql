ALTER TABLE `std_user`.`tstd_user` 
DROP COLUMN `lj_amount`,
DROP COLUMN `amount`;

ALTER TABLE `std_user`.`tsys_config` 
ADD COLUMN `type` VARCHAR(4) NULL COMMENT '类型' AFTER `id`;

ALTER TABLE `std_user`.`tsys_config` 
ADD COLUMN `company_code` VARCHAR(32) NULL COMMENT '公司编号' AFTER `remark`;

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'demand_type','需求类型','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_type','0','水管安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_type','1','暖气安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_type','2','电线安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_type','3','灯具安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_type','4','水暖安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_type','5','开关安装','admin',now(),NULL);

INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`note`,`updater`,`update_datetime`,`remark`,`company_code`,`system_code`) VALUES ('1','signAddJf','2','','admin',now(),'每日签到送积分','CD-CGD000006','CD-CGD000006');
