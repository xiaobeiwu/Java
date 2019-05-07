public class AnimalDemo {
    public static void main(String [] args){
        //父类的引用变量可以引用其子类的对象
        Animal animal1=new Dog("毛毛");
        animal1.eating();
        Animal animal2=new Cat("奶糖");
        animal2.eating();
    }
}
class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    //这是一个通用的方法，通用的方法实现没有太大的意义，只是告诉其子类去实现它
    public void eating(){
    }
    public String toString(){
        return name;
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    //对父类的方法进行重写
    public void eating(){
        System.out.println(super.toString()+"吃骨头");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    //对父类的方法进行重写
    public void eating(){
        System.out.println(super.toString()+"吃鱼");
    }
}