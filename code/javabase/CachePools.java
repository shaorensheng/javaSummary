package javabase;

/**
 * 包装类的缓存池
 *
 * @author shaorensheng
 * @date 2019/5/13 10:21
 */
public class CachePools {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d);

        String s = "asdsff,asde,fedfd,cdfer,";
        String e = "asd";
        System.out.println(s.contains(e));

        System.out.println(new Byte("123"));
        print(1);
        print(2);
        print(3);
        print(4);
        print(10);
    }


    public static void print(int num){
        if (num ==1){
            System.out.println("*");
            return;
        }
        for (int i = 1; i <= num; i++) {
            //每行的*数
           int x = 2 * i - 1;
           //每行的中间下标
           int z = x / 2 + 1;
           //每行的空白
           int empty = num - z;
           //空白占位
            for (int j = 0; j < empty; j++) {
                System.out.print(" ");
            }
            //*占位
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            //一次循环后换行
            System.out.println();
        }
    }
}
