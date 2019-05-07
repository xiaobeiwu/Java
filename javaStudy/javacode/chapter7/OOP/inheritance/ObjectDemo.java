public class ObjectDemo {
    public static void main(String [] args){
        student stu=new student("Amy",2);
        System.out.println(stu.toString());

    }
}
class student {
    private String name;
    private  int age;
    public student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "姓名="+name+",年龄="+age;
    }
}