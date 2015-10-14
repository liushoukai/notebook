#Vim插件

##Vundle

###安装Git

```
sudo apt-get install git
```

###下载Vundle

```
$git clone https://github.com/VundleVim/Vundle.vim.git ~/.vim/bundle/Vundle.vim
```

###在~/.vimrc文件中添加bundle配置

```
cd ~;wget https://raw.githubusercontent.com/liushoukai/notebook/master/vim/.vimrc
```

###安装bundle

```
$vim +BundleInstall +qall
```

###常用指令

```
安装:PluginInstall
更新:pluginUpdate
删除:pluginClean
搜索:PluginSearch
```

##Yggdroot/indentLine插件

代码缩进显示

1. :IndentLinesToggle  //开启\关闭显示缩进
2. :LeadingSpaceToggle //开启\关闭显示空格

