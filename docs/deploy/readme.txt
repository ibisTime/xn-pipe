部署步骤：
A,环境准备/检验----略过
B,数据库升级/检验
    B1,结构
    B2,初始化数据
C，程序升级/检验

1，eclipse导出war包

2. 本地war包上传至服务器
  scp xn-tour.war root@121.43.101.148:/home  
  T6dh%$%$ss1

3. 备份原先配置(如果第一次部署，跳过此步骤)
  ssh root@121.43.101.148 -p 22

  cd /home/wwwroot/tour/tomcat_tour_biz/webapps
  cp ./xn-tour/WEB-INF/classes/application.properties .
  cp ./xn-tour/WEB-INF/classes/config.properties .
  rm -rf xn-tour*
  mv /home/xn-tour.war .
  
4. 已备份配置文件放回原处,启停tomcat 
  mv -f application.properties ./xn-tour/WEB-INF/classes/
  mv -f config.properties ./xn-tour/WEB-INF/classes/
  
  ../bin/shutdown.sh
  ../bin/startup.sh
  
6. 验证程序
  http://121.43.101.148:5902/xn-tour/api
  
D,运营测试
  D1索取运营测试权限
  D2运营测试
  D3权限归还