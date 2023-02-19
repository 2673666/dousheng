# 抖音简版之抖声（勇敢gogo队）
👨‍🏫 基础功能+互动方向
## 1. 开发环境
[测试apk下载地址](https://bytedance.feishu.cn/docs/doccnM9KkBAdyDhg8qaeGlIz7S7#)

windows 10

jdk版本：1.8

mysql版本：5.7.34

ide：idea 2020年3月版

## 2. 项目功能介绍
### (1) 刷视频
不用登录，打开app自动获取所有投稿视频，每次获取30条视频信息，按时间倒序排列
![在这里插入图片描述](https://img-blog.csdnimg.cn/a2488b23bc2b4ae4ac91002eab92e0f4.png)



## （2）注册功能
① 用户名唯一性，不可重复注册
② 密码必须大于或等于6位
![在这里插入图片描述](https://img-blog.csdnimg.cn/af9c2f12fb1d4199b109350da838c529.png)

## （3）登录功能
![在这里插入图片描述](https://img-blog.csdnimg.cn/894b7a325c514cd28b101380288088ba.png)
### (4) 已登录用户
#### ① 点赞（取消点赞）
![在这里插入图片描述](https://img-blog.csdnimg.cn/e82c0d4d8cef445abafbbc5ee952f0dd.png)

#### ② 评论
![在这里插入图片描述](https://img-blog.csdnimg.cn/81ed62ffa5d54c888a923ccda25ea434.png)

#### ③ 投稿视频
![在这里插入图片描述](https://img-blog.csdnimg.cn/03057d49a3b84d45b375b7a8a8f8f51f.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/33a5b3ae58e240d9b9678d196f0daa4a.png)

#### ④ 查看个人信息（点赞视频列表和投稿视频列表）
![在这里插入图片描述](https://img-blog.csdnimg.cn/fe4768a69ff64ef081e99e0ca44b7d47.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/852965901b28406086626223593018d9.png)
## 3. 项目启动
👨‍🏫 主要技术： Springboot + Mybatis + Maven
👨‍🏫 杂七杂八：Lombok注解开发、Rest 风格、generatorSqlmapCustom生成实体类、ffmpeg-platform 截取视频封面

	① 建一个名为 抖声的数据库，一键导入 dousheng.sql 生成数据库表
	
	② 修改 dousheng\src\main\resources 下的 application.yml 文件
	  主要是数据库（用户名密码），端口号可自行选择，默认指定8081
	  
	③ maven 一键导入项目依赖
	
	④ dousheng\src\main\java\com\douSheng\DouShengApplication.java 项目启动类  run

🤠 项目测试

	① 安装 doushengApp 到安卓设备或模拟器
	
	② 记录项目启动的 IP 地址和 端口号
	
	③ 打开 App 双击 “我” 配置 BaseUrl：http://(IP地址):(端口号)

## 4. 项目总结
① 项目收获

😴 对 Springboo 掌握程度更上一层楼
😴 学会了一些基础的业务需求的实现
😴 学会了 github 的一些基本操作

② 项目展望：

👨‍🏫 30天没能肝下 go 实在可惜，这门好像入了，又好像没入
👨‍🏫 user 类字段不足，导致无法获取个人信息详情页的喜欢视频数量和投稿视频数量
👨‍🏫 没有用上缓存层，高并发场景下数据库可能会遭不住，并且有脏读的风险
👨‍🏫 结果类过多，应该有更好的办法
👨‍🏫 截取视频封面的依赖过重
👨‍🏫 消息队列、微服务、分布式……
