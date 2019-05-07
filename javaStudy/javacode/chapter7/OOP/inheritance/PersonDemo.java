public class PersonDemo {
    public static void main(String [] args){
        Student stu=new Student("Amy",2,89);
        System.out.println(stu);
        stu.eating();
        stu.walking();
        stu.studying();
        stu.exam();



    }
}
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eating()
    {
        System.out.println("I'm eating..");
    }
    public void walking(){
        System.out.println("I'm walking..");
    }
    public String toString(){
        return "姓名="+name+",年龄="+this.age;
    }
}
class Student extends Person {
    private double score;
    public Student(String name,int age,double score){
        super(name,age);
        this.score=score;
    }
    public String toString(){

        return super.toString()+",分数="+score;
    }
    public void studying(){
        System.out.println("I'm going to school");
    }
    public void exam(){
        System.out.println("I'm taking a exam");
    }

}
