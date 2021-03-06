## volatile

1、Volatile简介  
volatile作为java中的关键词之一，用以声明变量的值可能随时会被别的线程修改，
使用volatile修饰的变量会强制将修改的值立即写入主存，主存中值的更新会使缓存中的值失效
（非volatile变量不具备这样的特性，非volatile变量的值会被缓存，线程A更新了这个值，
线程B读取这个变量的值时可能读到的并不是线程A更新后的值）。volatile会禁止指令重排。  
2、Volatile特性  
volatile具有可见性、有序性，不具备原子性。  
PS： volatile不具备原子性，这是volatile与java中的synchronized、java.util.concurrent.locks.Lock
最大的功能差异。  
  
原子性：指多个操作不存在只执行一部分的情况，要不全部成功，要不全部失败。  
可见性：当多个线程访问同一个变量x时，线程1修改了变量x的值，
线程1、线程2。。。线程n能够立即读取到线程1修改后的值。  
有序性：程序执行时按照代码书写的先后顺序执行。在Java内存模型中，
允许编译器和处理器对指令进行重排序，但是重排序过程不会影响到单线程
程序的执行，却会影响到多线程并发执行的正确性。  
**指令重排**  


3、Volatile适用场景  
* 适用于对变量的写操作不依赖于当前值，对变量的读取操作不依赖于非volatile变量。
* 适用于读多写少的场景。
* 可用作状态标志。
* JDK中volatile应用：JDK中ConcurrentHashMap的Entry的value和next被声明为volatile，
AtomicLong中的value被声明为volatile。AtomicLong通过CAS原理（也可以理解为乐观锁）保证了原子性。

4、volatile VS  synchronized  
volatile和synchronized修饰变量、方法、代码段

特性|volatile|synchronized
:--:|:--:|:--:
可见性|✔|✔
有序性|✔|✔
原子性|✖|✔
线程阻塞|✖|✔

volatile相比synchronized，不会让线程阻塞，响应速度高。