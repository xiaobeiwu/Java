public class OperatorDemo1{
	public static void main(String []args){
		
		int num1=10;
		int num2=8;
		String str="�������:"; //�����������ͣ�String��д
		
		String opera1="----�������������-----";
		System.out.println(opera1);
		int res=num1+num2;
		System.out.println(res);
		System.out.println (str+res);//�ַ�������
		System.out.println(str+res+10);//�ַ�������
		System.out.println(str+(res+10));//�ַ�������
		System.out.println(str+res+10.5);//�ַ�������
		System.out.println(res+10+str);//�ַ�������
		
		System.out.println(str+(num1+num2));
		System.out.println(str+(num1-num2));
		System.out.println(str+num1*num2);
		System.out.println(str+num1/num2);
		System.out.println(str+num1%num2);
		
		String opera2="----��ֵ���������-----";
		System.out.println(opera2);
		//num1++;
		//++num1;������ʹ��++��ʱ�򣬲���++��ǰ�滹�Ǻ��棬���������1
		//System.out.println(str+num1);
		
		//num1--;
		//--num1;
		//System.out.println(str+num1);
		
		/*int data=num1++;
		//int data=num1;num1++;
		//���и�ֵ�����ʱ����++�ں���ʱ����ô���ȸ�ֵ��Ȼ���������һ
		System.out.println("data="+data+",num1="+num1);
		*/
		
		/*int data=++num1;
		//num1++;int data=num1;
		//���и�ֵ�����ʱ����++��ǰ��ʱ����ô���ȸ������һ��Ȼ���ٸ�ֵ
		System.out.println("data="+data+",num1="+num1);
		*/
		
/* 		num2+=2;
		System.out.println("num2="+num2); */
		
		short s=5;
		//s=s+3; //�������Ͳ�һ��
		s+=3;  //��������һ��
		System.out.println("s="+s);
		
		String opera3="----��ϵ���������-----";
		System.out.println(opera3);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>num2);
		System.out.println(num1<num2);

		
	} 
	
	
	
}