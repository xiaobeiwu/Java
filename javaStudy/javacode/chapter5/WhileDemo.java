//����һ���������������������������������12345�����54321
import java.util.Scanner;
public class WhileDemo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����������");
		int num=input.nextInt();
		int reverse=0;
		int lastDigit=0;
		while(num>0){
			lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num/=10;
		}
		System.out.println("That num reversed is "+reverse);
	}
}