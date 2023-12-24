package heima.try_catch;

import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args){
        /**运行时异常，会编译通过，但是报运行时异常的错*/
        Integer.valueOf("123");
        Integer.valueOf("asd");
        int[] arr = {11,22,33};
        System.out.println(arr[6]);

        /**编译时异常，在编译阶段就会不通过*/
        //SimpleDateFormat sdf = new SimpleDateFormat("");
        /**try_catch添加：ctrl+alt+t*/


    }
}
