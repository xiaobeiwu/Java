public class IfDemo{
	public static void main(String []args){
		
		
		int cash=150;
		char currency='$';
		//����if...else
		if(cash>500){
			System.out.println("�����");
		}else if(cash>200){
			System.out.println("������ҵķ���");
		}else if(cash>100){
			System.out.println("������ҵķ���");
		}else {
			System.out.println("��Ŭ��׬Ǯ����");
		}
		
		
/* 		int a=10;
		int b=2;
		int c;
		if(a>b){
			c=a;
		}else{
			c=b;
		}
		System.out.println(c); */
		
		//�������ʽ������һ���򻯵�if...else���
		int a=10;
		int b=2;
		int c=(a>b)?a:b;  
		System.out.println(c);
		
		//if...else���Ƕ��
		if(cash>=500){
			if(currency=='$'){
				System.out.println("���������");
			}else{
				System.out.println("�����ű���");
			}
			
		}else{
			System.out.println("��Ԣ");
		}
		
		
		
	}
	
}