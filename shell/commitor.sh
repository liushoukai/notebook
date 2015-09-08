#!/bin/bash

# Used for committing tracked files by SVN
# author: LSK


USAGE="\e[1;32mUsage: $0 message \e[0m"

echo -e "\e[1;32m**********************************\e[0m"
echo -e "\e[1;32m*                                *\e[0m"
echo -e "\e[1;32m*      Tools for SVN commit      *\e[0m"
echo -e "\e[1;32m*                                *\e[0m"
echo -e "\e[1;32m**********************************\e[0m"


exclude_arr=('para_check.php' 'class_map.php' 'static' '?')

exclude=""

echo
echo -e "\e[1;32mExclude File & Directory\e[0m"
for value in ${exclude_arr[*]}; do
    if [ $value != '?' ]; then
        echo -e "\e[1;32m* $value\e[0m"
    fi
    exclude=`echo "$exclude | grep -v $value"`
done
echo

if [ $# -ne 1 ]; then
    echo -e $USAGE
    exit 0
fi

MESSAGE=$1

tmp="svn st$exclude | awk '{print \$2}'|xargs echo|xargs -I {} echo svn commit {} -m $MESSAGE"

task=`echo $tmp | sh`
echo -e "\e[1;42mRun Task\e[0m \e[1;32m$task\e[0m"




