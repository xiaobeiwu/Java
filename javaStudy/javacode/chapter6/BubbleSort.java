//通过键盘输入一组数组，对该数组冒泡排序
import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args){
	//	int [] array={6,5,7,2,4,8,1,9,3,10,11,12,13};
		Scanner input=new Scanner(System.in);
		int [] array=new int [5];
		System.out.println("请输入"+array.length+"个数：");
		for(int i=0;i<array.length;i++){
		array[i]=input.nextInt();	
		}
		//N个数比较的轮数为N-1
		for(int i=0;i<array.length-1;i++){
			//每一轮比较的次数为N-1-i
			for(int j=0;j<array.length-1-i;j++){
				//比较相邻的两个数，小的排到前面
				if(array[j]>array[j+1]){
					//两个数做交换，通过设置临时变量
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}	
		}
		//把排好序的数组输出
		System.out.println("数组经过冒泡排序后为：");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}