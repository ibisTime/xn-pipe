ALTER TABLE `xn_pipe`.`tp_demand` 
ADD COLUMN `type` VARCHAR(16) NULL COMMENT '需求类型' AFTER `code`;

ALTER TABLE `xn_pipe`.`tp_demand_order` 
ADD COLUMN `pic` TEXT NULL COMMENT '施工图片' AFTER `give_integral`;