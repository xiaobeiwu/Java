//ð������--�þ�̬������ʵ��
public class Bubble{
	public static void main(String[] args){
		int [] array1={6,5,7,2,4,8,9,10,11,12,13,14};
		int [] array2={22,5,11,33,4};
		
		Bubble.show1();
		Bubble.printArray(array1);
		Bubble.show2();
		Bubble.bubbleSort(array1);
		Bubble.printArray(array1);
		
		
		Bubble.show1();
		Bubble.printArray(array2);
		Bubble.show2();
		printArray(bubbleSorts(array2));
		
	}
		//����ֵΪ�գ��Ҳ��������ķ���
		public static void show1(){
			System.out.print("\n����ǰ���飺");
		}
		public static void show2(){
			System.out.print("\n��������飺");
		}

		//����ֵΪ�գ��Ҵ������ķ���
		public static void bubbleSort(int [] array){			
			for(int i=0;i<array.length-1;i++){
				for(int j=0;j<array.length-1-i;j++){
					if(array[j]>array[j+1]){
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
					
				}	
			}
		}
		
		//�з���ֵ���Ҵ������ķ���
		public static int [] bubbleSorts(int [] array){			
			for(int i=0;i<array.length-1;i++){
				for(int j=0;j<array.length-1-i;j++){
					if(array[j]>array[j+1]){
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
					
				}	
			}
			return array;//�з���ֵʱ������ʹ��return�ؼ���������
		}
		
		//����ֵΪ�գ��������ķ���
		public static void printArray(int [] array){
			for(int i=0;i<array.length;i++){
				System.out.print(array[i]+" ");
			}
		}
	
}