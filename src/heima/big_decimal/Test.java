package heima.big_decimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //bigdecimal用于解决浮点运算时的精度问题,浮点运算失真的问题，不能直接用小数去运算
        //1.把小数封装成字符串并且用bigdecimal来运算
        String a = new String("0.111111");
        BigDecimal a1 = new BigDecimal(a);
        //同
        BigDecimal a2 = BigDecimal.valueOf(0.00001);//流程是相同的
        BigDecimal a3 = a1.add(a2);//加法运算
        BigDecimal a4 = a1.subtract(a2);
        BigDecimal a5 = a1.multiply(a2);
        BigDecimal a6 = a1.divide(a2);

    }
}
