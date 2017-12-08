## 前端公用库使用说明

### GOP.tips(msg, callback)
#### 功能描述
用户保存、删除成功后的通用提示弹框，该模态提示弹窗会在1.2秒后自动关闭。
#### 参数说明
| 参数       | 参数说明        |
| -------- | ----------- |
| msg      | 提示信息        |
| callback | 提示框显示后的回调函数 |

#### 使用示例
```js
<script src="text/javascript">
GOP.tip('保存成功'， function() {
   console.debug("do something");
});
</script>
```
### GOP.get(url, data, callback)
#### 功能描述
通用Ajax的GET请求，用于获取JSON响应数据。
#### 参数说明
| 参数       | 参数说明        |
| -------- | ----------- |
| url      | 请求接口url     |
| data     | 请求参数        |
| callback | 提示框显示后的回调函数 |

#### 使用示例
```javascript
<script src="text/javascript">
    GOP.get("/doc/getDocList.do", {current:1}, function(data) { console.info(data); });
</script>
```

### GOP.post(url, data, callback)
#### 功能描述
通用Ajax的POST请求，用于获取JSON响应数据。
#### 参数说明
url 请求接口URL
data 请求参数
callback 提示框显示后的回调函数
#### 使用示例
```javascript
GOP.post("/doc/getDocList.do", {current:1}, function(data) { console.info(data); });
```

### GOP.confirm(msg, callback)
#### 功能描述
确认提示弹框。
#### 参数说明
msg 提示信息
callback 用户选择确认后的回调函数

#### 使用示例
```javascript
<script src="text/javascript">
GOP.confirm('确定要删除该记录？'， function() {
   console.debug("do something");
});
</script>
```

### GOP.serializeForm2Json($form)
#### 功能描述
将表单数据序列化为JSON字符串。

#### 参数说明
| 参数    | 说明            |
| ----- | ------------- |
| $form | jQuery的form对象 |

#### 使用示例

```javascript
<script src="text/javascript">
var formJson = GOP.serializeForm2Json($("form"));
console.info(formJson);
</script>
```

### GOP.validateForm($form)
#### 功能描述
验证表单数据是否合法，提示用户输入合法数据。

#### 参数说明
$form jQuery的form对象

#### 使用说明
1.依赖Parseley插件，详见官网：http://parsleyjs.org/doc/index.html
data-parsley-required="true"
data-parsley-type="email"
data-parsley-type="number"
data-parsley-type="integer"
data-parsley-type="digits"
data-parsley-type="alphanum"
data-parsley-type="url"
data-parsley-minlength="6"
data-parsley-max="6"
data-parsley-range="[6, 10]"
data-parsley-pattern="\d+"
data-parsley-mincheck="3"
data-parsley-maxcheck="3"
data-parsley-check="[1, 3]"
data-parsley-equalto="#anotherfield"

#### 使用示例
```
<form id="form1">
<input type="text" name="email" data-parsley-required="true" data-parsley-type="email"/>
</form>

<script src="text/javascript">
//检验表单新增项合法
function validAddForm(flag) {
    if (GOP.validateForm($("#form1"))) {
        // 成功后的操作
    }
}
</script>
```

### GOP.dataGrid(url, data, $tableGrid)
#### 功能描述
用于渲染动态表格，会根据返回数据自动添加分页信息。

#### 参数说明
url 数据源URL
data 数据源URL参数
$tableGrid jQuery的table对象
#### 使用示例
```html
<table id="tableGrid" data-grid-template="dataListTpl">
    <thead>
        <tr>
            <th><p1>ID</p1></th>
            <th><p1>项目名称</p1></th>
            <th><p1>压测验收时间</p1></th>
            <th><p1>不删档服时间</p1></th>
            <th><p1>正式上线时间</p1></th>
            <th><p1>产品确认状态</p1></th>
        </tr>
    </thead>
</table>
<script type="text/template" id="dataListTpl">
    {{each object as value i}}
    <tr>
        <td>{{ value.projectId}}</td>
        <td><a onclick="showDetail({{ value.projectId}})" >{{ value.gameName}}</a></td>
        <td>{{formatDate value.pressureTestTime}}</td>
        <td>{{formatDate value.persistenceTestTime}}</td>
        <td>{{formatDate value.publishTime}}</td>
        <td>{{if value.status == 0}}
                <a href="/newProject/product/newProject.jspx?projectId={{value.projectId}}">待确认</a>
            {{/if}}
            {{if value.status == 1}}
                引进
            {{/if}}
            {{if value.status == -1}}
                不引进
            {{/if}}
        </td>
    </tr>
    {{/each}}
</script>
```
```javascript
// 初始化表格组件
var dataGrid = GOP.dataGrid('/newProject/all/listNewProject.do', {}, $('#tableGrid'));
// 手工重新载入表格数据
dataGrid.reloadDataGrid();
```