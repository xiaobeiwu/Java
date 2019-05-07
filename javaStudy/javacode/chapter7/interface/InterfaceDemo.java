public class InterfaceDemo {
    public static void main(String [] args){
       /* Person p=new Person();
        Child child=new Child();
        Dog dog=new Dog();
        p.feed(child);
        p.teach(child);
        p.feed(dog);
        p.teach(dog);*/
        Person p=new Person();
        IAbility childAbility1=new Child();
        IPlay childAbility2=new Child();
        p.feed(childAbility1);
        p.teach(childAbility2);

        IAbility DogAbility1=new Dog();
        IPlay DogAbility2=new Dog();
        p.feed(DogAbility1);
        p.teach(DogAbility2);

    }
}
class Person{
    /*public void feed(Child child){
        child.eating();
    }
    public void feed(Dog dog){
        dog.eating();
    } */
    //接口的引用变量可以引用其实现类的对象
    //接口实现了多态
    public void feed(IAbility ability){
        System.out.println("喂：");
        ability.eating();//动态绑定
    }
    public void teach(IPlay play){
        System.out.println("教：");
        play.playing();//动态绑定
    }
}
interface IAbility{
    //接口中只能放公有的静态常量和抽象方法
    //public static final int number=1;
    public abstract void eating();
}
interface IPlay{
    //接口中只能放公有的静态常量和抽象方法
    public abstract void playing();
	
}

//小孩吃饭
class Child implements IAbility,IPlay{
    public void eating(){
        System.out.println("小孩吃米饭");
    }
    public void playing(){
        System.out.println("小孩做游戏");
    }
}

//狗吃狗粮
class Dog implements IAbility,IPlay{
    public void eating(){
        System.out.println("狗吃狗粮");
    }
    public void playing(){
        System.out.println("狗猫赛跑");
    }
}
