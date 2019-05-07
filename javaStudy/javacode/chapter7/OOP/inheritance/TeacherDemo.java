public class TeacherDemo {
    public static void main(String [] args){
        JavaTeacher Java=new JavaTeacher("Jack","高新");
        Java.teaching();
        DbTeacher Db=new DbTeacher("Amy","中软");
        Db.teaching();

    }
}

class Teacher{
    private String name;
    private String school;
    public Teacher(String name,String school){
        this.name=name;
        this.school=school;
    }
    public String toString(){
        return "老师信息：姓名="+name+",学校="+school;
    }
    public void teaching(){
        System.out.println("教学工作：1、课件准备");
    }
}

class JavaTeacher extends Teacher{
    public JavaTeacher(String name,String school){
        super(name,school);
    }

    public void teaching(){
        System.out.println(super.toString());
        super.teaching();
        System.out.println("2、Java 编程");
    }

}

class DbTeacher extends Teacher{
    public DbTeacher(String name,String school){
        super(name,school);
    }
    public void teaching (){
        System.out.println(super.toString());
        super.teaching();
        System.out.println("2、数据库指令编写");
    }
}