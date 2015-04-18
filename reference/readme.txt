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
in preference to
-----JVM--------------
同一个类被不同的类加载器加载，也会被视为不同的类
jdk7开始“去持久代”，方法区常连池不再保存String的缓存常量，而是只保存一个堆区的引用

(线程共享)类级别内存区域：堆区(存储对象等)、方法区(存储类信息，包括全局常量、静态变量、类信息等)
(线程隔离)方法级别的内存区域：程序计数器(标记当前线程执行到的指令)、jvm栈(存储方法中局部变量、返回类型等)、本地方法栈(类似于jvm栈，存储native方法相关信息)





------other-------------
i love you





-------------------
单一、隔离、开闭、里氏替换、依赖倒置、迪米特 原则

模板方法模式——父类提供框架(包括一些基本方法)，子类负责实现基本方法的具体操作，经常在抽象类中这样用
单例模式——几种单例模式编写方法
适配器模式——对原有的接口进一步封装使之适配范围更广
策略模式——基于接口编程，对于同一个接口有多个不同的实现，在客户端可以选择不同的实现策略
前端控制器模式——统一集中管理调度请求
包装器(装饰器)模式——IO流、spring IOC容器实现、链表节点—>包装成链表 等到处有使用该模式
	通过包装提供更好的服务，同时可以隐藏内部实现
	advinceService<————service<————factory
			/|\			 |			 |
			 |————被包装 ———|————被包装————|



抽象设计
interface：抽象；为不同的实现定制不同的方法




-----------------------
spring IOC
spring容器中配置bean作用:可以通过容器管理相关类的实例；对类配置具体的实现参数。解耦
当然你可以自己根据这个BeanFactory来实现自己的IOC容器，但这个没有必要，因为Spring已经为我们准备好了一系列工厂来让我们使用。
比如XmlBeanFactory就是针对最基础的BeanFactory的IOC容器的实现 - 这个实现使用xml来定义IOC容器中的bean

读取器读取资源和注册bean定义信息的整个过程，基本上是和上下文的处理是一样的，从这里我们可以看到上下文和 XmlBeanFactory这两种IOC容器的区别，
BeanFactory往往不具备对资源定义的能力，而上下文可以自己完成资源定义，从这个角度上看上下文更好用一些，ApplicationContext提供IoC容器的主要接口


spring AOP（声明式、注解式）
Spring AOP 内部的两种代理方法： JDK 动态代理和 CGLIB 代理。




Spring MVC
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
	都是HandlerChain中的一些handler
	推荐能使用servlet规范中的过滤器Filter实现的功能就用Filter实现，因为HandlerInteceptor只有在Spring Web MVC环境下才能使用，
	因此Filter是最通用的、最先应该使用的。如登录这种拦截器最好使用Filter来实现




------concurrent-------------
Condition中await、signal方法：一般总在同步块中执行，且Condition 应该总是在一个循环中被等待；Condition 实现可以提供不同于 Object 监视器方法的行为和语义，比如受保证的通知排序，或者在执行通知时不需要保持一个锁。
CPU中：waiting状态(挂起、阻塞、等待等)、ready状态(在队列中等待被调度运行)、running状态(正在执行)
sleep\wait
1、这两个方法来自不同的类分别是Thread和Object
2、最主要是sleep方法没有释放锁，等待一定的时间之后，自动醒来进入到可运行状态，不会马上进入运行状态，因为线程调度机制恢复线程的运行也需要时间；而 wait 方法释放了锁，使得其他线程可以使用同步控制块或者方法。
中断：打断(打断当前状态，状态可以是运行、等待等)






-------------------
SortedMap\NavigableMap<interface>
TreeMap
由排序平衡二叉树(通过红黑二叉树实现平衡)实现TreeMap的有序性
插入的元素必须实现Comparable\Comparator接口

增、删(一般会改变结构)
改、查(迭代器、视图一般都是基于原数据)

TreeSet
内部有TreeMap实现


Queue\Deque<interface>
ArrayDeque
ArrayBlockingQueue
LinkedBlockingDeque
LinkedBlockingQueue
ConcurrentLinkedQueue



------------------------

BIO

InputStream\OutPutStream
Reader\Writer
文件File
网络IO Socket

NIO
ByteBuffer\Channel\Selector\DirectByteBuffer

NIO中引入了非阻塞I/O的支持，不过只限于套接字I/O操作。
所有继承自SelectableChannel的通道类都可以通过configureBlocking方法来设置是否采用非阻塞模式
socket\channel都是一边读则另一边写
XMPP、MQTT




















