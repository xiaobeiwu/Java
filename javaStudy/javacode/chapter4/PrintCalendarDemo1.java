import java.util.Scanner;
public class PrintCalendarDemo1{
	public static void main(String []args){
		int year;
		int month;
		int days=0;
		boolean isRn;
		System.out.println("*******欢迎使用万年历********");
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		year=input.nextInt();
		System.out.println("请输入月份：");
		month=input.nextInt();
		isRn=(year%400==0)||(year%4==0&&year%100!=0);
		if(isRn){
			System.out.println(year+"是闰年");
		} else {
			System.out.println(year+"是平年");
		}
		
		/* 1 3 5 7 8 10 12 ---31
		2 isRn==ture;29,else 28
		4 6 9 11 --30
		 */
		
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 2:
				if(isRn){
					days=29;
				}else {
					days=28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
			    days=30;
				break;
			
			default:
			    System.out.println("输入月份有误！");
		}
		
		System.out.println(year+"年"+month+"月"+"对应的天数是"+days);
		
		}
		
	
		
	}
	
