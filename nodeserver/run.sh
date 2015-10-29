#!/bin/bash

# nodeserver 

USAGE="\e[1;32mUsage: $0 start|stop \e[0m"
APP_NAME="up24node"
LOG_ROOT="/data/weblog/$APP_NAME/"
DEFAULT_USER="kay"

if [ $# -ne 1 ];then
  echo -e $USAGE
  exit 1
fi

if [ $USER != $DEFAULT_USER ]; then
    echo -e "\e[1;31m[ERROR] Expected run by $DEFAULT_USER.\e[0m"
    exit 1;
fi

if [ $UID -eq 0 ]; then
  echo -e "\e[1;31m[ERROR] Forbidden run as root.\e[0m"
  exit 1
fi

case $1 in
  start)
    if [ ! -e $LOG_ROOT ];then
      mkdir -p $LOG_ROOT
    fi
      #pm2 start  -i 0 -u www-data -e $LOG_ROOT/error.log -o $LOG_ROOT/out.log --name $APP_NAME app.js -- nodecompress
      #pm2 start  -i 1 -u www-data -e $LOG_ROOT/error.log -o $LOG_ROOT/out.log --name $APP_NAME app.js
      pm2 start  -i 0 -u www-data -e $LOG_ROOT/error.log -o $LOG_ROOT/out.log --name $APP_NAME app.js
    ;;
  stop)
      pm2 delete $APP_NAME
    ;;
  *)
    echo -e $USAGE
    exit 1
  ;;
esac
