#!/bin/bash

# 用于Linux环境下，SVN的文件提交
# Author: LSK

echo -e "\e[1;32m**********************************\e[0m"
echo -e "\e[1;32m*                                *\e[0m"
echo -e "\e[1;32m*      Tools for SVN commit      *\e[0m"
echo -e "\e[1;32m*                                *\e[0m"
echo -e "\e[1;32m**********************************\e[0m"

#41 42 43 44 45 红 绿 黄 蓝 粉
TIPS="\e[1;42mTIPS\e[0m"
INFO="\e[1;44mINFO\e[0m"
WARN="\e[1;43mWARN\e[0m"
ERROR="\e[1;41mERROR\e[0m"

USAGE="$TIPS Usage: $0 message"

EXCLUDE_ARR=('para_check.php' 'class_map.php' 'static' '?')
EXCLUDE=""

echo
echo -e "\e[1;32mExclude File & Directory\e[0m"
for value in ${EXCLUDE_ARR[*]}; do
    if [ $value != '?' ]; then
        echo -e "\e[1;32m* $value\e[0m"
    fi
    EXCLUDE=`echo "$EXCLUDE | grep -v $value"`
done
echo

#处理SVN错误异常
svn info &> /tmp/commitor.$$
if [ $? -ne 0 ]; then
    tmp=`cat /tmp/commitor.$$`
    echo -e "$ERROR $tmp"
    exit 0
fi

#判断参数是否正确
if [ $# -ne 1 ]; then
    echo -e $USAGE
    exit 0
fi

MESSAGE=$1

tmp="svn st$EXCLUDE | awk '{print \$2}'|xargs echo|xargs -I {} echo svn commit {} -m $MESSAGE"

task=`echo $tmp | sh`

if [ -z "$task" ]; then
    echo -e "$WARN No uncommited files!"
else
    echo -e "$INFO $task"
fi
