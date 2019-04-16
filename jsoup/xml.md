### XML

#### 基础概念

- Extensible Markup Language 可扩展标记语言（标签都是自定义的）

#### xml与html的区别

- xml主要是作为配置文件；
- xml的语法严格，html语法松散
- xml是存储数据的，html是展示数据的

#### 基本语法

- xml文档必须以.xml结尾
- xml第一行必须定义为文档声明
- xml文档中有且仅有一个根标签
- 属性值必须使用引号（''、""）引起
- 标签必须正确关闭
- xml标签名称区分大小写

#### 约束

- 约束是规定xml文档的书写规则

- 分类：

  - DTD：一种简单的约束技术

    ![1555401492433](C:\Users\zhangjie\AppData\Roaming\Typora\typora-user-images\1555401492433.png)

    ![1555401651920](C:\Users\zhangjie\AppData\Roaming\Typora\typora-user-images\1555401651920.png)

  - Schema：一种复杂的约束技术

    ![1555401723653](C:\Users\zhangjie\AppData\Roaming\Typora\typora-user-images\1555401723653.png)

#### 解析

- DOM：将标记语言文档一次性加载进内存，在内存中形成一棵dom树（服务器端）
  - 优点：操作方便，可以对文档进行CRUD的所有操作
  - 缺点：占内存
- SAX：逐行读取，基于事件驱动的。（移动端）
  - 优点：不占内存
  - 缺点：只能读取不能增删改
- xml常见的解析器：
  - JAXP：sun公司提供的解析器，支持dom和sax两种思想（差劲，基本没人使用）
  - DOM4J：一款非常优秀的解析器
  - Jsoup：jsoup 是一款Java 的HTML解析器，可直接解析某个URL地址、HTML文本内容。它提供了一套非常省力的API，可通过DOM，CSS以及类似于jQuery的操作方法来取出和操作数据。
  - PULL：安卓操作系统内置的解析器（SAX）
- 