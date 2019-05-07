//定义一个雇员类
public class Employee{
	
	//定义属性
	public String name;
	public int age;
	
	//功能一：返回个人信息
	public String toString (){
		return"雇员的姓名："+name+",年龄："+age;
	}
	
	//功能二：统计指定字符串中要查询字符串出现的次数
	
/* 	源字符串：src:朋友啊朋友，你是我最好的朋友
	目的字符串：dst：朋友
	indexof("朋友")
 */
	public int count(String src,String dst){
		int cnt=0;
		int index;
		index=src.indexOf(dst);
		while(index!=-1){
			cnt++;
			index+=dst.length();
			index=src.indexOf(dst,index);
		}	
		return cnt;
	
	}
	
	public static void main(String [] args){
		Employee emp = new Employee();
		emp.name="Amy";
		emp.age=30;
		System.out.println(emp.toString());
		
		String src="朋友啊朋友，你是我最好的朋友";
	    String dst="朋友";
		int num=emp.count(src,dst);
		System.out.println(dst+"出现的次数是："+num+"次");
	
	
	}
	
	
}