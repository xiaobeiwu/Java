//输出100-200之间的素数
public class PrimeDemo{
	public static void main(String []args){	
		for(int i=5;i<=10;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			//当是质数时打印

			if(!flag){
				continue;  // 继续下一次循环
			}
			System.out.println(i);
		}
		
		
	}
	
}