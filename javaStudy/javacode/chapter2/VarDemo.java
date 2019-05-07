public class VarDemo
{
	public static void main(String [] args){
		//先声明后赋值
		int number;
		number=1;
		System.out.println(number);
		//声明的同时做初始化
		int data1=2;
		System.out.println(data1);
		
		//int  data2;
		//System.out.println(data2);//方法中所声明的变量必须初始化后才能使用
		
		//同时声明多个变量
		// int  data3,data4,data5=50;
		// System.out.println(data3);
		// System.out.println(data5);
		
		int  data3=30,data4=40,data5=50;
		System.out.println(data3);
		System.out.println(data5);
		
		// 不能声明同名变量
		// int data3=100;
		// System.out.println(data3);
		
		//关键字不能作为变量名
		// int final=20;
		// System.out.println(final);
		
		//变量名是区分大小写的
		int myScore=88;
		int myscore=99;
		myScore=100;//变量值被修改
		System.out.println(myScore);
		System.out.println(myscore);
	}
	
}