//类的建模和对象的创建及使用
public class Dog{
	public String brand;
	public int age;
	
	public String toString(){
		return "这是一条"+brand+"，今年"+age+"岁";
	}
	public static void main(String [] args){
		Dog dog=new Dog();//构造了一个Dog类型的对象
		dog.brand="中华田园犬";
		dog.age=2;
		System.out.println(dog.toString());
	}
	
	
}