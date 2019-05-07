public class StudentDemo {
    public static void main(String [] args){
        Kids k=new Kids("Zona",1,"莱恩幼儿园");
        k.studying();
        Elmentary elem=new Elmentary("Amy",2,"高新国际幼儿园");
        elem.studying();

    }
}

class Student{
    private String name;
    private int number;
    private  String school;
    public Student(String name,int number,String school){
        System.out.println("学生姓名："+name+",学号="+number+",学校="+school);
    }
    public void studying(){
        System.out.println("学前准备");
    }
}
class Kids extends Student{
    public Kids(String name,int number,String school){
        super(name,number,school);
    }
    public void studying(){
        System.out.println("素质教育");
    }
}

class Elmentary  extends Student{
    public Elmentary(String name,int number,String school){
        super(name,number,school);
    }
    public void studying(){
        System.out.println("应试教育");
    }
}