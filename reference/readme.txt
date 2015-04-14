#/usr/bin/which: no unzip in (/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin:/root/bin)
考虑session集成存储，现在比较好的方案就是nosql存储，修改tomcat、jetty和jboss等session的存储方式是很容易的
根结构下的任何目录都可以作为挂载点，而您也可以将同一文件系统同时挂载于不同的挂载点上,但是不能在同一个挂载点上挂载多个不同的分区》》》
-----------------
inconceivable\prohibits\stipulations\for convenience
From a performance standpoint
ineligible\More generally
violates\perspective\Virtually
Caution should be exercised
comform to
on a best-effort basis
vice-versa
-------------------
模板方法模式——父类提供框架(包括一些基本方法)，子类负责实现基本方法的具体操作，经常在抽象类中这样用
单例模式——几种单例模式编写方法
适配器模式——对原有的接口进一步封装使之适配范围更广
策略模式——基于接口编程，对于同一个接口有多个不同的实现，在客户端可以选择不同的实现策略
前端控制器模式——统一集中管理调度请求




-------------------
SortedMap\NavigableMap<interface>
TreeMap
由排序平衡二叉树(通过红黑二叉树实现平衡)实现TreeMap的有序性
插入的元素必须实现Comparable\Comparator接口

增、删(一般会改变结构)
改、查(迭代器、视图一般都是基于原数据)

TreeSet
内部有TreeMap实现


-----------------------
Spring mvc
强大的契约式编程(惯例优于原则)
强大的数据格式化、验证、数据绑定机制

前端控制器(DispatcherServlet)
	
页面控制器(处理器)Controller
	//1、收集参数、验证参数  
	//2、绑定参数到命令对象  
	//3、将命令对象传入业务对象进行业务处理  
	//4、选择下一个页面  
	传统的通过实现Controller(Spring2.5之前)：有不同需求的控制器实现；控制页面缓存：根据cacheSize|last-midified|etagd等实现
	
	注解式控制器(Spring2.5引入)
	强大的请求映射规则、各种方法的映射规则、数据绑定、

视图解析器(ViewResolver)

处理器拦截器(HandlerInterceptor)
	推荐能使用servlet规范中的过滤器Filter实现的功能就用Filter实现，因为HandlerInteceptor只有在Spring Web MVC环境下才能使用，
	因此Filter是最通用的、最先应该使用的。如登录这种拦截器最好使用Filter来实现




















