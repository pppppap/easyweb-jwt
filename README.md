# EasyWeb

|&emsp;[简介](#简介)&emsp; | &emsp;[使用技术](#使用技术)&emsp; | &emsp;[导入项目](#导入项目)&emsp; | &emsp;[项目结构](#项目结构)&emsp; | 
&emsp;[数据库设计](#数据库设计)&emsp; | &emsp;[项目截图](#项目截图)&emsp; | &emsp;[项目优点](#项目优点)&emsp; | 

|&emsp;[快速上手](#快速上手)&emsp; |&emsp;[相关知识补充](#知识简单补充)&emsp; | &emsp;[相关学习资料](#相关学习资料)&emsp; | &emsp;[更新日志](#更新日志)&emsp; | 
&emsp;[联系方式](#联系方式)&emsp;|

## 简介

> 前后端分离模式的后端管理系统开发平台，前端使用路由实现单页面应用，后端接口遵循RESTful风格。

* 演示地址：[http://47.98.107.251:8088/](http://47.98.107.251:8088/login.html)
* 演示账号：admin &emsp;&emsp; 密码：admin 


* 静态页面演示地址： [https://whvse.gitee.io/easywebpage/](https://whvse.gitee.io/easywebpage/login.html)

&emsp;&emsp;静态页面源代码地址：[EasyWebPage](https://gitee.com/whvse/EasyWebPage)，
EasyWeb的后台目前也许并不那么完善，甚至只能当做学习的项目，一个完善的开发平台需要花很长时间来打磨，所以
我先把页面分离出来，你们可以基于我的页面来搭自己的后台。&emsp;当然我仍在不断完善，大家可以在留言或
评论中发表自己的看法，以便于我继续完善。

&emsp;&emsp;后台是JavaWeb项目，非Java人员（纯前端或其他后台语言）请到[EasyWebPage](https://gitee.com/whvse/EasyWebPage)
下载静态页面使用，不要下载错了。

## 使用技术

### 后端
描述 | 框架 
:---|:---
核心框架 | Spring、Spring MVC、Spring Boot
持久层 | MyBatis、Druid、MyBatis-Plus
权限框架 | Spring Security、OAuth2.0

### 前端
描述 | 框架 
:---|:---
核心框架 | [Layui](http://www.layui.com/)、[jQuery](http://jquery.cuishifeng.cn/)
路由框架 | [Q.js](https://github.com/itorr/q.js) (纯js轻量级路由框架)
mvvm框架 | [pandyle.js](https://gitee.com/pandarrr/pandyle) (专为jquery编写的mvvm)
主要特色 | 单页面 / 响应式 / 简约 / 极易上手

> 开发工具为IDEA，数据库文件存放在项目的`src/main/resources/sql`目录下。


## 导入项目

### 后台导入和部署
1. 开启redis(oauth2需要redis)、导入数据库
2. 确认application.properties配置信息是否正确
3. 在通过IDEA启动运行

### 前端导入和部署
#### 不分离部署
1. 把前端页面放入后台项目的`src/main/resources/static`目录下面即可
2. 修改`module/config.js`里面的`base_url`为后台访问地址
3. 访问即可

#### 分离部署
1. 把前端页面放在`nginx`服务器的`html`文件夹下面
2. 修改`nginx/conf/nginx.conf`配置文件，设置代理以解决跨域问题
    ```
    http {
        server {
            # 加入以下配置，之前的配置全部不要动，这个location是新加入的
            location /api/ {
                proxy_pass  http://47.98.107.251:8088/; # 这个是后台接口所在的地址
            }
        }
    }
    ```
3. 修改`module/config.js`里面的`base_url`为`http://localhost:80/api/`，80是ngix的端口，localhost是ngix所在服务器的ip

> 前后端分离应该采用分离部署的方式，后台应该支持跨域资源共享，但是oauth2我刚接触，
> 在做跨域的时候无法做到对`/oatuh/`接口的跨域，所以目前只能通过ngix的反向代理解决跨域的问题

> 如果你担心跨域是否比不跨域更不安全，这种担心完全是多余的，因为跨域问题是只存在于浏览器中


## 项目结构

### 后台接构
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

### 快速上手
#### 后台快速上手

**如何添加自己的业务代码：**

&emsp;&emsp;跟common、system同级建一个包，名字为你的业务模块名称，然后下面依次建
controller、dao、model、service、service.impl等包，然后再resource/mapper下面也
建一个模块文件夹，里面放mapper的xml文件。

- `mapper.xml` 扫描路径是`classpath:mapper/**/*Mapper.xml`
- `druid` 的service扫描路径是 `com.wf.ew.*.service.*`
- `mapper` 的扫描路径是 `com.wf.ew.*.dao` ，<br>
   位于 `common/config/MybatisPlusConfig.java`


#### 前端快速上手
&emsp;&emsp;前端页面详细开发文档：[https://whvse.gitee.io/easywebpage/docs/](https://whvse.gitee.io/easywebpage/docs/)

### 前端结构
```
|-assets
|     |-css                     // 样式
|     |-images                  // 图片
|     |-libs                    // 第三方库
|
|-components            // html组件
|     |-system                  // 系统管理页面
|     |-xxxxxx                  // 其他业务页面
|     |-tpl                     // 公用组件
|     |     |-message.html                 // 消息
|     |-console.html            // 主页一
|     |-header.html             // 头部
|     |-side.html               // 侧导航
|
|-module                // js模块 (使用layui的模块开发方式)
|     |-admin.js                // admin模块
|     |-config.js                // config模块
|     |-index.js                // index模块
|
|-index.html            // 主界面
|-login.html            // 登陆界面
```


## 数据库设计
![数据库设计](https://ws1.sinaimg.cn/large/88052d6bgy1fsv8m4pbfmj213f0oradu.jpg)


## 项目截图

![登录](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7m6zggj30vq0jn0vb.jpg) 

![用户管理](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7ldhlbj315y0q6415.jpg)

![角色管理](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7lye0jj30vq0i8gmv.jpg)

![登录日志](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7logerj30vq0i8js2.jpg)

---

## 项目优点

### 1、前后端分离，一个后台就够了
**前后端分离的优势：**
1. 通过controller跳转和渲染页面(jstl、freemark等)，页面的加载速度会变得缓慢，不利于用户体验。 
2. app的登录跟web不一样，app登录一次并持久化(三个月、半年、甚至更久)，web是根session的过期时间
   来决定的，所以app项目的后台接口都会独立成一个项目，这样很多东西明明在web端后台已经写过了又要
   再写一遍，如果换成前后端分离的模式，换成基于token的验证，后台只写一个就可以了。
3. 基于token的验证还可以解决多系统单点登录的问题，只要系统之间对于token验证方式一致，就可以一个
   token多个系统使用，如果是session还要共享session，很麻烦。

**注：**<br>
&emsp;&emsp;后端输出动态页面网页会打开慢，但是ajax渲染数据会不利于SEO优化，像文章、博客、新闻
之类的网站最好是用后端动态输出页面可以利于SEO优化。

> <font color=#CA0C16>以上仅代表我个人观点，具体分离和不分离的优劣可以看看论坛的讨论。</font>

### 2、上手简单，用jquery实现vue的效果
&emsp;&emsp;后台管理系统都是表格，界面也比较简单，所以基本都是有后端程序员一条龙服务，后端人员大多
都只会一个jquery、bootstrap，vue需要学习webpack、es6、npm等基础，我不建议后端人员去学习前端的技术，
因为后端的技术还有很多需要我们去学习，我这里的前端所选用的框架都是基于jquery的，相比vue、react来说
后端人员看看文档就会了。

### 3、前端路由，单页面应用
&emsp;&emsp;一般网站都是分头部、左侧和底部的，在传统不分离的项目中，大多数都使用iframe或SiteMesh来实现，
在前后端分离的项目中路由是比较流行的解决方案，几种方案优劣比较：
1. iframe，每个页面都要引入css、js，会重复加载资源，造成浪费。
2. sitemesh，利用后端技术拼接渲染，浏览器加载页面还是全部刷新，左侧、头部、底部都会重新加载，访问速度慢。
3. 路由，真正实现局部加载，资源重复利用，提升用户操作体验。<br/>

---


## 知识简单补充

### 1、什么是RESTful
**大致可以总结以下三点：**
1. URL代表资源<br>
    例如关于用户的操作，url都应该是/user，不要带有动词(/getUserById)
2. HTTP请求代表动作<br>
    HTTP有八种请求，分别代表请求服务器的不同的动作方式，添删改查分别对应post、delete、put、get请求
3. HTTP是无状态的请求<br>
    传统的WEB中，浏览器传递cookie，服务器保存session，两者一一对应保持请求的状态，代表是一次会话，
    在RESTful中，每一次请求都应该是独立的，HTTP的请求是无状态的</p>

### 2、什么是token

&emsp;&emsp;基于token的认证方式是用户通过账号密码登录获取token，token就相当于访问后台接口的一把钥匙，
每次访问后台接口都需要传递token，token是存储在客户端，所以token只要不丢失就不需要再次做登录的操作，
当然token是有一个过期的时间的，过期了就相当于这把钥匙作废了，需要重新登录。

&emsp;&emsp;这种场景就是现在app的场景，而基于session的web网站浏览器关闭就需要重新登录。
关于auth2.0无状态鉴权的知识请前往[理解OAuth 2.0 - 阮一峰](http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html)查看。

### 3、什么是前端路由
&emsp;&emsp;我理解的就是页面局部加载，跟传统的局部刷新不同的就是url也会变化，是把一个url的内容加载到网页的局部区域，
而不是整个页面跳转。

&emsp;&emsp;因为网站的url改变后浏览器默认是会跳转页面的，所以现在的路由普遍采用hash的方式，就是在url后面加`#`的方式，
因为浏览器会忽略`#`后面的url，认为是同一页面。 

&emsp;&emsp;前端路由适合用在页面有公共区域的地方，只想改变局部内容，而且改变了局部内容url也对应变化，
这样用户可以复制url再打开就直接进入到相应的页面了，管理系统页面的侧边导航就是一个很好的例子。

---

## 相关学习资料

- [Spring Boot 从入门到进阶系列教程](http://www.spring4all.com/article/246)

- [Spring Security 从入门到进阶系列教程](http://www.spring4all.com/article/428)
- [理解OAuth 2.0 - 阮一峰](http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html)
- [基于Token的WEB后台认证机制](https://www.cnblogs.com/xiekeli/p/5607107.html)
- [Redis - 菜鸟教程](http://www.runoob.com/redis/redis-tutorial.html)
- [RESTful API 设计指南](http://www.ruanyifeng.com/blog/2014/05/restful_api.html)
- [使用Swagger2构建RESTful API](http://www.spring4all.com/article/251)
- [Swagger2 - 注解详细说明](http://www.spring4all.com/article/251)
- [SpringBoot - jar包 Linux后台启动](https://www.jianshu.com/p/5887e524de89)
- [IDEA SpringBoot 热部署+html修改自动刷新](https://my.oschina.net/yejunxi/blog/845752)
- [SpringBoot 多模块项目实践（附打包方法）](https://www.jianshu.com/p/59ceea4f029d)
- [markdown基本语法](https://www.jianshu.com/p/191d1e21f7ed)

 :smirk: 学如逆水行舟，不进则退~~~

---

## 更新日志

**2018-06-28 - 发布全新2.0版本**

- 使用IDEA、SpringBoot、SpringSecurity、OAuth2重构后台部分
- 前端引入pandyle.js（mvvm框架），填补layui模板引擎的短板
- 前端采用模块化开发方式，定义admin、config等公用模块，封装ajax请求
- 界面优化，借鉴layadmin的设计风格，改版登录页面

**2018-02-11 - 发布EasyWeb1.0版本**

- 后台使用Spring、SpringMVC、Mybatis框架，使用MyEclipes开发
- 权限使用拦截器自主设计出基于jjwt的权限框架[JwtPermission](https://github.com/whvcse/JwtPermission)，
   参考Shiro设计，简单易用
- 前端使用layui框架、q.js路由框架

&emsp;&emsp;如果你的项目较小，不想使用繁琐的oauth2.0，想体验JwtPermission，可以在附件中下载EasyWeb1.0版本，
根据github上JwtPermission的开发文档说明使用即可。

## 联系方式
### 1、欢迎加入“前后端分离技术交流群”：
![群二维码](https://ws1.sinaimg.cn/large/006a7GCKgy1fstbxycj1xj305k07m75h.jpg)

### 2、我要打赏：
都是猿友，撸码不易，如果这个轮子对你有用，不妨打赏一下！
