package heima.d1_block;

public class Test {
    public static void main(String[] args) {
        //目标：认识静态代码块的概念与理解,了解特点和应用
        System.out.println(Student.number);
        System.out.println(Student.name);
        System.out.println("-----------------------------------------");
        Student t = new Student();
        Student t2 = new Student("koi");
    }
}
