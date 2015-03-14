import java.util.Scanner;

public class SecondProgramm{
	
	static Scanner skaner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.print("Wpisz cyfre: ");
		
		if(skaner.hasNextInt()){
			
			int Cyfra = skaner.nextInt();
			System.out.println("Wpisana liczba to: " + Cyfra);
		}
		else{
			System.out.print("Wpisana jest zla liczba");
		
		}
		
	}
}