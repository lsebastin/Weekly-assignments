package practiceweek1;

public class Firstweekassignement {public static void main(String[] args) {
	int n = 17;
	boolean prime = true;
	for (int i = 2; i <n; i++) {
		if (n % i ==0) {
			prime = false;
			break;
		}
	}
	 if (prime) {
         System.out.println(n + " is Prime number");
     } else {
         System.out.println(n + " is Not Prime number");
     }
	
}
}
