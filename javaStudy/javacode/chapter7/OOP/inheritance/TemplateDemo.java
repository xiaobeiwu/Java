//设计模式之模板方法
public class TemplateDemo {
    public static void main(String [] args){
        Worker t1=new MathTeacher();
        t1.working();
        Worker t2=new ChineseTeacher();
        t2.working();
    }

}

abstract class Worker{
    //老师工作的方法（它是一个流程）
    public void prepare(){
        System.out.println("准备课件");
    }

    public abstract void teaching();

    public void exam(){
        System.out.println("考试测评");
        System.out.println();
    }
    //模板方法（工作流程）
    public void working(){
        //教学前准备
        prepare();
        //教学工作
        teaching();
        //教学结果测评
        exam();
    }
}
class MathTeacher extends Worker{
    //对抽象父类的抽象方法进行实现
    public void teaching() {
        System.out.println("数学教学");
    }
}
class ChineseTeacher extends Worker{
    //对抽象父类的抽象方法进行实现
    public void teaching(){
        System.out.println("汉语教学");
    }
}