public class CompanyDemo {
    public static void main(String [] args){

        IWork wu = new Testengineer("Amy",2,32);
        test(wu);

        IWork xu = new Developers("Jack",9,34);
        test(xu);
    }

    public static void test(IWork anyone){
        anyone.working();
    }
}

class Employeeinfo{
    public String name;
    public int number;
    public int age;
    public Employeeinfo(String name,int number,int age){
        this.name=name;
        this.number=number;
        this.age=age;
    }
    public String toString(){
        return "name="+name+",number="+number+",age="+age;
    }

}

interface IWork{
    public abstract void working();
}
class Developers extends Employeeinfo implements IWork{
    public Developers(String name,int number,int age){
    super(name,number,age);
    }
    public void working(){
        System.out.println(super.toString());
        System.out.println("开发负责开发产品");
    }
}
class Testengineer extends Employeeinfo implements IWork{
    public Testengineer(String name,int number,int age){
        super(name,number,age);
    }
    public void working(){
        System.out.println(super.toString());
        System.out.println("测试负责测试产品");
    }
}



