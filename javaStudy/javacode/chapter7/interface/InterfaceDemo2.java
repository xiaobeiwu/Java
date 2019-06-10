public class InterfaceDemo2 {
    public static void main(String [] args){

        IAbility childAbility=new Child();
		//接口的引用指向实现类对象
		childAbility.eating();
		childAbility.studying();
		
        IAbility DogAbility=new Dog();
		DogAbility.eating();
		DogAbility.playing();


    }
}


interface IAbility{
    
    public void eating();
	public void playing();
	public void studying();
}



class Child implements IAbility{
    public void eating(){
        System.out.println("小孩吃米饭");
    }
    public void playing(){
        System.out.println("小孩做游戏");
    }
	public void studying(){
        System.out.println("小孩需要学习");
    }
}


class Dog implements IAbility{
    public void eating(){
        System.out.println("狗吃狗粮");
    }
    public void playing(){
        System.out.println("狗猫赛跑");
    }
	
	public void studying(){
        System.out.println("狗需要训练");
    }
}
