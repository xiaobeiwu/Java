//线性查找，求数组中的最大值和最小值
import java.util.Scanner;
public class MaxMin{
	public static void main(String[] args){
		int [] array={10,11,12,13,25,15,16,17};
		int max=array[0];
		int min=array[0];
		for(int i=1;i<array.length;i++){
			if(max<array[i]){
				max=array[i];
			}
			if(min>array[i]){
				min=array[i];
			}
			
		}
		System.out.println("数组中的最大值为"+max);
		System.out.println("数组中的最小值为"+min);
		


	}
}