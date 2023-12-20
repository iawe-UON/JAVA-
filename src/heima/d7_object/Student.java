package heima.d7_object;

import java.util.Objects;
//Cloneable接口,相当于是一个标注，向JVM表示可以调克隆方法
public class Student extends Object implements Cloneable{
    private String name;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //使用super重写调用clone方法
        return super.clone();
    }

    //重写，比较两个对象内容是否是一样的
    @Override
    public boolean equals(Object o) {
        //判断两个对象是否地址一样，直接返回true
        //s2.equals(s2)
        if (this == o) return true;
        //判断是否为空地址或者比较者类型是否不一样
        //getClass()方法，返回对象类型：Student
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //返回对象的字符串表示形式
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
