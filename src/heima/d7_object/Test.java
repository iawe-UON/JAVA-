package heima.d7_object;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("赵敏",2);
        Student s2 = new Student("赵敏",2);
        System.out.println(s1);
        //System.out.println(s1.toString());

        //equals默认判断的是两个对象的地址是否是一样的，故返回是false
        //所以equals一般交给子类进行重写，来进行设计，不需要自行重写
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s1);
        //对象克隆：clone
        //复制一个一摸一样的新对象返回
        Student s3 = (Student) s2.clone();
        System.out.println(s2.equals(s3));
        System.out.println(s2 == s3);//地址不同
        //浅克隆：拷贝出的新对象和原对象数据一摸一样，引用类型的仅仅拷贝地址
        //深克隆：基本类型数据直接拷贝，字符串数据还是拷贝地址，引用类型不是仅仅拷贝地址，而是创建新的对象，再引用
        //深克隆实现：

    }
}
