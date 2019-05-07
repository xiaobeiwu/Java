//数组的声明、创建和初始化
import java.util.Scanner;
public class ArrayDemo{
	public static void main(String [] args){
		//先声明后创建
		System.out.println("****先声明后创建****");
		int [] array;
		array=new int[3];
		System.out.println(array.length);
		System.out.println(array[0]);
		
		//声明同时创建
		System.out.println("****声明同时创建****");
		int [] array1=new int[3];
		System.out.println(array1.length);
		System.out.println(array1[0]);
		
		//对数组中的元素进行赋值，通过下标来赋值
		System.out.println("****对数组中的元素通过下标来赋值****");
		array[0]=11;
		array[2]=33;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);

		//通过for循环进行统一遍历
		System.out.println("****通过for循环进行统一遍历****");
		for(int i=0;i<3;i++){
			System.out.println(array[i]);
		}

		//创建数组的同时做初始化
		System.out.println("****创建数组的同时做初始化****");	
		int [] array2={10,20,30};
		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i]);
		}
		
		int [] array3=new int[]{100,200,300};
		for(int i=0;i<array3.length;i++){
			System.out.println(array3[i]);
		}
		
		//通过键盘输入初始化
		System.out.println("****通过键盘输入初始化****");	
		int [] array4=new int[3];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<array4.length;i++){
			array4[i]=input.nextInt();
		}
		for(int i=0;i<array4.length;i++){
			System.out.println(array4[i]);
		}
	}
}