package com.atguigu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yechao
 * @date 2020-12-06
 */
public class Hello {

    //模板6 prsf :可生成private static final
    private static final Consumer cust = new Consumer();


    public static void main(String[] args) {
        //模板3 fori
        String[] arr = new String[]{"zs","lisi"};

        for (int i = 0; i < arr.length; i++) {

        }
        //变形iter
        for (String s : arr) {
            
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
        //模板4 list.for
        List list = new ArrayList<>();
        list.add(12);
        list.add("123");
        for (Object o : list) {

        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //
    }
    
    public void method1(){
        System.out.println("Hello.method1");
        int num = 1;
        System.out.println("num = " + num);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println();
        System.out.println(num);
        System.out.println("num = " + num);

    }

    public void method5(){
        //模板5 ifn
        List list = new ArrayList<>();
        list.add(12);
        list.add("123");

        if (list == null) {

        }
        //变形 inn
        if (list != null) {

        }
        //postfix completion中
        //变形 xx.null xx.nn
        if (list == null) {

        }
        if (list != null) {

        }
    }

    public void method6(){
        List list = new ArrayList<>();
        list.add(12);
        list.add("123");

        for (Object o :list) {
            o.toString();
        }
        for (Object o :list) {

        }

        List list2 = list instanceof ArrayList<?> ? ((ArrayList<?>) list) : null;

        ArrayList<?> list1 = list instanceof ArrayList<?> ? ((ArrayList<?>) list) : null;
        List<?> list3 = new ArrayList<>();

        //itar
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);

        }
        //iter
        for (Object o : list) {

        }
        if (list3 == null) {
            list3 = new ArrayList();
        }

        String[] arr = new String[]{"1","22"};
        //lst
        String s = arr[arr.length - 1];
        int min = Math.min( 2,  1);
        min = Math.max(min, 3);
        Object o = new Object();
        try {

        } finally {
        }


    }
}
