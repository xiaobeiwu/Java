//线性查找，查找键盘输入的数，在数组中的位置
import java.util.Scanner;
public class LinearSearch{
	public static void main(String[] args){
		int [] array={10,11,12,13,14,15,16,17};
		System.out.println("请输入要查找的数：");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int index=-1;//保存找到数所在数组中的下标，找不到等于-1
		for(int i=0;i<array.length;i++){
			if(number==array[i]){
				index=i+1;
				break;
			}			
		}
		if(index!=-1){
			System.out.println("找到数所在数组中的下标："+index);
		} else{
			System.out.println("no find!");
		}


	}
}