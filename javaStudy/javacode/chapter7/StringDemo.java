public class StringDemo{
	public static void main(String [] args){
		String str="You are my best friend!";
		char num=str.charAt(2);
		System.out.println(num);
		System.out.println(str.compareTo("you"));
		System.out.println(str.compareToIgnoreCase("you are my best friend!"));
		System.out.println(str.concat(" darling!"));
		System.out.println(str+" Believe me!");
		System.out.println(str);
		System.out.println(str.contains("are"));
		System.out.println(str.endsWith("me!"));
		System.out.println(str.endsWith("friend!"));
		System.out.println(str.equals("You are my best friend!"));
		String strr="you are my best friend!";
		System.out.println(str==strr);
		System.out.println(str.equalsIgnoreCase(strr));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("are"));
		System.out.println(str.lastIndexOf("r"));
		System.out.println(str.indexOf("r",8));
		System.out.println(str.length());
		System.out.println(str.replace('e','x'));
		System.out.println(str);
		
		
		
		
		
		
	}
	
	
	
}