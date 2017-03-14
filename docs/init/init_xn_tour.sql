/*
-- Query: SELECT `type`,`ckey`,`cvalue`,`updater`,now() as `update_datetime`,`remark`,`system_code` FROM llww_tour.tsys_config
LIMIT 0, 10000

-- Date: 2017-03-06 23:11
*/
INSERT INTO `tsys_config` (`type`,`ckey`,`cvalue`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('1','distance','1','admin',now(),'',NULL);
