package CollatzConjecture;

import java.util.Scanner;

public class CollatzConjecture {
	
	public static void problem(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a starting integer");
		int n;
		int steps = 0;
		n = input.nextInt();
		
		
		while (n != 1){
			if(n %2 == 0){
				//even number
				System.out.println(n);
				n = n /2;
				
			}
			
		else if(n %2 != 0){
			//odd number
			System.out.println(n);
			n = (n*3)+1;
			
		}
			steps++;
		}
		System.out.println(1);
		System.out.println("steps: " + steps);

	}
	
	
	
	
	
	public static void main(String[] args) {
		problem();


	}

}
