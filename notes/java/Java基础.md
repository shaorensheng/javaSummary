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