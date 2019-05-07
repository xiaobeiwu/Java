//
public class EmployeeDemo {
    public static void main(String []args){
	//	Employee java=new JavaTeacher(1,"Jone",5000.0);	//抽象类不能实例化？？？？？
		JavaTeacher java=new JavaTeacher(1,"Jone",5000.0);
		java.working();
        Leader leader=new Leader(2,"Jack",5000.0,600.2);
        leader.working();


    }
}
//抽象类
abstract class Employee{
    private int number;
    private String name;
    private double salary;
    public Employee(int number,String name,double salary){
        this.number=number;
        this.name=name;
        this.salary=salary;
    }
	public String toString(){
		return "name="+name+",number="+number+",salary="+salary;
	}
	//抽象方法的声明
    public abstract void working();
}
//一旦一个类继承了抽象类，那么这个类要么实现抽象类中的抽象，要么继续抽象下去
class JavaTeacher extends Employee{
    public JavaTeacher(int number,String name,double salary){
        super(number,name,salary);
    }
	//抽象方法的实现
    public void working(){
		System.out.println(super.toString());
        System.out.println("工作内容：Java课程的教学");
        System.out.println("Java考试的组织和打分");
    }
}

class Leader extends Employee{
	private double allowance;
    public Leader(int number,String name,double salary,double allowance){
        super(number,name,salary);
		this.allowance=allowance;
    }
	//抽象方法的实现
    public void working(){
		System.out.println(super.toString());
        System.out.println("工作内容：培训新员工");
        System.out.println("设计课程体系");
    }
}