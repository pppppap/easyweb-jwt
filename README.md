# EasyWeb2.0


## 简介

> 前后端分离模式的后端管理系统开发平台，前端使用路由实现单页面应用，后端接口遵循RESTful风格。

* 演示地址：[http://47.98.107.251:8088](http://47.98.107.251:8088)
* 演示账号：admin &emsp;&emsp; 密码：admin 


## 使用技术
   本项目所选用的全部技术框架如下表，数据库sql文件位于/WebRoot/sql/目录中，sql导入之后把admin的密码改成d9892738d09afe06f886cc4dd7296da3，密码是123456：
#### 后端
描述 | 框架 
:---|:---
核心框架 | Spring、Spring MVC、Spring Boot
持久层 | MyBatis、Druid、MyBatis-Plus
权限框架 | Spring Security、OAuth2.0

#### 前端
描述 | 框架 
:---|:---
核心框架 | [Layui](http://www.layui.com/)、[jQuery](http://jquery.cuishifeng.cn/)
路由框架 | [Q.js](https://github.com/itorr/q.js) (纯js轻量级路由框架)
mvvm框架 | [pandyle.js](https://gitee.com/pandarrr/pandyle) (专为jquery编写的mvvm)
主要特色 | 单页面 / 响应式 / 简约 / 极易上手
 
开发工具为IDEA，数据库文件存放在项目的src/main/resources/sql目录下。


## 导入项目
1. 开启redis(oauth2需要redis)、导入数据库
2. 确认application.properties配置信息是否正确
3. 在通过IDEA启动运行


## 项目结构
```
|-src
   |-main
      |-java
      |    |-com.wf.ew
      |              |-common     // 核心模块
      |              |     |-config      // 存放SpringBoot配置类
      |              |     |     |-MyBatisPlusConfig.java      // MyBatisPlus配置
      |              |     |     |-SwaggerConfig.java          // Swagger2配置
      |              |     |
      |              |     |-exception   // 自定义异常类，统一异常处理器
      |              |     |-oauth       // 权限配置模块
      |              |     |-utils       // 工具类包
      |              |     |-BaseController.java    // controller基类
      |              |     |-JsonResult.java        // 结果集封装
      |              |     |-PageResult.java        // 分页结果集封装
      |              |
      |              |-system      // 系统管理模块
      |              |-xxxxxx      // 其他业务模块
      |              |
      |              |-EasyWebApplication.java     // SpringBoot启动类
      |              
      |-resources
            |-mapper     // mapper文件
            |    |-system
            |
            |-application.properties  // 配置文件
```

---------------------------------

## 项目截图

![登录](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7m6zggj30vq0jn0vb.jpg) 

![用户管理](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7ldhlbj315y0q6415.jpg)

![角色管理](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7lye0jj30vq0i8gmv.jpg)

![登录日志](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7logerj30vq0i8js2.jpg)
 
---------------------------
 
## 技术选型说明
       
### 说明1、为什么不用Vue、React来做前后端分离？
&emsp;&emsp;一般公司的后台管理系统都是表格，界面也比较简单，所以前端的工作基本都是有后端程序员来完成的，
后端人员大多都只会一个jquery和bootstrap，VUE需要有Webpack、Es6等基础，目前的管理系统大多
都使用iframe、SiteMesh技术，包括还有使用jsp的，所以让一个后端程序员搞前后端分离就够麻烦，
再搞vue的路由更是身心疲惫啊。

&emsp;&emsp;因此我选用了Q.js作为路由框架，选用layui作为核心框架，
layui的数据表格还是不错的，相比Vue、react来说后端人员看看文档就会了。
       
### 说明2、使用前后端分离的好处？
>具体分离和不分离的优劣可以看看论坛别人的讨论，我个人有以下几个观点：

1. 通过controller跳转和渲染页面(jstl、freemark等)，页面的加载速度会变得缓慢，不利于用户体验。 
2. APP的登录跟web不一样，app是只登一次并持久化(三个月、半年、甚至更久)，web是根session的过期时间来决定的，所以app项目的后端都会独立成一个项目，如果换成前后端分离的模式，换成基于token的验证，就可以只用一个后台叫api，前端不管是web、安卓、ios都可以公用。
3. 基于token的验证还可以解决多系统单点登录的问题，只要系统之间对于token验证方式一致，就可以一个token多个系统使用，如果是session还要共享session，很麻烦。

>注：后端输出动态页面网页会打开慢，但是ajax渲染数据会不利于SEO优化，像文章、博客、新闻
之类的网站最好是用后端动态输出页面可以利于SEO优化。 


### 说明3、使用路由实现单页面的好处
自古以来，网站都是分头部、左侧和底部的，在传统项目中，大多数都使用iframe或SiteMesh来实现，路由是最近比较流行的解决方案：
1. iframe，每个页面都要引入css、js，会重复加载资源，造成浪费。
2. SiteMesh，利用后端技术拼接渲染，浏览器加载页面还是全部刷新，左侧、头部、底部每次都重新加载一遍(访问速度慢)，用户体验不好。
3. 路由，算是真正的局部加载、局部刷新了，资源可以重复利用，提升用户操作体验！<br/>
<p>单页面的效果在客户端是必不可少的，比如APP中我们常见的底部三四个Tab切换，就是一个单页面的效果。 </p>  

-------------------
       
## 知识简单补充
### 1、什么是RESTful
大致可以总结以下三点：
1. URL代表资源。
   <p>例如关于用户的操作，url都应该是/user，不要带有动词(/getUserById)</p>
2. HTTP请求代表动作。
  <p>HTTP有八种请求，分别代表请求服务器的不同的动作方式，添删改查分别对应post、delete、put、get请求</p>
3. HTTP是无状态的请求。
   <p>传统的WEB中，浏览器传递cookie，服务器保存session，两者一一对应保持请求的状态，代表是一次会话，在RESTful中，每一次请求都应该是独立的，HTTP的请求是无状态的</p>
       
### 2、什么是token
   有人把token翻译成令牌，这个就很形象了，传统的web登录认证是把登录后的user存储在session中，判断session中有无user决定是否登录，如果要做记住密码或者持久化登录(APP)就有很大缺陷，浏览器会默认传递cookie代表一次会话，但是app客户端的请求是没有cookie的(虽然有第三方的工具可以实现cookie)，并且多系统单点登录还要共享session。<br/><br/>
   token认证的概念就是，使用账号密码验证之后服务器认为用户合法，给用户发一个令牌，令牌存储在客户端，js可以用localStorage，app存储在手机中，这个令牌包含一些权限，用户拿着这个令牌可以访问服务器的一些资源，客户端再访问每一个接口都需要传递这个令牌，可以放在header中统一设置，也可以放在参数中。  只要用户没有弄丢这个令牌，他就可以一直拿着这个令牌访问服务器的资源，不需要每次输入账号密码登录了，令牌有一个过期时间，过期了就失效了。如果用户弄丢令牌或者过期都需要重新登录，重新签发令牌 <br/><br/>
   举一个形象的例子，去酒店住房，第一次进去需要用身份证登记，然后给一个房卡，用身份证登记的过程就好比用账号密码登录，房卡就好比令牌token，然后你再进出酒店就拿着房卡就行了，不需要每次拿出身份证，这个房卡也是有一定的权限的，它只能开一个房间，不能开其他房间，我们token也是有权限的，你把房卡弄丢了你就要用身份证重新领一张房卡。
     
### 3、什么是前端路由
   我理解的就是页面局部加载，跟传统的局部刷新不同的就是url也会变化，是把一个url的内容加载到网页的局部区域，而不是整个页面跳转。  因为网站的url改变后浏览器默认是会跳转页面的，所以现在的路由普遍采用hash的方式，就是在url后面加#的方式，因为浏览器会忽略#后面的url，认为是同一页面。 
    
----------------
    
## 联系方式
### 1、欢迎加入“前后端分离技术交流群”：
![群二维码](https://ws1.sinaimg.cn/large/006a7GCKgy1fstbxycj1xj305k07m75h.jpg)
      
### 2、我要打赏：
程序猿撸码不易，如果这个轮子对您有用，不妨打赏一下！

![赞赏码](https://ws1.sinaimg.cn/large/006a7GCKgy1fstbz5ps0nj31340f00zf.jpg)
