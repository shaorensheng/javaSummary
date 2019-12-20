package com.srs.code;
/**
 *
 * @author :srs
 * @version:v1.0.0 Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2018/5/17   srs                      v1.0.0        create
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader.toString());
        System.out.println(classLoader.getParent().toString());
        System.out.println(classLoader.getParent().getParent());
    }
}
