public class OperatorDemo1{
	public static void main(String []args){
		
		int num1=10;
		int num2=8;
		String str="操作结果:"; //引用数据类型，String大写
		
		String opera1="----算术运算符举例-----";
		System.out.println(opera1);
		int res=num1+num2;
		System.out.println(res);
		System.out.println (str+res);//字符串连接
		System.out.println(str+res+10);//字符串连接
		System.out.println(str+(res+10));//字符串连接
		System.out.println(str+res+10.5);//字符串连接
		System.out.println(res+10+str);//字符串连接
		
		System.out.println(str+(num1+num2));
		System.out.println(str+(num1-num2));
		System.out.println(str+num1*num2);
		System.out.println(str+num1/num2);
		System.out.println(str+num1%num2);
		
		String opera2="----赋值运算符举例-----";
		System.out.println(opera2);
		//num1++;
		//++num1;当单独使用++的时候，不管++在前面还是后面，都是自身加1
		//System.out.println(str+num1);
		
		//num1--;
		//--num1;
		//System.out.println(str+num1);
		
		/*int data=num1++;
		//int data=num1;num1++;
		//当有赋值运算符时，且++在后面时，那么会先赋值，然后再自身加一
		System.out.println("data="+data+",num1="+num1);
		*/
		
		/*int data=++num1;
		//num1++;int data=num1;
		//当有赋值运算符时，且++在前面时，那么会先赋自身加一，然后再赋值
		System.out.println("data="+data+",num1="+num1);
		*/
		
/* 		num2+=2;
		System.out.println("num2="+num2); */
		
		short s=5;
		//s=s+3; //数据类型不一致
		s+=3;  //数据类型一致
		System.out.println("s="+s);
		
		String opera3="----关系运算符举例-----";
		System.out.println(opera3);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>num2);
		System.out.println(num1<num2);

		
	} 
	
	
	
}