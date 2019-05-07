//冒泡排序--用静态方法来实现
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
		//返回值为空，且不带参数的方法
		public static void show1(){
			System.out.print("\n排序前数组：");
		}
		public static void show2(){
			System.out.print("\n排序后数组：");
		}

		//返回值为空，且带参数的方法
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
		
		//有返回值，且带参数的方法
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
			return array;//有返回值时，必须使用return关键字来返回
		}
		
		//返回值为空，带参数的方法
		public static void printArray(int [] array){
			for(int i=0;i<array.length;i++){
				System.out.print(array[i]+" ");
			}
		}
	
}