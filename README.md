# EasyWeb

## 简介

> SpringBoot、SpringSecurity、OAuth2.0整合的实现，前后端分离后台的实现示例。

## 使用技术

描述 | 框架 
:---|:---
核心框架 | Spring、Spring Boot、Spring MVC
持久层 | MyBatis、MyBatis-Plus、Druid
权限框架 | Spring Security、Security-OAuth2

> 开发工具为IDEA，数据库文件存放在项目的`src/main/resources/sql`目录下。

如果对oauth2上手有难度可以在附件这里下载easyweb-shiro，这个不需要redis，前端也是路由单页面：
[https://gitee.com/whvse/EasyWeb/attach_files](https://gitee.com/whvse/EasyWeb/attach_files)


## 导入项目

1. 开启redis(oauth2需要redis)、导入数据库
2. 确认application.properties配置信息是否正确
3. 在通过IDEA启动运行


## 前端页面

这个项目是后台，全是接口，需要页面可以参考下面的模板：

* 演示地址：[https://demo.easyweb.vip/](https://demo.easyweb.vip/iframe/)
* 演示账号：admin &emsp;&emsp; 密码：admin 



## 项目结构

### 后台接构
```text
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

## 项目截图

![登录](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7m6zggj30vq0jn0vb.jpg) 

![用户管理](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7ldhlbj315y0q6415.jpg)

![角色管理](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7lye0jj30vq0i8gmv.jpg)

![登录日志](https://ws1.sinaimg.cn/large/006a7GCKgy1fstc7logerj30vq0i8js2.jpg)

---

## 联系方式
### 欢迎加入“前后端分离技术交流群”
相互学习，共同进步！

![群二维码](https://ws1.sinaimg.cn/large/006a7GCKgy1fstbxycj1xj305k07m75h.jpg)


