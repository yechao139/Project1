package com.yechao;


import com.atguigu.Consumer;

/**
 * @author yechao
 * @date 2020-12-06
 */
public class TemplatesTest {
    //模板6 prsf :可生成private static final
    private static final Consumer cust = new Consumer();

    //变形 psf
    public static final int Num = 1;
    //变形 psfi
    public static final int NUM2 = 2;
    //变形psfs
    public static final String STR = "China";

    public static void main(String[] args) {
        System.err.println(Num);
        Object o = 1;
        synchronized (o) {

        }
        try {
//            lombok.val s = o.toString();
            String s1 = o.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean b = true;
        if (b) do b = false;
        while (b);

    }

    public static TemplatesTest getInstance() {
        return new TemplatesTest();
    }
}
