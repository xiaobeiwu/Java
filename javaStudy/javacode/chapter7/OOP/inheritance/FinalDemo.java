public class FinalDemo {
    public static void main(String []args){
        A a=new A();
        a.shownumber1();
        B b=new B();
        b.shownumber2();
        final A a1=new A();//a1只能指向new A的内存地址
       /* a1=new A();*/  //中途不能改变指向
        a1.number2=5;
        a1.shownumber2();

    }
}
/*final*/ class A {  //常量类是不能被继承的
    public final int number1=1;//常量
    public int number2=2;
    public void shownumber1(){
        /*number1++;*/ //常量是不能被修改的
        System.out.println(number1);
    }
    public /*final*/ void shownumber2(){//子类不能对父类中的常量方法进行重写
        System.out.println(number2);
    }
}
class B extends A{
    @Override
    public void shownumber2() {
        System.out.println(number2);
    }
}
