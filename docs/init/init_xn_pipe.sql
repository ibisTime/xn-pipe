/*
-- Query: SELECT `type`,`ckey`,`cvalue`,`updater`,now() as `update_datetime`,`remark`,`system_code` FROM tsys_config where system_code = 'CD-CGD000006'
LIMIT 0, 10000

-- Date: 2017-03-14 15:46
*/
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES (NULL,'distance','150','admin',now(),'搜索距离(单位米)','CD-CGD000006');