## JavaScript编程语言

### 一、JavaScript简介

#### 1.概念

一门客户端脚本语言。（运行在客户端浏览器中的。每一个浏览器都有JavaScript的解析引擎）

####  2.脚本语言

与java等语言相比，它不需要编译，直接被浏览器解析执行。

#### 3.发展历史

- 1992年，Nombase公司，开发出第一门客户端脚本语言，专门用于表单的校验。命名为C--，后来更名为：ScriptEase
- 1995年，网景公司，开发出一门客户端脚本语言：LiveScript。后来请来sun公司的专家，修改LiveScript，命名为JavaScript
- 1996年，微软抄袭JavaScript开发出JScript语言
- 1997年，ECMA（欧洲计算机制造商协会）制定标准ECMAScript就是所有客户端脚本语言的标准。

### 二、JavaScript基础语法

#### 1.与html集合方式

- 内部js
- 外部js

#### 2.注释

- //
- /**/

#### 3.数据类型

- 原始数据类型：number、string、boolean、null、undefined
- 引用数据类型：对象

#### 4.变量

- 变量：一小块存储数据的内存空间
- java语言是强类型语言，JavaScript是弱类型语言

#### 5.运算符

- 一元运算符：++、+（正号）
- 算数运算符：+-*/
- 赋值运算符  =  +=
- 比较运算符 >   
- 逻辑运算符 && ||
- 三元运算符 ？：

#### 6.流程控制语句

- if else
- switch(js中可以接收任意类型的数据)
- while
- do 。。。while
- for

#### 7.js特殊语法

- 变量可以使用var定义，也可以不用。建议使用var定义。

### 三、JavaScript对象

#### 1.基础对象

- Function对象：一共有三种创建方式。

  1）var fun=new Function();

  2) function 方法名称（）{}

  3) var 方法名=function（）{}

- Array：数组对象

- Date对象

- Math对象：直接使用Math使用。如Math.PI

- Number对象

- String对象

- Global对象：全局对象。这个Global中封装的方法不需要对象就可以直接调用。如encodeURI、decodeURI。

- RegExp：正则表达式对象。正则表达式是定义字符串的组成规则。

  1）单个字符，[]如[a]、[ab]、[a-zA-Z0-9]。特殊符号代表特殊含义的单个字符：\d代表单个数字字符0-9；\w代表单个单词字符a-zA-Z0-9

  2）量词符号：？表示出现0次或1次；*表示出现0次或多次；+表示出现1次或多次；{m,n}代表m=<长度<=n

#### 2.JavaScript中的事件

- 常见事件：onclick-单击事件；ondbclick-双击事件；onblur-失去焦点；onfocus-获得焦点；onload：一张页面或一副图像完成加载；onchange-域的内容被改变；onselect-文本被选中；onsubmit-确认按钮被点击；anreset-重置按钮被点击。

#### 3.BOM

- BOM：Browser Object Model浏览器对象模型
- 组成：Window（窗口对象）、Navigator、Screen、History（历史记录对象）、Location（地址栏对象）

#### 4.DOM

- DOM：Document Object Model文档对象模型

- w3c DOM标准分为3个不同的部分：

  1）核心DOM-针对任何结构化的标准模型；

  - Document：文档对象
  - Element：元素对象
  - Attribute：属性对象
  - Text：文本对象
  - Comment：注释对象
  - Node：节点对象，其他5个的父对象

  2）XML DOM-针对XML文档的标准模型；

  3）HTML DOM-针对HTML文档的标准模型。











