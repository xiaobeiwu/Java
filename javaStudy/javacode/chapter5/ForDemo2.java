//请输出100以内能同时被3和7整除的正整数
public class ForDemo2{
	public static void main(String []args){	
	
		System.out.println("for循环计算结果为：");
		for(int num=1;num<100;num++){
			if((num%3==0)&&(num%7==0)){
				System.out.println(num);
			}

		}
		
		System.out.println("Dowhile循环计算结果为：");
		int num1=1;
		do{
			if(num1%3==0&&num1%7==0){
				System.out.println(num1);
			}
			num1++;
			
		}while(num1<100); 
		
		System.out.println("while循环计算结果为：");		
		int nums=1;
		while(nums<100){
			if((nums%3==0)&&(nums%7==0)){
				System.out.println(nums);
			}
			nums++;
			
		}

	}
	
}