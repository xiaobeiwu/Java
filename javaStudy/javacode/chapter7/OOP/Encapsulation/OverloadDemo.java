
//方法的重载：方法名相同，参数列表不同。即方法名相同，参数类型不同，或者参数个数不同，跟返回类型无关。
public class OverloadDemo{
	public static void main(String []args){
		Printer pr=new Printer(1000.0);
		pr.print("便宜");
		Printer p=new Printer("Microsoft",2000.22);
		p.print("good",3);
	
	}	
}

	class Printer{
		private String brand="HP";
		private double price;
		
		//构造方法的重载，即调用构造方法的重载，来表达对象不同的初始化方式。
		public Printer(double price){
			this.price=price;
	
		}
		public Printer(String brand,double price){
			this.brand=brand;
			this.price=price;
	
		}
		
		//方法的重载

		public void print(String content){
			System.out.println("品牌="+brand+",价格="+price+content);
		}	
		
		public void print(String content,int index){
			System.out.println("品牌="+brand+content+",排名"+index);
		}		
	}
	
	