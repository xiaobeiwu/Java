//��ά����������������ͳ�ʼ��
public class ArrayDemo2{
	public static void main(String[] args){
		int [][] array=new int [3][];
		//ÿ����ά����ָ��һ����ά������
		array[0]=new int[3];
		array[1]=new int[2];
		array[2]=new int[3];
		//����ά������и�ֵ
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