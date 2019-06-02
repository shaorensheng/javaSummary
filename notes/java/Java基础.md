* 一、数据类型
    * 基本类型
    * 包装类型
    * 缓存池
* <a href="#6">六、关键字</a>
    * <a href="#6.1">final</a>
    * <a href="#6.2">static</a>
    
    
    
# 一、数据类型
## 基本类型
* byte  8位
* char  16位
* short 16位
* int   32位
* float 32位
* long  64位
* double    64位
* boolean   
    boolean只有两个值：true、false，可以使用1 bit来存储，但是具体大小没有明确规定。
    JVM会在编译时期将boolean类型的数据转换为int，使用1表示true，0表示false。
    JVEM支持boolean数组，但是通过读写byte数组来实现。
   
## 包装类型
* Byte
* Character
* Short
* Integer
* Float
* Long
* Double
* Boolean

基本类型和包装类型之间的赋值使用自动装箱和拆箱完成。

## 缓存池
new Integer(123)与Integer.valueOf(123)的区别在于：
* new Integer(123)每次都会新建一个对象；
* Integer.valueOf(123)会使用缓存池中的对象，多次调用会取得同一个对象的引用。
```
Integer x = new Integer(123);
Integer y = new Integer(123);
System.out.println(x ==y);  //   false
Integer z = Integer.valueOf(123);
Integer k = Integer.valueOf(123);
System.out.println(z ==k);  //   true
```
在Java 8 中，Integer缓存池的大小默认为-128~127。
```
Integer a = 128;
Integer b = 128;
System.out.println(a == b); //  false
```
# 二、String
## 概览
String被声明为final，因为它不能被继承。  
在Java8中，String内部使用**char数组**存储数据。  
在Java9之后，String类的实现改用**byte数组**存储字符串，同时使用coder来标识使用了哪种编码。  

## String Pool
字符串常量池（String Pool）保存着所有字符串字面量，这些字面量在编译时期就确定。
不仅如此，还可以使用String的intern()方法在运行过程中将字符串添加到String Pool中。  

当一个字符串调用intern()方法时，如果String Pool中已经存在一个字符串和该字符串值相等
（使用equals()方法进行确定），那么就会返回String Pool中字符串的引用；否则，就会在String Pool
中添加一个新的字符串，并返回这个新字符串的引用。  

下面示例中，a和b采用new String()的方式新建了两个不同字符串，而i和j是通过intern()方法
取得一个字符串引用。intern()首先把a引用的字符串放到String Pool中，然后返回这个字符串
引用。因此i和j引用的是同一个字符串。
```
String a = new String("abc");
String b = new String("abc");
System.out.println(a == b);     //false
String i = a.intern()
String j = b.intern()
System.out.println(i == j);     //true
```
如果采用下面的形式，会自动地将字符串放入String Pool中。
```
String m = "asd";
String n = "asd";
System.out.println(m == n);     //true
```

## new String("abc)

使用这种方式一共会创建两个字符串对象（前提是String Pool中没有abc字符串对象）。
* "abc"属于字符串字面量，因此编译时期会在String Pool中创建一个字符串对象，
指向这个"abc"字符串字面量。
* 而使用new的方式会在堆中创建一个字符串对象。

## 不可变的好处

**1、可以缓存hash值**  
因为String的hash值经常被使用，例如：String用作HashMap的key，
不可变的特性可以使得hash值也不可变，因此只需要进行一次计算。
**2、String Pool的需要**  
如果一个String对象已经被创建过了，那么就会从String Pool中取得引用，
只有String是不可变的，才可能使用String Pool。  
**3、安全性**  
String经常作为参数，String不可变性可以保证参数不可变。
例如在作为网络连接参数的情况下，如果String是可变的，那么在网络连接的过程中，
String被改变，改变String对象的那一方以为现在连接的是其它主机，而实际情况却不一定是。  
**4、线程安全**  
String不可变性，天生具备线程安全，可以在多个线程中安全地使用。

## String、StringBuffer and StringBuilder

**1、可变性**  
* String不可变
* StingBuffer和StringBuilder可变
**2、线程安全**  
* String线程安全
* StringBuffer线程安全，内部使用synchronized进行同步
* StringBuilder线程不安全

# <a name="6">六、关键字</a>

## <a name="6.1">final</a>

**1、数据**  
声明数据为常量，可以是编译时常量，也可以是在运行时被初始化后不能被改变的常量。
* 对于基本类型，final时数值不变
* 对于引用类型，final使引用不变，也就不能引用其它对象，
但是被引用的对象本身是可以修改的。  

**2、方法**  
声明方法不能被子类重写。  

private方法隐式地被指定为final，如果在子类中定义的方法和基类中的一个private方法
签名相同，此时子类的方法不是重写基类方法，而是在子类中定义了一个新的方法。  

**3、类**  
声明类不允许被继承。

## <a name="6.2">static</a>

**1、静态变量**  

* 静态变量（用static修饰的成员变量）：又称为类变量，也就是说这个变量属于类的，类所有的实例都共享类变量，
可以直接通过类名来访问。静态变量在内存中只存在一份。
* 实例变量（不用static修饰的成员变量）：每创建一个实例就会产生一个实例变量，它与该实例同生共死。  

PS：成员变量包括：实例变量（不用static修饰）、类变量（静态变量用static修饰）
和常量（用static final修饰）。  

```java
public class A{
    private int x;              //成员变量、实例变量
    private static int y;       //成员变量、静态变量（类变量）
    private static final int Z; //成员变量、常量
    
    public static void main(String[] args){
      A a = new A();
      //x = a.x;      //Non-static field 'x' cannot be referenced from a static context
      int x = a.x;      
      int y = A.y;
    }
}
```

**2、静态方法**  

静态方法在类加载的时候就存在了，它不依赖于任何实例。所以静态方法必须有实现，
也就是说它不能是抽象方法。
```java
public abstract class A{
    public static void func1(){
        //方法体
    }
    //public abstract static void func2(); //Illegal combination of modifiers: 'abstract' and 'static'
}
```
只能访问所属类的静态字段和静态方法，方法中不能有this和super关键字。
```java
public class A{
    private static int x;
    private int y;
    public static void func1(){
        int a = x;
        //int b = y;        //Non-static field 'y' cannot be referenced from a static context
        //int b = this.y;   //'A.this' cannot be referenced from a static context
    }
}
```

**3、静态语句块**  

静态语句块在类初始化时运行一次。
```java
public class A{
    A(){
        System.out.println("这是个无参构造器");
    }
    static {
        System.out.println("这是个静态块");
    }
    public static void main(String[] args){
      A a1 = new A();
      A a2 = new A();
    }
}
```
执行结果
```
这是个静态块
这是个无参构造器
这是个无参构造器
```

**4、静态内部类**  

非静态内部类依赖于外部类的实例，而静态内部类不需要。

```java
public class OuterClass{
    class InnerClass{
    }
    static class staticInnerClass{
    }
    public static void main(String[] args){
      //InnerClass innerClass = new InnerClass();   //'OuterClass.this' cannot be referenced from a static context
      OuterClass outerClass = new OuterClass();
      InnerClass innerClass = outerClass.new InnerClass();
      StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
}
```
静态内部类不能访问外部的非静态变量和方法。

**5、静态导包**  

在使用静态变量和方法时不用再指明ClassName，从而简化代码，但可读性大大降低。

```
import static com.xxx.ClassName.*
```

**6、初始化顺序**  

静态变量和静态语句块优先于实例变量和普通语句块，静态变量和静态语句块的初始化顺序
决定于它们在代码中的顺序。
```java
public class Test{
    //首先：静态变量或静态块；取决于代码的顺序
    public static String staticField = "静态变量";
    static {
        System.out.println("静态语句块");
    }
    //其次：实例变量或普通语句块；取决于代码中顺序
    public String field = "实例变量";
    
    {
        System.out.println("普通语句块");
    }
    //最后：才是构造函数的初始化
    public Test(){
        System.out.println("无参构造器");
    }
}
```
存在继承的情况下，初始化顺序为：  
* 父类（静态变量、静态语句块）
* 子类（静态变量、静态语句块）
* 父类（实例变量、普通语句块）
* 父类（构造器）
* 子类（实例变量、普通语句块）
* 子类（构造器）



































