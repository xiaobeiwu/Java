import java.util.Scanner;
public class SwitchDemo{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("������1-5֮���һ����");
		int number=input.nextInt();
		/* if(number==1){
			System.out.println("1");
		}else if(number==2){
			System.out.println("2");
		}else if(number==3){
			System.out.println("3");
		}else if(number==4){
			System.out.println("4");
		}else if(number==5){
			System.out.println("5");	
		}else{
			System.out.println("error");
		} */
		
		/*  1.case�������г��ĳ��������ظ�
			2.break�ǿ���ʡ�Եģ�һ��ʡ���ˣ�����ͻ�һֱ����ִ�У�ֱ������breakΪֹ����switch����Ϊֹ
			3.case��˳���ǿ��Եߵ��ģ�default���Է����κ�Ϊֹ��һ���Ƽ����
			4.switch������ƥ�䳣���ģ���ƥ���������byte��short��int��char��String��jdk1.7�汾��ʼ���еģ�
			  enum��jdk1.5��
			5.switch��if...else���Ƚϣ�
				switch�ʺ�����ֵ�жϣ����ʺ��������жϣ�����ֵ�ж�ʱ���﷨����ࣻ
			    ����if��书�ܱ�switch��ȫ�档
		*/
		switch(number){
			case 1:
			    System.out.println("1���̻�ҵ��");
				break;
			case 2:
			    System.out.println("2���ƶ�ҵ��");
				break;
			case 3:
			    System.out.println("3����ҵ����ҵ��");
				break;
			case 4:
			    System.out.println("4����������ҵ��");
				break;
			case 5:
			    System.out.println("5���˹�̨");
				break;
			default:
				System.out.println("error");
		}
		
	
		
	}
	
}