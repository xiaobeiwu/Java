//构造方法，用构造方法，会强制对所有属性进行初始化，可以避免单个初始化时个别被漏掉
public class ConstructDemo{
	public static void main(String [] args){
		Person p=new Person("家宝",2,"西安");
		// 1、在堆中开辟内存空间，给属性分配默认初始值
		// 2、假设属性一开始就赋值了，就进行赋值工作
		// 3、调用构造方法，对属性进行初始化
		
		// p.setName("家宝");
		// P.setcity("西安");
		System.out.println(p.toString());
		
	}

}


//用构造方法强制对所有属性进行初始化
//当一个类没有显式构造方式时，系统会有一个默认的无参构造方法，当然可以显式声明构造方法
class Person{
	//属性（字段）
	private String name;
	private int age;
	private String city;
	
/* 	//无参数构造方法
	public Person(){
		System.out.println("无参数的构造方法");
	} */
	
	//带参数的构造方法
	public Person(String tname,int tage,String tcity){
		name=tname;
		age=tage;
		city=tcity;
	}

	public void setName(String tname){
		name=tname;
	}	
	public String getname(){
		return name;
	}

	public void setage(int tage){
		age=tage;
	}
	public int getage(){
		return age;
	}
	
	
	public void setcity(String tcity){
		city=tcity;
	}
	public String getcity(){
		return city;
	}
	
	public String toString(){
		return "姓名："+name+",今年:"+age+"岁,家住："+city;
	}
	
}
	

