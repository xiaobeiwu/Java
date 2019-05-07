import java.util.Arrays;
public class ArraysDemo{
	public static void main(String [] args){
		int [] arraySrc1={42,35,6,9,12,23,25};
		
		//复制数组
		System.out.println("复制数组");
		int [] arrayDes1=Arrays.copyOf(arraySrc1,10);
		for(int i=0;i<arrayDes1.length;i++){
			System.out.print(arrayDes1[i]+" ");
		}
		
		//拷贝制定范围的数组到新的数组中去
		System.out.println("\n拷贝制定范围的数组到新的数组中去");
 		int[] arrayDes2=Arrays.copyOfRange(arraySrc1,2,7);
		for(int i=0;i<arrayDes2.length;i++){
			System.out.print(arrayDes2[i]+" ");
		} 
		
		//比较数组
		System.out.println("\n比较数组");
		int [] arraySrc2={4,8,6,7,12,23,25};
		boolean flag=Arrays.equals(arraySrc1,arraySrc2);
		if(!flag){
			System.out.println("no equals!");		
		}
		//填充数组
		System.out.println("\n填充数组");
		int [] arrayDes3=new int [10];
		//Arrays.fill(arrayDes3,11);
		Arrays.fill(arrayDes3,1,4,11);
		for(int i=0;i<arrayDes3.length;i++){
			System.out.print(arrayDes3[i]+" ");
		}
	    //排序
		System.out.println("\n排序数组");
		int [] arraySrc3={5,8,1,6,12,9,23,32,4};
		Arrays.sort(arraySrc3);
		for(int i=0;i<arraySrc3.length;i++){
			System.out.print(arraySrc3[i]+" ");
		}
		
		//按升序排列数组的指定范围
		System.out.println("\n排序数组指定范围");
		int [] arraySrc4={9,8,1,5,10,9,13,12,4};
		Arrays.sort(arraySrc4,5,8);
		for(int i=0;i<arraySrc4.length;i++){
			System.out.print(arraySrc4[i]+" ");
		}
		
		//system中的数组复制
		System.out.println("\n system中的数组复制");
		int [] arraySrc5={2,3,4,5};
		int [] arrayDes4={1,8,1,5,10,9,13,12,6};
		System.arraycopy(arraySrc5,0,arrayDes4,1,4);
		for(int i=0;i<arrayDes4.length;i++){
			System.out.print(arrayDes4[i]+" ");
		}		
		
	}
}