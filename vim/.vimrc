"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" General
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
set history=500 " Sets how many lines of history VIM has to remember
set autoread    " Set to auto read when a file is changed from the outside

" With a map leader it's possible to do extra key combinations
" like <leader>w saves the current file
" let mapleader = ","
" let g:mapleader = ","

" :W sudo saves the file 
command W w !sudo tee % > /dev/null

"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" Vundle Plugin
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
set nocompatible
filetype off
set rtp+=~/.vim/bundle/Vundle.vim
call vundle#begin()

Plugin 'gmarik/Vundle.vim'              " 插件管理器 
Plugin 'scrooloose/nerdtree'            " 目录树
Plugin 'flazz/vim-colorschemes'         " 语法高亮主题
Plugin 'vim-airline/vim-airline'        " 状态栏
Plugin 'vim-airline/vim-airline-themes' " 状态栏主题
Plugin 'Yggdroot/indentLine'            " 行缩进
Plugin 'Valloric/YouCompleteMe'         " 代码补全
Plugin 'marijnh/tern_for_vim'           " JS代码补全
Plugin 'kien/ctrlp.vim'                 " 文件查找
Plugin 'terryma/vim-multiple-cursors'   " 多行编辑
Plugin 'vim-scripts/javacomplete'       " Java代码补全
Plugin 'majutsushi/tagbar'              " 代码结构
Plugin 'maksimr/vim-jsbeautify'         " 代码格式化

" All of your Plugins must be added before the following line
call vundle#end()
filetype plugin indent on

" maksimr/vim-jsbeautify
map <c-f> :call JsBeautify()<cr>
autocmd FileType javascript noremap <buffer>  <c-f> :call JsBeautify()<cr>
autocmd FileType json noremap <buffer> <c-f> :call JsonBeautify()<cr>
autocmd FileType jsx noremap <buffer> <c-f> :call JsxBeautify()<cr>
autocmd FileType html noremap <buffer> <c-f> :call HtmlBeautify()<cr>
autocmd FileType css noremap <buffer> <c-f> :call CSSBeautify()<cr>

" scrooloose/nerdtree
nmap <C-t> :NERDTreeToggle<CR>
nmap <C-f> :NERDTreeFind<CR>
autocmd vimenter * NERDTree
autocmd StdinReadPre * let s:std_in=1
autocmd VimEnter * if argc() == 0 && !exists("s:std_in") | NERDTree | endif
autocmd bufenter * if (winnr("$") == 1 && exists("b:NERDTree") && b:NERDTree.isTabTree()) | q | endif
map <Right> :bn<cr>
map <Left>  :bp<cr>
map <Up>    :tabn<cr>
map <Down>  :tabp<cr>


" vim-airline/vim-airline
let g:airline#extensions#tabline#enabled = 1
let g:airline_theme = 'powerlineish'

" kien/ctrlp.vim
let g:ctrlp_map = '<c-p>'
let g:ctrlp_cmd = 'CtrlP'

""""""""""""""""""""""""""""""
" vim-scripts/javacomplete
""""""""""""""""""""""""""""""
setlocal omnifunc=javacomplete#Complete
autocmd FileType java set omnifunc=javacomplete#Complete
autocmd FileType java set completefunc=javacomplete#CompleteParamsInf

"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" VIM user interface
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
set wildmenu                    " Turn on the WiLd menu
set backspace=eol,start,indent  " Configure backspace so it acts as it should act
set ruler                       " Always show current position
set number                      " Always show line number
set relativenumber              " Always show relative line number
set laststatus=2                " Always show statusline
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" Colors and Fonts
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
syntax on           " Enable syntax highlighting
colorscheme monokai " Use monokai theme
"set background=dark
set encoding=utf8   " Set utf8 as standard encoding and en_US as the standard language
"set showcmd		" display incomplete commands
set hlsearch        " Search keywords highlighting
set ignorecase
"set t_Co=256        " Use 256 colours (Use this setting only if your terminal supports 256 colours)
"let termencoding=&encoding
"let g:Powerline_symbols = 'fancy'
"set guifont=Ubuntu\ Mono\ for\ Powerline\ 12
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" => Text, tab and indent related
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
set expandtab       " Use spaces instead of tabs
set smarttab        " Be smart when using tabs
set tabstop=4       " 1 tab == 4 spaces
set shiftwidth=4    " 1 >> or << == 4 spaces
set autoindent      " Auto indent after Enter

" Linebreak on 500 characters
set lbr
set tw=500

set wrap "Wrap lines

"Allow mouse control
set mouse=a
set mouse=v

" 禁用方向键
"map <Left>  <Nop>
"map <Right> <Nop>
"map <Up>    <Nop>
"map <Down>  <Nop> 
"map <tab> :bn<cr>
