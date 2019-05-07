//学生类的建模
public class Student{
	//属性（字段）
	public int sno;
	public String sname;
	public int sage;
	public String smajor;
	public double sscore;
	
	//学生信息的方法
	public void studentInfor(){
	System.out.println("Student [sno="+sno+",sname="+sname+",sage="+sage+",smajor="+smajor+",sscore="+sscore+"]");

	}
	
	//参加课程的方法
	public void attendClass(String smajor){	
		System.out.println("smajor="+smajor);
	}
	
	//考试的方法
	public void exam(double sscore){
		if(sscore>=90.0){
			System.out.println("excellent");
		} else if(sscore>=80.0){
			System.out.println("good");
		} else {
			System.out.println("General");
		}
		
	}
	
	public static void main(String [] args){
		Student stu=new Student();
		stu.sno=01;
		stu.sname="Zona";
		stu.sage=2;
		stu.smajor="English";
		stu.sscore=99.8;
		stu.studentInfor();
		stu.attendClass(stu.smajor);
		stu.exam(stu.sscore);
		
	}
}