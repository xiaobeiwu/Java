public class OperatorDemo2{
	public static void main(String []args){
		int num1=10;
		int num2=8;
		int num3=5;
		boolean res=false;
		String opera1="----�߼����������-----";
		System.out.println(opera1);
		System.out.println("------��·��------");
		System.out.println((num1>num2)&&(num2>num3));
		System.out.println((num1<num2)&&(num2>num3));
		System.out.println((num1<num2)&&(res=num2>num3));
		//��·�룺����1������������2�Ͳ���ִ��
		System.out.println(res);
		
		System.out.println("------��·��------");
		System.out.println((num1>num2)||(num2<num3));
		System.out.println((num1<num2)||(num2<num3));
		System.out.println((num1>num2)||(res=num2>num3));
		System.out.println(res);
		
		System.out.println("------��------");
		System.out.println(!(num1>num2));
		System.out.println(!(num1<num2));
		
/* 		System.out.println("------��------");
		System.out.println((num1>num2)&(num2>num3));
		System.out.println((num1<num2)&(num2>num3));
		System.out.println((num1<num2)&(res=num2>num3));
		System.out.println(res);
		 */
	
		System.out.println("------��------");
		System.out.println((num1>num2)|(res=num2>num3));
		System.out.println(res);
		
		System.out.println("------���------");
		System.out.println((num1>num2)^(num2<num3));
		
		
	} 
	
	
	
}