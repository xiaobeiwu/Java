//二维数组的声明、创建和初始化
public class ArrayDemo2{
	public static void main(String[] args){
		int [][] array=new int [3][];
		//每个高维数组指向一个低维的数组
		array[0]=new int[3];
		array[1]=new int[2];
		array[2]=new int[3];
		//给低维数组进行赋值
		array[0][0]=0;
		array[0][1]=1;
		array[0][2]=2;
		array[1][0]=10;
		array[1][1]=11;
		array[2][0]=100;
		array[2][1]=101;
		array[2][2]=111;
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+" ");
				
			}
			
				System.out.println();
		}
		
		
	}
}