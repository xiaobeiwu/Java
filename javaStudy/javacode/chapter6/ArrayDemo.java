//����������������ͳ�ʼ��
import java.util.Scanner;
public class ArrayDemo{
	public static void main(String [] args){
		//�������󴴽�
		System.out.println("****�������󴴽�****");
		int [] array;
		array=new int[3];
		System.out.println(array.length);
		System.out.println(array[0]);
		
		//����ͬʱ����
		System.out.println("****����ͬʱ����****");
		int [] array1=new int[3];
		System.out.println(array1.length);
		System.out.println(array1[0]);
		
		//�������е�Ԫ�ؽ��и�ֵ��ͨ���±�����ֵ
		System.out.println("****�������е�Ԫ��ͨ���±�����ֵ****");
		array[0]=11;
		array[2]=33;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);

		//ͨ��forѭ������ͳһ����
		System.out.println("****ͨ��forѭ������ͳһ����****");
		for(int i=0;i<3;i++){
			System.out.println(array[i]);
		}

		//���������ͬʱ����ʼ��
		System.out.println("****���������ͬʱ����ʼ��****");	
		int [] array2={10,20,30};
		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i]);
		}
		
		int [] array3=new int[]{100,200,300};
		for(int i=0;i<array3.length;i++){
			System.out.println(array3[i]);
		}
		
		//ͨ�����������ʼ��
		System.out.println("****ͨ�����������ʼ��****");	
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