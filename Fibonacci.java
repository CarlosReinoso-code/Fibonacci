package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a1=1, a2=1;
		
		for (int i=1;  i<=46; i++) {
			
			System.out.println("(" +i +")" +a1);
			System.out.println("(" +i +")" +a2);
			
			a1 = a1 + a2;
			a2 = a1 + a2;
			
		}

	}

}
