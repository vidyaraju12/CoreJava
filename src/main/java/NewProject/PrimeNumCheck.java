package NewProject;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =13;
		boolean flag=true;
		
		for (int i=2;i<num;i++) {
		
			int rem = num%i;
			if (rem==0) {
				System.out.println("no. is not prime");
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("no. is prime");
		}
		
		
	}

}
