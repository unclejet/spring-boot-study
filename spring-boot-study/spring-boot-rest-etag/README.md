# 背景
在学习rest-in-practice那本书时，讲到了etag  
就想在springboot项目中实践下，参考了此文  
https://www.baeldung.com/etags-for-rest-with-spring  
github地址：  
https://github.com/eugenp/tutorials/tree/master/spring-boot-rest

# 目标
此项目把关于etag部分的源码筛出来，并且在springboot IT框架下运行通过

# 核心点
1. 虽然测试入口是FooLiveTest，但是etag相关的测试都在AbstractBasicLiveTest
2. 只要在config类加了ShallowEtagHeaderFilter，就会在header头部带上etag字段
3. demo也演示了可以自定义etag，在FooController的findByIdWithCustomEtag方法

