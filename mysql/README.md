##安装mysql

1.安装依赖
- Centos
apt-get install ncurses-devel
apt-get install cmake
- Ubuntu
apt-get install libncurses5-dev
apt-get install cmake

2.添加用户与用户组
sudo groupadd mysql
sudo useradd -r -g mysql mysql

3.添加软链
cd /usr/local
sudo ln -s /data/services/mysql-5.6.23 mysql
sudo chown -R mysql .
sudo chgrp -R mysql .

4.创建目录并修改用户组
/var/log/mysqld
/var/run/mysqld
/usr/local/mysql
/data/services/mysql-5.6.23

5.编译源码
tar -xzvf mysql-5.6.23.tar.gz
cd mysql-5.6.23
cmake .
-DCMAKE_INSTALL_PREFIX=/usr/local/mysql
-DSYSCONFDIR=/usr/local/mysql/conf
-DMYSQL_DATADIR=/usr/local/mysql/data
-DMYSQL_UNIX_ADDR=/var/run/mysqld/mysqld.sock
-DWITH_MYISAM_STORAGE_ENGINE=1
-DWITH_INNOBASE_STORAGE_ENGINE=1
-DWITH_MEMORY_STORAGE_ENGINE=1
-DENABLED_LOCAL_INFILE=1
-DWITH_PARTITION_STORAGE_ENGINE=1
-DMYSQL_TCP_PORT=3306
-DWITH_READLINE=1
-DEXTRA_CHARSETS=all
-DDEFAULT_CHARSET=utf8
-DDEFAULT_COLLATION=utf8_general_ci
-DCURSES_LIBRARY=/usr/lib/x86_64-linux-gnu/libncurses.so
-DCURSES_INCLUDE_PATH=/usr/include .

6.安装MySQL系统库
scripts/mysql_install_db --user=mysql

7.启动服务
sudo /usr/local/mysql/bin/mysqld_safe &

8.设置root用户密码
sudo /usr/local/mysql/bin/mysqladmin -u root password 'root'
sduo /usr/local/mysql/bin/mysqladmin -u root -h ubuntu password 'root'
sudo /usr/local/mysql/bin/mysql_secure_installation

9.注册MySQL服务
sudo cp ./support-files/mysql.server /etc/init.d/mysql
sudo service mysql start
sudo service mysql status
sudo service mysql stop

10.检查安装情况
cd mysql-test; perl mysql-test-run.pl
