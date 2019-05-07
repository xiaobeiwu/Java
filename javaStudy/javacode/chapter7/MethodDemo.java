//方法的调用
public class MethodDemo{

	public void method1(){
		System.out.println("返回类型为空且无参数的方法");
	}
	public String method2(){
		return "带有具体返回类型且无参数的方法";
	}
	public void method3(String name){
		System.out.println("返回类型为空且有参数的方法，参数为:"+name);
	}
	public String method4(String name,int age){
		return "带有具体返回类型且有参数的方法，参数-姓名："+name+",年龄："+age;
	}
	
	//传递基本数据类型的方法
	public void operatorData(int age){
		age++;
		System.out.println(age);
	}
	
	//传递引用数据类型的方法
	public void operatorArray(int [] array){
		array[2]=100;
		System.out.println(array[2]);
	}
	
	public static void main(String [] args){
		MethodDemo meth=new MethodDemo();
		meth.method1();
		String str=meth.method2();
		System.out.println(str);
		meth.method3("Xubao");
		System.out.println(meth.method4("Xubao",1));
		
		//传递基本数据类型方法的调用
		int age=1;
		meth.operatorData(age);
		System.out.println(age);
		
		//传递引用数据类型的方法的调用
		int [] array={1,2,3,4};
		meth.operatorArray(array);
		System.out.println(array[2]);
		
	}
}