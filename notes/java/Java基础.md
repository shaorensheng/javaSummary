* 一、数据类型
    * 基本类型
    * 包装类型
    * 缓存池
* <a href="#6">六、关键字</a>
    *<a href="#6.1">final</a>
    *<a href="#6.2">static</a>
    
    
    
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


































