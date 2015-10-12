# Alias definitions.
# You may want to put all your additions into a separate file like
# ~/.bash_aliases, instead of adding them here directly.

# ~/.bashrc
#if [ -f ~/.bash_aliases ]; then
#    . ~/.bash_aliases
#fi

alias c='clear'
alias ll='ls -alF --time-style="+%Y-%m-%d %H:%M:%S" --color=auto';

alias gitb='git branch -av '
alias gitc='git commit -am '
alias gitp='git push origin master'
alias gits='git status -sb '

alias jekylly='cd /data/blog/KayOnline.github.io/;jekyll server start --watch'

alias m='mysql -h 127.0.0.1 -P 3306 -uroot -proot -s --tee=/tmp/mysql-tee.log --default-character-set=utf8 passion'

alias mongoc='mongo 127.0.0.1:27017'
alias mongos='nohup /usr/bin/mongod >> /data/weblog/mongod.log &'

alias tail0='tail -f -n 0 '
alias tail20='tail -f -n 20 '
alias tail40='tail -f -n 40 '
alias tail80='tail -f -n 80 '

alias net='netstat -nlt|grep '

