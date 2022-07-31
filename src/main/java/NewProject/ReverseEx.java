package NewProject;

public class ReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World";
		
		String result = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			
			char ch = str.charAt(i);
			result = result + ch;
		}
		
		System.out.println("Result is "+ result);
		
		//reverse a number 
		
		int num = 456789;
		int res =0;
		
		while(num>0) {
		
			int rem = num%10; //reainder =9
		res = res*10+rem;  //(9*10) +8
		
		num = num/10; //45678
		
	}
System.out.println("result is" + res);
}
}
