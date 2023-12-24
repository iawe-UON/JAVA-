package heima.try_catch;

public class Test_self_exception {
    public static void main(String[] args) throws Exception{
        /**自定义异常*/
        try {
            saveage(960);
            System.out.println("底层执行成功");
        } catch (Exception e) {
            /**接住底层的bug*/
            //e.printStackTrace();
            /**也可以继续往上抛*/
            throw new RuntimeException(e);
        }
        /**自定义编译时异常*/
        try {
            saveage2(960);
            System.out.println("底层执行成功");
        } catch (Exception e) {
            /**接住底层的bug*/
            e.printStackTrace();
            /**也可以继续往上抛*/
            //throw new Exception(e);
        }

    }
    public static void saveage(int age){
        if(age>0&&age<150){
            System.out.println("年龄被成功保存");
        }
        else {
            //自定义一个异常类，来封装自定义异常
            //自定义运行时异常，自定义编译时异常,一定要抛出这个异常对象
            throw new AgeIllegalRunTimeException("/Your Age is Illege");

        }
    }
    public static void saveage2(int age) throws AgeIllegalException{
        if(age>0&&age<150){
            System.out.println("年龄被成功保存");
        }
        else {
            //自定义一个异常类，来封装自定义异常
            //自定义运行时异常，自定义编译时异常,一定要抛出这个异常对象
            //throw用在方法上，抛出方法内部的异常
            throw new AgeIllegalException("/Your Age is Illege");

        }
    }
}
