public class IfDemo{
	public static void main(String []args){
		
		
		int cash=150;
		char currency='$';
		//多重if...else
		if(cash>500){
			System.out.println("买别墅");
		}else if(cash>200){
			System.out.println("买个三室的房子");
		}else if(cash>100){
			System.out.println("买个两室的房子");
		}else {
			System.out.println("该努力赚钱啦！");
		}
		
		
/* 		int a=10;
		int b=2;
		int c;
		if(a>b){
			c=a;
		}else{
			c=b;
		}
		System.out.println(c); */
		
		//条件表达式，它是一个简化的if...else语句
		int a=10;
		int b=2;
		int c=(a>b)?a:b;  
		System.out.println(c);
		
		//if...else语句嵌套
		if(cash>=500){
			if(currency=='$'){
				System.out.println("买独栋别墅");
			}else{
				System.out.println("买联排别墅");
			}
			
		}else{
			System.out.println("买公寓");
		}
		
		
		
	}
	
}