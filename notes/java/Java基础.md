* 一、数据类型
    * 基本类型
    * 包装类型
    * 缓存池
    
    
    
    
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
```java
String a = "123sdfsddfgd";
String b = "123sdfsddfgd";
System.out.println(a == b);
System.out.println(a.equals(b));
```
## 不可变的好处
