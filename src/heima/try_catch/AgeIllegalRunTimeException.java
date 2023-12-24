package heima.try_catch;
/**必须继承RuntimeException*/
public class AgeIllegalRunTimeException extends RuntimeException {
    //1.重写构造器
    public AgeIllegalRunTimeException() {
    }

    public AgeIllegalRunTimeException(String message) {
        //封装异常问题产生的原因
        super(message);
    }

}
