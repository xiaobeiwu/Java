import java.util.Scanner;
public class SwitchDemo{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入1-5之间的一个数");
		int number=input.nextInt();
		/* if(number==1){
			System.out.println("1");
		}else if(number==2){
			System.out.println("2");
		}else if(number==3){
			System.out.println("3");
		}else if(number==4){
			System.out.println("4");
		}else if(number==5){
			System.out.println("5");	
		}else{
			System.out.println("error");
		} */
		
		/*  1.case后面所列出的常量不能重复
			2.break是可以省略的，一旦省略了，程序就会一直往下执行，直到遇到break为止，或switch结束为止
			3.case的顺序是可以颠倒的，default可以放在任何为止，一般推荐最后
			4.switch是用来匹配常量的，能匹配的类型有byte、short、int、char、String（jdk1.7版本开始才有的）
			  enum（jdk1.5）
			5.switch和if...else语句比较：
				switch适合做等值判断，不适合做区间判断，做等值判断时，语法更简洁；
			    多重if语句功能比switch更全面。
		*/
		switch(number){
			case 1:
			    System.out.println("1：固话业务");
				break;
			case 2:
			    System.out.println("2：移动业务");
				break;
			case 3:
			    System.out.println("3：企业网络业务");
				break;
			case 4:
			    System.out.println("4：个人网络业务");
				break;
			case 5:
			    System.out.println("5：人工台");
				break;
			default:
				System.out.println("error");
		}
		
	
		
	}
	
}