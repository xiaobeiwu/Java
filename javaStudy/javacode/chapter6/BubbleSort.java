//ͨ����������һ�����飬�Ը�����ð������
import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args){
	//	int [] array={6,5,7,2,4,8,1,9,3,10,11,12,13};
		Scanner input=new Scanner(System.in);
		int [] array=new int [5];
		System.out.println("������"+array.length+"������");
		for(int i=0;i<array.length;i++){
		array[i]=input.nextInt();	
		}
		//N�����Ƚϵ�����ΪN-1
		for(int i=0;i<array.length-1;i++){
			//ÿһ�ֱȽϵĴ���ΪN-1-i
			for(int j=0;j<array.length-1-i;j++){
				//�Ƚ����ڵ���������С���ŵ�ǰ��
				if(array[j]>array[j+1]){
					//��������������ͨ��������ʱ����
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}	
		}
		//���ź�����������
		System.out.println("���龭��ð�������Ϊ��");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}