//输入一个正整数，把整数逆序输出，比如输入12345，输出54321
import java.util.Scanner;
public class WhileDemo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个正整数：");
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