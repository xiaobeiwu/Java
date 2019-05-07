import java.util.Scanner;
public class Login{
	public static void main(String [] args){
		
		Scanner input=new Scanner(System.in);
		System.out.println("please input username:");
		String username=input.next();
	
		System.out.println("please input password:");
		String password=input.next();
		boolean label=username.equals("wuxiaobei");
		boolean labels=password.equals("123456");
		if(label&&labels){
			System.out.println(" Login successfully!");
			
		} else if(label||labels){
			System.out.println("username or password is wrong!");
			
		}
		else {
			System.out.println("logon failed!");
		}
		
	}
}