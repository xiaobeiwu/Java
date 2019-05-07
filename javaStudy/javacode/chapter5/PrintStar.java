public class PrintStar{
	public static void main(String []args){	
		//外循环控制打印的行数
		for(int i=1;i<=9;i++){
			//内循环控制每行打印的*个数
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();//换行
		}
		

	}
	
}