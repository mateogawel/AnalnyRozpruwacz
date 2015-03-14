public class Fibonacci{
	
	static void fibonacci(int liczba){
		int [] wynik = new int[liczba];
		
		for(int i=0; i<liczba; i++){
			
			if(i == 0 || i == 1){
				wynik[i] = 1;
			}
			else{
			wynik[i] = wynik[i-1] + wynik[i-2];
			}
			System.out.print(wynik[i] + " ");
		}
	}
	
	public static void main (String[] args){
		
		fibonacci(5);
	}
}