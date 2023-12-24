package heima.try_catch;
/**必须继承编译时异常Exception*/
public class AgeIllegalException extends Exception{
    //1.重写构造器
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        //封装异常问题产生的原因
        super(message);
    }

}
