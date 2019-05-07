//求自然数1+2+...+n刚好超过100时，n的值？
public class DoWhileDemo{
	public static void main(String[] args){
		int n=0;
		int sum=0;	
		do{ 
			n++;
			sum+=n;
		}while(sum<=100);
		System.out.println("sum="+sum+";n="+n);
		
		
/* 		while(sum<=100){
			n++;
			sum+=n;
		}
		System.out.println("sum="+sum+";n="+n); */
	}
}