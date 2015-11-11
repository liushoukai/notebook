# Regex

## Group
|Syntax|Description|Regular Expression|Test String|
|---|---|---|---|
|`(exp)`|`匹配exp，并捕获文本到自动命名的组里`|`/(ab)(\s\1)*/`|`ab ab ab`|
|`(?<name>exp)`|`匹配exp，并捕获文本到名称为name的组里`|`/(?<g1>ab)(\s\k<g1>)*/`|`ab ab ab`|
|`(?:exp)`|`匹配exp，不捕获匹配的文本，也不给此分组分配组号`|``|``|
|`(?=exp)`|`匹配exp前面的位置`|`/\w*(?=world)/`|`helloworld`|
|`(?<=exp)`|`匹配后面跟的不是exp的位置`|`/(?<=hello)\w*/`|`helloworld`|
|`(?!exp)`|`匹配后面跟的不是exp的位置`|`/Hello,(?!John)/g`|`Hello,John Hello,Lucy`|
|`(?<!exp)`|`匹配前面不是exp的位置`|`/(?<!(aa))cc/g`|`aacc bbcc`|
|`(?#comment)`|`提供注释辅助阅读，不对正则表达式的处理产生任何影响`|`/(?#some comment)(ab)+/`|`ababab`|
