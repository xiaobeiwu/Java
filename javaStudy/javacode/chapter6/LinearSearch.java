//���Բ��ң����Ҽ�������������������е�λ��
import java.util.Scanner;
public class LinearSearch{
	public static void main(String[] args){
		int [] array={10,11,12,13,14,15,16,17};
		System.out.println("������Ҫ���ҵ�����");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int index=-1;//�����ҵ������������е��±꣬�Ҳ�������-1
		for(int i=0;i<array.length;i++){
			if(number==array[i]){
				index=i+1;
				break;
			}			
		}
		if(index!=-1){
			System.out.println("�ҵ������������е��±꣺"+index);
		} else{
			System.out.println("no find!");
		}


	}
}