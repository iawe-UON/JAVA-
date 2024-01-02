package heima.release_resource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) {
        //关于释放流的问题，一旦程序中途出现异常，close()便无法释放内存，因为执行不到
        //所以可以使用try-catch-finally:不管程序是否正常执行，最终都会执行finally，除非虚拟机挂掉
        //千万不要在finally中返回数据，会导致永远只返回finally中的数据
        //一般用于在程序执行完成后进行资源的释放操作

        //方法2：try-with-resource：克服方法一的代码臃肿问题
        /**
         * try(定义流对象1，流对象2....){
         *
         * }catch{
         *
         * }
         * 自动化回收资源，不用写finally
         * */
        /**比如：
         * try(
         *                 InputStream is = new FileInputStream("xxx/xxx");
         *                 OutputStream os = new FileOutputStream("xxx/xxx")
         *                 //该括号内只能写资源对象
         *                 //资源对象继承autocloseable接口，都会实现一个close方法，并且在最后自动调用实现资源的释放
         *                 //只要最终实现autocloseable接口的对象，都叫资源
         *                 ){
         *
         *         }catch (){
         *
         *         }
         *
         * */



    }
}
