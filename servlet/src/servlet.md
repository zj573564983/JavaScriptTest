### Servlet

#### 使用方式

- 可以使用GenericServlet
- 推荐使用HttpServlet；HttpServlet是对http协议的一种封装，简化操作（定义类继承HttpServlet；复写doGet、doPost）；HttpServlet实现了GenericServlet。
- 一个servlet可以定义多个访问路径（@WebServlet("/demo2")）
- 路径定义队则：
  - /xxx
  - /xxx/xxx
  - *.do

#### HTTP

##### 1.概念：Hyper Text Transfer Protocol超文本传输协议

- 传输协议：定义了客户端和服务器端通信时发送数据的格式
- 特点
  - 基于TCP/IP的高级协议
  - 默认端口80
  - 基于请求/响应模型：一次请求对应一次响应
  - 无状态的：每次请求之间相互独立，不能交互数据
- 历史版本
  - 1.0：每一次请求响应都会建立新的连接
  - 1.1：复用连接；对缓冲的支持比较好

#### 概念

- 运行在服务器端的小程序
- servlet就是一个接口，定义了java类被浏览器访问到的规则
- 所有的servlet都需要被实现

#### 执行原理

- 当服务器接收到客户端浏览器的请求后，会解析请求URL路径，获取访问的servlet的资源路径
- 查找web.xml文件，是否有对应的<url-pattern>标签内容（后面用WebServlet处理请求）
- 如果有，则找到对应的<servlet-class>全类名
- tomcat会将字节码文件加载到内存，并且创建其对象
- 调用其方法

#### 生命周期

- 被创建：执行init方法，只执行一次
  - 默认第一次访问时就会创建servlet
  - 可以通过<load-on-startup>控制（值为0或为正整数的时候会在服务器启动时创建，不然第一次访问才会创建）
  - 一个servlet在内存中只会有一个对象，servlet是单例的。多个用户同时访问时可能存在线程安全问题。-解决方法：尽量不要在servlet中定义成员变量。
- 提供服务：执行service方法，执行多次
- 被销毁：执行destroy方法，只执行一次
  - 服务器关闭时servlet销毁
  - 只有服务器正常关闭，才会执行destroy方法
  - destroy方法在servlet销毁之前执行