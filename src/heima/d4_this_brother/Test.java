package heima.d4_this_brother;

class student{
    private String name;
    private int age;
    private String schoolname;

    public student() {
    }

    public student(String name, int age) {
        //this.name = name;
        //this.age = age;
        //this.schoolname = "heima";
        this(name,age,"heima");
        //通过this调用兄弟构造器，并且this和super不能同时出现，并必须放在构造器的第一行
    }

    public student(String name, int age, String schoolname) {
        this.name = name;
        this.age = age;
        this.schoolname = schoolname;
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

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
}

public class Test {
    public static void main(String[] args) {
        student s1 = new student("kli",18,"heima");
        //实现，如果没有填写学校，默认为黑马程序员


    }
}
