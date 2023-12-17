package heima.d1_design_pattern.hungry;

public class Test1 {
    public static void main(String[] args) {
        A a1 = A.getobject();
        A a2 = A.getobject();
        System.out.println(a1);
        System.out.println(a2);
        //发现a1，a2地址是一样的
    }
}
