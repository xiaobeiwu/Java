public class DataDemo2 {
	public static void main(String[] args){
		//�Զ�����ת������ʽת����
		byte num1=10;
		int num2=num1;
		System.out.println(num2);
		
		long num3=num2;
		System.out.println(num3);
		
		float f=10.5f;//Ĭ�ϴ�С������double����
		double d=f;
		System.out.println(f);
		System.out.println(d);
		
		int num4=100;
		float num5=num4;
		System.out.println(num5);
		
		char c1='a';
		int num6=c1;//�ַ���ֵ�����ͱ���
		System.out.println(c1);
		System.out.println(num6);
		System.out.println(c1+10);
		
		//ǿ������ת������ʽת����
		int num7=10;
		short num8=(short)num7;
		System.out.println(num8);
		
		float num9=(float)10.25;
		System.out.println(num9);
		
		int num10=65;
		char num11=(char)num10;
		System.out.println(num11);
		
		int num12=10;
		double num13=10.6;
		double res=num12+num13;
		System.out.println(res);
		
		//�ܽ�byte<short(char)<int<long<float<double
		
	}
	
}