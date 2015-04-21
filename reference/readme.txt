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
metadata\schema

-----JVM--------------
同一个类被不同的类加载器加载，也会被视为不同的类
jdk7开始“去持久代”，方法区常连池不再保存String的缓存常量，而是只保存一个堆区的引用

(线程共享)类级别内存区域：堆区(存储对象等)、方法区(存储类信息，包括全局常量、静态变量、类信息等)
(线程隔离)方法级别的内存区域：程序计数器(标记当前线程执行到的指令)、jvm栈(存储方法中局部变量、返回类型等)、本地方法栈(类似于jvm栈，存储native方法相关信息)





------密码学-------------
* 编码字符集
* UTF-8\GBK\GB2312
* 散列算法
* MD5、SHA-0\1\2(secure Hash Algorithm)
* 加密工具类
* RSA\DES\AES\BASE64
* 
* 目前 MD5 已在 2005 年被中国数学家王小云发现有抗强冲突性的漏洞，给定一个散列值，
* 可以在几分钟内用普通计算机找到一个碰撞，即具有相同散列值的信息原文。
* 
* SHA-0 被发现漏洞可以将寻找碰撞的难度从 2^80 次暴力破解降低到 2^39 次，
* SHA-1 被发现漏洞可以将寻找碰撞的难度从 2^80 次降低到 2^63 次，
* SHA-2 系列函数还未发现漏洞。
* 
* 抗强冲突性，即给定一个散列值，无法找到另一个具有同样散列值的信息原文。
* 抗弱冲突性，即无法找到两个具有同样散列值的信息原文。

SSL/TSL
https:是一套安全措施，URL表明它使用了HTTPS，但HTTPS存在不同于HTTP的默认端口(443端口)及一个加密/身份验证层（在HTTP与TCP之间），这个系统的最初研发由网景公司进行
通过安装X.509数字证书(单向验证/双向验证)实现HTTPS协议传输，从而实现加密同时被认证
客户端是否能够信任这个站点的证书，首先取决于客户端程序是否导入了证书颁发者的根证书。
自己签名的证书只是用户产生的证书，没有正式在大家所熟知的认证权威那里注册过，因此不能确保它的真实性。但却能保证数据传输的安全性。
Keytool将密钥（key）和证书（certificates）存在一个称为keystore的文件中 
 一个证书是一个实体的数字签名,还包含这个实体的公钥.


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


>>



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
中断：打断(打断当前状态，状态可以是运行、等待等),如抛出InterruptedException

----
容易引起线程安全性(存在共享变量且具有竞态条件)的情况：CAS(check and set);读——修改——写
内置锁(方法调用所在的对象)：大部分情况同步代码块使用的都是内置锁，如HashTable使用的就是内置锁,如：
public synchronized void setValue(){}
可重入锁：同一个锁可以被同一个线程在不同的方法中获取
volatile变量：具有可见性但不能确保原子性
线程封闭：栈封闭(方法局部变量)、使用ThreadLocal变量(类似于全局变量，)
final：能确保初始化过程的安全性

每当需要对一组相关数据以原子方式操作时，就可以考虑创建一个不可变的类来包含这些数据

----
安全地构造对象
不要在构造过程中使this引用逸出
通过实例封闭设计线程安全类，类似于SynchronizedMap的方法，将非线程安全封装成线程安全；或者委托给现有的线程安全类
使用私有的锁对象而不是对象的内置锁(或者其他可通过公有方式访问的锁)，可以有许多优点，如：避免活跃性问题

安全地发布对象(对象的引用与对象的状态必须同时对其它线程可见)
在静态初始化块中初始化一个对象的引用
将对象的引用保存在volatile、AtomicReference、final类型域、由锁保护的域中
(不可变对象可以通过任意形式发布；可变对象必须安全发布)

安全地使用对象
确保方法的线程安全性

----
同步容器——vector、HashTable、Collections.synchronizedXxx等创建的
并发容器——LinkedBlockingQueue等队列(生产者消费者模式)、双端队列(工作密取)

同步工具类：阻塞队列、信号量、栅栏、闭锁等
闭锁：CountDownLatch(可以同步多个线程)、FutureTask(可以取消执行、获取执行结果，若没有完成则停在get状态直到执行完返回结果)
信号量：Semaphore
栅栏：CyclicBarrier(与闭锁不同的是闭锁是一次性的，一旦终止就不能重置)、Exchanger(类似于SynchronousQueue 的双向形式)

----
任务执行框架Executor
java中任务执行的抽象不是Thread而是Executor,Executor将任务的提交与执行策略解耦开来
Executor生命周期：创建、提交、开始、完成
Future.get()方法的异常处理可能有两种可能：任务遇到一个Exception；任务完成前被中断(Interrupt)
若超时未完成任务，则取消当前任务

Executor\ExecutorService\CompletionService
Executors\ThreadPoolExecutor\ExecutorCompletionService
Runnable\Callable\FutureTask
Future

JVM只有在所有的线程(非守护线程)全部终止后才会退出
定时调度：Timer、ScheduledThreadPoolExecutor、DelayQueue

-----
java没有提供任何机制安全地终止线程(stop、suspend存在严重缺陷)，但提供了中断，这是一种协作机制，一个线程终止另一个线程
响应中断时执行的操作：清除中断状态；抛出InterruptedException
中断是实现取消的最合理方式
除非你清楚中断策略，否则不要中断线程

线程与其他对象一样，可以被自由地共享
应用程序拥有服务(如线程池)，服务拥有工作线程，应用程序不应该直接关闭线程，而由服务关闭线程，如ExecutorService有shutdown方法
通过计数器、致命药丸等协助终止线程
处理线程泄露

线程池的配置，包括队列是否阻塞、是否有界、线程池是否有界等以避免活跃性问题
饱和策略——当有界队列被填满后，饱和策略将发挥作用
线程工厂
定制线程池——ThreadPoolExecutor

仅当内置锁无法满足需求时，才考虑ReentrantLock，jdk6时两种锁的性能已经差不多
读-写锁(ReentrantReadWriteLock)：允许多个线程并发地读取共享数据，但只能有一个线程写
显示Condition与内部条件队列、ReentrantLock与synchronize、条件谓词与条件队列
互斥与同步，个人认为互斥是一种特殊的同步，互斥时条件变量为1

-------------------
SortedMap\NavigableMap<interface>
TreeMap
由排序平衡二叉树(通过红黑二叉树实现平衡)实现TreeMap的有序性
插入的元素必须实现Comparable\Comparator接口

增、删(一般会改变结构)
改、查(迭代器、视图一般都是基于原数据)

WeakHashMap
通过WeakReference\ReferenceQueue实现，弱引用的键对应的Map条目会被回收

TreeSet
内部有TreeMap实现


Queue\Deque<interface>
ArrayDeque
ArrayBlockingQueue

LinkedList
LinkedBlockingDeque
LinkedBlockingQueue
ConcurrentLinkedQueue
双端队列数据模型为一个圈


java.lang.ref

引用——>对象
对象的回收根据下面对应引用的回收机制(空对象大小为8字节)，同时引用对象的“引用”本身也需要回收，一般引用占用的大小为系统的位数

ReferenceQueue：引用队列，被GC回收的对象引用会被放入该队列
强引用：正常创建对象的引用，即使内存溢出也不会回收该引用对应的对象
软引用：只有JVM快要内存溢出时才会回收该引用对应的对象，只有回收完这些引用对应的对象，如果还是内存不足才会抛出内存溢出异常，GC回收后将该引用放入引用队列
弱引用：当GC扫描时就会回收该引用对应的对象，同时将该引用放入引用队列
虚引用：形同虚设的引用，访问不了对象，GC回收对象后将该引用放入引用队列

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




















