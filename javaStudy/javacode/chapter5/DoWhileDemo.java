//����Ȼ��1+2+...+n�պó���100ʱ��n��ֵ��
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