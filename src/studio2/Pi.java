package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfWins = 0;
		
		for(int i = 0; i < 100000; i++) {
			
			double x = Math.random();
			double y = Math.random();
			double distance = Math.sqrt(x*x + (y*y));
			if(distance < 1) {
				numberOfWins++;
			}
		}
		
		System.out.println(numberOfWins);
		
		double pi = numberOfWins / (100000.0/4.0);
		
		System.out.println(pi);
		
	

	}

}
