//static关键字
public class StaticDemo{
	public static void main(String [] args){
	//每个对象都有自己的一份独立的属性
/* 	Account acc1=new Account();
	acc1.number1++;
	acc1.shownumber1();
	//acc1.shownumber2();
	
	Account acc2=new Account();
	acc2.shownumber1();
	//acc2.shownumber2(); */
	
	//静态变量调用时，可以直接通过类名.成员来进行访问
	Account.number1++;
	System.out.println(Account.number1);
	Account.shownumber1();
	
	Account acc3=new Account();
	acc3.shownumber2();
	
	}

}

class Account{
	
	public static int number1=11;//静态变量（类变量），它不属于任何一个对象，被所有对象共享
	public int number2=22;
	
	//static 语句块
	//在类被加载时就会执行，只会执行一次，用来对静态变量进行赋值
	//优先于构造方法执行
	public Account(){
		System.out.println("construct");
	}
	static{
		System.out.println("static");
		number1=100;
		
	}
	
	//静态方法中不能访问非静态变量，静态方法中不能使用this
	public static void shownumber1(){
		System.out.println(number1);
	
	}
	
	//非静态的方法可以访问静态和非静态的属性和方法
	public void shownumber2(){
		System.out.println(number2);
		System.out.println("非静态方法访问静态变量："+number1);
		shownumber1();
	}
}

