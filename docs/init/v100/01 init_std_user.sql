/*
-- Query: select `user_id`, `login_name`, `nickname`, `login_pwd`, `login_pwd_strength`, `kind`, `level`, `user_referee`, `mobile`, `id_kind`, `id_no`, `real_name`, `trade_pwd`, `trade_pwd_strength`, `role_code`, `status`, `pdf`, `amount`, `lj_amount`, `company_code`, `open_id`, `jpush_id`, `updater`, now() as `update_datetime`, `remark`, `system_code` from tstd_user where login_name = 'admin' and system_code = 'CD-CGD000006'
LIMIT 0, 10000

-- Date: 2017-03-14 15:15
*/
INSERT INTO `tstd_user` (`user_id`,`login_name`,`nickname`,`login_pwd`,`login_pwd_strength`,`kind`,`level`,`user_referee`,`mobile`,`id_kind`,`id_no`,`real_name`,`trade_pwd`,`trade_pwd_strength`,`role_code`,`status`,`pdf`,`amount`,`lj_amount`,`company_code`,`open_id`,`jpush_id`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SYS_USER_PIPE','admin',NULL,'21218cca77804d2ba1922c33e0151105','1','01','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'CGDR201600000000000000','0',NULL,NULL,NULL,NULL,NULL,NULL,'admin','2017-04-11 11:41:26','管理端系统方','CD-CGD000006');

/*
-- Query: SELECT code,name,type,url,order_no,updater, now() as update_datetime,remark,parent_code,system_code FROM tsys_menu where system_code = 'CD-CGD000006'
-- Date: 2017-04-17 18:26
*/
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM201600000000000000','根目录','1','#','1','admin',now(),'','','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM201600001000000001','系统管理','1','#','1','admin',now(),'','CGDSM201600000000000000','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM201600001000000002','运维管理','1','#','2','admin',now(),NULL,'CGDSM201600001000000001','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM201600001000000003','菜单管理','1','/security/menu.htm','1','admin',now(),'','CGDSM201600001000000002','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM201600001000000004','修改','2','/edit','2','admin',now(),'','CGDSM201600001000000003','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101716241339082','运营管理','1','#','1','admin',now(),'','CGDSM201600001000000001','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101716253866426','角色管理','1','/security/role.htm','1','admin',now(),'','CGDSM2016101716241339082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101716261754674','用户管理','1','/security/user.htm','2','admin',now(),'','CGDSM2016101716241339082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101716290657836','文本参数管理','1','/general/param.htm','2','admin',now(),'','CGDSM201600001000000002','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101716295904680','数据字典管理','1','/general/dict.htm','3','admin',now(),'','CGDSM201600001000000002','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101716450533995','分配菜单','2','/change','4','admin',now(),'','CGDSM2016101716253866426','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101717551955993','新增','2','/add','1','admin',now(),'','CGDSM2016101716253866426','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101717560118734','修改','2','/edit','2','admin',now(),'','CGDSM2016101716253866426','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101717563661357','删除','2','/delete','3','admin',now(),'','CGDSM2016101716253866426','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101719082391126','新增','2','/add','1','admin',now(),'','CGDSM2016101716261754674','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101719094151894','重置密码','2','/reset','3','admin',now(),'','CGDSM2016101716261754674','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101719100760088','注销/激活','2','/rock','4','admin',now(),'','CGDSM2016101716261754674','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101719110981215','设置角色','2','/assign','5','admin',now(),'','CGDSM2016101716261754674','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101719140087629','修改','2','/edit','1','admin',now(),'','CGDSM2016101716290657836','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('CGDSM2016101719143965297','修改','2','/edit','1','admin',now(),'','CGDSM2016101716295904680','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311291494616','新增','2','/add','1','admin',now(),'','CGDSM201600001000000003','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311300492136','业务管理','1','#','2','admin',now(),'','CGDSM201600000000000000','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703131135398707','会员管理','1','#','10','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311373676013','会员管理','1','/member/member.htm','1','admin',now(),'','SM201703131135398707','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311390093426','文章管理','1','#','60','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311393858846','banner管理','1','/public/banner.htm','1','admin',now(),'','SM2017031311390093426','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311401428179','新闻管理','1','/public/news.htm','2','admin',now(),'','SM2017031311390093426','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311411571222','新增','2','/add','0','admin',now(),'','SM2017031311393858846','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703131141367172','修改','2','/edit','1','admin',now(),'','SM2017031311393858846','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311420493056','删除','2','/delete','2','admin',now(),'','SM2017031311393858846','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311424040144','新增','2','/add','0','admin',now(),'','SM2017031311401428179','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311430646054','修改','2','/edit2','1','admin',now(),'','SM2017031311401428179','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311434385636','删除','2','/delete2','2','admin',now(),'','SM2017031311401428179','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031311441365853','上架','2','/frarme','3','admin',now(),'','SM2017031311401428179','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031314193065912','下架','2','/down','4','admin',now(),'','SM2017031311401428179','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703131453352626','经销商管理','1','#','10','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031315165703133','经销商管理','1','/biz/agency.htm','0','admin',now(),'','SM201703131453352626','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703131517266660','新增','2','/add','0','admin',now(),'','SM2017031315165703133','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031315175137368','修改','2','/edit2','1','admin',now(),'','SM2017031315165703133','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031315181455146','详情','2','detail','2','admin',now(),'','SM2017031315165703133','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031315183846977','上架','2','/up','3','admin',now(),'','SM2017031315165703133','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031315195191364','下架','2','/down','4','admin',now(),'','SM2017031315165703133','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031315205193357','需求查询','2','/need','5','admin',now(),'','SM2017031315165703133','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031317365555348','经销商业务管理','1','#','40','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031317553412078','基本信息管理','1','/biz/abiz.htm','1','admin',now(),'','SM2017031317365555348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318062849348','需求管理','1','/biz/need.htm','2','admin',now(),'','SM2017031317365555348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318073521599','需求订单处理','1','/biz/norder.htm','5','admin',now(),'','SM2017031317365555348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703131808238180','新增','2','/add','1','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318085740293','修改','2','/edit2','2','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318092982465','删除','2','/delete2','3','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318095491531','发布','2','/release','4','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318103649964','派单','2','/send','6','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318111511538','详情','2','/detail','7','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318123420554','完成订单','2','/succ','1','admin',now(),'','SM2017031318073521599','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318125856255','取消订单','2','/cancel','2','admin',now(),'','SM2017031318073521599','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031318132045650','详情','2','/detail','3','admin',now(),'','SM2017031318073521599','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031410502695353','新增','2','/add','0','admin',now(),'','CGDSM2016101716295904680','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031410505479425','删除','2','/delete','3','admin',now(),'','CGDSM2016101716295904680','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031410532420247','配置参数管理','1','/general/config.htm','4','admin',now(),'','CGDSM201600001000000002','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031410535788313','修改','2','/edit','1','admin',now(),'','SM2017031410532420247','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031413463207260','水电工详情','2','/shdetail','7','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031413471206916','评价查询','2','/comment','8','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031415350513912','业务查询','1','#','40','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703141538042971','需求管理','1','/agency/need.htm','2','admin',now(),'','SM2017031415350513912','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031415385757685','需求订单管理','1','/agency/norder.htm','3','admin',now(),'','SM2017031415350513912','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703141553196664','详情','2','/detail','2','admin',now(),'','SM201703141538042971','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201703141553474452','详情','2','/detail','1','admin',now(),'','SM2017031415385757685','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031416374833187','评价查询管理','2','/comment','2','admin',now(),'','SM2017031311373676013','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031422135803511','下架','2','/down','6','admin',now(),'','SM2017031318062849348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017031610593151951','附近水电工','1','/biz/near.htm','6','admin',now(),'','SM2017031317365555348','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201704051105320079','商城管理','1','#','40','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511064871584','商品类别管理','1','/product/category.htm','1','admin',now(),'','SM201704051105320079','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201704051107172290','商品管理','1','/product/product.htm','2','admin',now(),'','SM201704051105320079','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511074501082','订单处理','1','/product/order.htm','3','admin',now(),'','SM201704051105320079','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511084189875','新增','2','/add','1','admin',now(),'','SM2017040511064871584','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511090440016','修改','2','/edit2','2','admin',now(),'','SM2017040511064871584','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511092964998','上架','2','/up','3','admin',now(),'','SM2017040511064871584','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511095600331','下架','2','/down','5','admin',now(),'','SM2017040511064871584','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511105208242','新增','2','/add','1','admin',now(),'','SM201704051107172290','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511111538223','修改','2','/edit2','2','admin',now(),'','SM201704051107172290','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511115277898','删除','2','/delete','3','admin',now(),'','SM201704051107172290','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511122238794','详情','2','/detail2','4','admin',now(),'','SM201704051107172290','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511124457284','上架','2','/up2','5','admin',now(),'','SM201704051107172290','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511130927976','下架','2','/down','6','admin',now(),'','SM201704051107172290','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511135165489','产品参数','2','/productParam','7','admin',now(),'','SM201704051107172290','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511164543190','物流发货','2','/sendOutGoods','1','admin',now(),'','SM2017040511074501082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511171745991','现场发货','2','/spotDelivery','2','admin',now(),'','SM2017040511074501082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511175483771','取消订单','2','/cancelOrder','3','admin',now(),'','SM2017040511074501082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511183100793','确认收货','2','/confirmOrder','4','admin',now(),'','SM2017040511074501082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511184858827','详情','2','/detail','5','admin',now(),'','SM2017040511074501082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017040511190964887','导出','2','/export','6','admin',now(),'','SM2017040511074501082','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011074086626','我的账户','1','#','1','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011253389677','我的账户','1','/platform/account.htm','1','admin',now(),'','SM2017041011074086626','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011352709691','商家管理','1','#','20','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011370337589','商家管理','1','/platform/store.htm','2','admin',now(),'','SM2017041011352709691','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011381272792','商家类别管理','1','/platform/storeCategory.htm','1','admin',now(),'','SM2017041011352709691','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011404340932','新增','2','/add','1','admin',now(),'','SM2017041011381272792','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011412029678','修改','2','/edit','2','admin',now(),'','SM2017041011381272792','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011414670335','上架','2','/up','3','admin',now(),'','SM2017041011381272792','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011420956525','下架','2','/down','4','admin',now(),'','SM2017041011381272792','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011423903570','详情','2','/detail','5','admin',now(),'','SM2017041011381272792','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011434132572','新增','2','/add','1','admin',now(),'','SM2017041011370337589','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011440525412','上架','2','/up2','2','admin',now(),'','SM2017041011370337589','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011442448466','下架','2','/down','3','admin',now(),'','SM2017041011370337589','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041011444863182','详情','2','/detail2','4','admin',now(),'','SM2017041011370337589','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041013505939824','修改','2','/edit','2','admin',now(),'','SM2017041011370337589','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041014112351687','我的账户','1','#','1','admin',now(),'','SM2017031311300492136','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041014182439314','我的账户','1','/store/account.htm','1','admin',now(),'','SM2017041014112351687','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041711191131168','注销','2','/lock','2','admin',now(),'','SM2017031311373676013','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041711194036727','激活','2','/active','3','admin',now(),'','SM2017031311373676013','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM2017041715510904722','积分查询','1','/member/point.htm','2','admin',now(),'','SM201703131135398707','CD-CGD000006');
INSERT INTO `tsys_menu` (`code`,`name`,`type`,`url`,`order_no`,`updater`,`update_datetime`,`remark`,`parent_code`,`system_code`) VALUES ('SM201704171551323724','流水','2','/ledger','1','admin',now(),'','SM2017041715510904722','CD-CGD000006');


/*
-- Query: SELECT code,name,level,'admin' as updater,now() as 'update_datetime',remark FROM tsys_role WHERE system_code = 'CD-CGD000006'
LIMIT 0, 10000

-- Date: 2017-03-14 15:19
*/
INSERT INTO `tsys_role` (`code`,`name`,`level`,`updater`,`update_datetime`,`remark`) VALUES ('CGDR201600000000000000','超级管理员','1','admin',now(),NULL);
INSERT INTO `tsys_role` (`code`,`name`,`level`,`updater`,`update_datetime`,`remark`) VALUES ('SR20160000DEALER','经销商角色','1','admin',now(),NULL);

/*
-- Query: SELECT role_code,menu_code,updater,now() as update_datetime,remark, system_code FROM tsys_menu_role where role_code in('CGDR201600000000000000','SR20160000DEALER') AND system_code = 'CD-CGD000006'
-- Date: 2017-04-17 18:29
*/
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','CGDSM201600000000000000','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031311300492136','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031317365555348','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031317553412078','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318062849348','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM201703131808238180','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318085740293','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318092982465','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318095491531','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318103649964','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318111511538','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031413463207260','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031413471206916','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031422135803511','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318073521599','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318123420554','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318125856255','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031318132045650','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017031610593151951','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017041014112351687','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('SR20160000DEALER','SM2017041014182439314','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM201600000000000000','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM201600001000000001','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM201600001000000002','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM201600001000000003','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM201600001000000004','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311291494616','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101716290657836','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101719140087629','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101716295904680','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101719143965297','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031410502695353','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031410505479425','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031410532420247','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031410535788313','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101716241339082','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101716253866426','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101716450533995','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101717551955993','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101717560118734','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101717563661357','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101716261754674','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101719082391126','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101719094151894','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101719100760088','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','CGDSM2016101719110981215','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311300492136','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201703131135398707','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311373676013','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031416374833187','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041711191131168','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041711194036727','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041715510904722','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201704171551323724','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311390093426','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311393858846','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311411571222','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201703131141367172','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311420493056','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311401428179','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311424040144','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311430646054','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311434385636','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031311441365853','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031314193065912','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201703131453352626','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031315165703133','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201703131517266660','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031315175137368','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031315181455146','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031315183846977','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031315195191364','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031315205193357','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031415350513912','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201703141538042971','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201703141553196664','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017031415385757685','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201703141553474452','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201704051105320079','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511064871584','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511084189875','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511090440016','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511092964998','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511095600331','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM201704051107172290','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511105208242','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511111538223','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511115277898','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511122238794','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511124457284','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511130927976','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511135165489','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511074501082','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511164543190','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511171745991','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511175483771','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511183100793','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511184858827','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017040511190964887','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011074086626','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011253389677','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011352709691','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011370337589','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011434132572','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011440525412','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011442448466','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011444863182','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041013505939824','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011381272792','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011404340932','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011412029678','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011414670335','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011420956525','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_menu_role` (`role_code`,`menu_code`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('CGDR201600000000000000','SM2017041011423903570','admin',now(),NULL,'CD-CGD000006');

/*
-- Query: SELECT system_code,type,parent_key,dkey,dvalue,updater,now() as update_datetime,remark from tsys_dict WHERE system_code = 'CD-CGD000006'
LIMIT 0, 10000

-- Date: 2017-03-14 15:22
*/
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'user_status','用户状态','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','user_status','0','正常','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','user_status','1','程序锁定','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','user_status','2','人工锁定','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'id_kind','证件类型','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','id_kind','1','身份证','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'res_type','资源类型','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','res_type','1','菜单','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','res_type','2','按钮','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'lock_direction','锁定方向','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','lock_direction','1','用锁','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','lock_direction','2','解锁','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'role_level','角色等级','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','role_level','1','管理员','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','role_level','2','运营','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','role_level','3','运维','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0','','account_type','账户类型','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_type','CNY','人民币账户','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_type','XNB','虚拟币账户','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'currency_type','币种状态','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','currency_type','CNY','人民币','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','currency_type','XNB','虚拟币','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'account_status','用户/账户状态','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_status','0','正常','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_status','1','程序冻结','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_status','2','人工冻结','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0','','account_kind','账户类型','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_kind','C','C端用户 ','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_kind','B','B端用户','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','account_kind','P','平台','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'notice_status','公告状态','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','notice_status','0','未发布','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','notice_status','1','已发布','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','notice_status','2','已下架','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'toKind','针对人群','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','toKind','0','b端用户','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','toKind','1','c端用户','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'news_status','消息状态','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news_status','0','发送失败','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news_status','1','已发送','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news_status','2','发送失败','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0','','news2_status','新闻状态','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news2_status','0','草稿','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news2_status','1','上架中','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news2_status','2','已下架','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0','','news2_location','新闻UI位置','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news2_location','0','普通','admin',now(),'');
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','news2_location','1','热门','admin',now(),'');

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'demand_order_status','需求订单状态','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_order_status','0','进行中','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_order_status','91','用户取消','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_order_status','92','经销商取消','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_order_status','2','已完成','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'demand_status','需求状态','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_status','0','未上架','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_status','1','已上架','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_status','2','已下架','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_status','3','已派单','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_status','4','已接单','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_status','5','已取消','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','demand_status','6','已完成','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'dealer_status','经销商状态','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','dealer_status','0','未上架','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','dealer_status','1','已上架','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','dealer_status','2','已下架','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'hear_status','听单状态','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','hear_status','0','已停止','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','hear_status','1','听单中','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','hear_status','2','已派单','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'occupation','职业','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','occupation','0','水电工','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','occupation','1','设计师','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','occupation','2','装修业主','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'banner_location','banner位置','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','banner_location','index_banner','APP首页','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','banner_location','mall_banner','商城首页','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'assign_status','派单状态','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','assign_status','0','待接单','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','assign_status','1','已接单','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','assign_status','2','已拒绝','admin',now(),NULL);

INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','0',NULL,'find_content','找活内容','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','0','水管安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','1','暖气安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','2','电线安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','3','灯具安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','4','水暖安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','5','开关安装','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','6','买油漆','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','7','买水管','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','8','买电线','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','9','买开关','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','10','买洁具','admin',now(),NULL);
INSERT INTO `tsys_dict` (`system_code`,`type`,`parent_key`,`dkey`,`dvalue`,`updater`,`update_datetime`,`remark`) VALUES ('CD-CGD000006','1','find_content','11','买灯具','admin',now(),NULL);

/*
-- Query: SELECT ckey,cvalue,note,updater,now() as update_datetime,remark,system_code FROM tsys_config where system_code = 'CD-CGD000006'
LIMIT 0, 10000

-- Date: 2017-03-14 16:17
*/
INSERT INTO `tsys_config` (`ckey`,`cvalue`,`note`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('aboutus','关于我们','<p>全能水电工助手：关于我们</p>','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_config` (`ckey`,`cvalue`,`note`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('license','软件许可协议','<p>全能水电工助手：软件许可协议</p>','admin',now(),NULL,'CD-CGD000006');
INSERT INTO `tsys_config` (`ckey`,`cvalue`,`note`,`updater`,`update_datetime`,`remark`,`system_code`) VALUES ('telephone','服务热线','400-826-6222','admin',now(),'13516700987   0575-87628333','CD-CGD000006');

/*
-- Query: SELECT code,type,account,password,remark,company_code,system_code FROM tstd_cpassword WHERE system_code = 'CD-CGD000006'
LIMIT 0, 10000

-- Date: 2017-03-14 15:29
*/
INSERT INTO `tstd_cpassword` (`code`,`type`,`account`,`password`,`remark`,`company_code`,`system_code`) VALUES ('GD001','2','ACCESS_KEY','u8dSTT3kg9u3YVsoi-AiMFrDB7QqM6hH2xT-RbdA','','CD-CGD000006','CD-CGD000006');
INSERT INTO `tstd_cpassword` (`code`,`type`,`account`,`password`,`remark`,`company_code`,`system_code`) VALUES ('GD002','2','SECRET_KEY','8Udu6ouA_E8TPGFLXrYp-jO7nnHZww_xyqECyp4c','','CD-CGD000006','CD-CGD000006');
INSERT INTO `tstd_cpassword` (`code`,`type`,`account`,`password`,`remark`,`company_code`,`system_code`) VALUES ('GD003','2','bucket','qngd','','CD-CGD000006','CD-CGD000006');
INSERT INTO `tstd_cpassword` (`code`,`type`,`account`,`password`,`remark`,`company_code`,`system_code`) VALUES ('GD004','3','ACCESS_KEY','wxa1dd2295c1df9b1f','','CD-CGD000006','CD-CGD000006');
INSERT INTO `tstd_cpassword` (`code`,`type`,`account`,`password`,`remark`,`company_code`,`system_code`) VALUES ('GD005','3','SECRET_KEY','cce9c6d8c138f6a0120b59917be3d789','','CD-CGD000006','CD-CGD000006');