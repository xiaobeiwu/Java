//teacher类的建模
public class TeacherDemo1{
	public static void main(String [] args){
		Teacher t = new Teacher();
		//t.name="xubao";
		t.setName("xubao");
		System.out.println(t.getname());
		t.setage(2);
		System.out.println(t.getage());
	}

}
class Teacher{
	//属性（字段）
	private String name;
	private int age;

	public void setName(String tname){
		name=tname;
	}	
	public String getname(){
		return name;
	}

	public void setage(int Tage){
		if(Tage<22){
			System.out.println("年龄太小，不符合要求！");
			age=22;
		} else{
			age=Tage;
		}
	}
	public int getage(){
		return age;
	}
}
	

