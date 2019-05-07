public class OperatorDemo2{
	public static void main(String []args){
		int num1=10;
		int num2=8;
		int num3=5;
		boolean res=false;
		String opera1="----逻辑运算符举例-----";
		System.out.println(opera1);
		System.out.println("------短路与------");
		System.out.println((num1>num2)&&(num2>num3));
		System.out.println((num1<num2)&&(num2>num3));
		System.out.println((num1<num2)&&(res=num2>num3));
		//短路与：条件1不成立，条件2就不会执行
		System.out.println(res);
		
		System.out.println("------短路或------");
		System.out.println((num1>num2)||(num2<num3));
		System.out.println((num1<num2)||(num2<num3));
		System.out.println((num1>num2)||(res=num2>num3));
		System.out.println(res);
		
		System.out.println("------非------");
		System.out.println(!(num1>num2));
		System.out.println(!(num1<num2));
		
/* 		System.out.println("------与------");
		System.out.println((num1>num2)&(num2>num3));
		System.out.println((num1<num2)&(num2>num3));
		System.out.println((num1<num2)&(res=num2>num3));
		System.out.println(res);
		 */
	
		System.out.println("------或------");
		System.out.println((num1>num2)|(res=num2>num3));
		System.out.println(res);
		
		System.out.println("------异或------");
		System.out.println((num1>num2)^(num2<num3));
		
		
	} 
	
	
	
}